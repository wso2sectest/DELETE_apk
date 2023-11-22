/*
 * Copyright (c) 2021, WSO2 LLC. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 LLC. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.apk.enforcer.analytics;

import org.apache.commons.lang3.StringUtils;
import org.wso2.apk.enforcer.commons.analytics.collectors.AnalyticsCustomDataProvider;
import org.wso2.apk.enforcer.commons.analytics.collectors.AnalyticsDataProvider;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.API;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.Application;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.Error;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.ExtendedAPI;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.Latencies;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.MetaInfo;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.Operation;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.Target;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.enums.EventCategory;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.enums.FaultCategory;
import org.wso2.apk.enforcer.commons.analytics.publishers.dto.enums.FaultSubCategory;
import org.wso2.apk.enforcer.commons.model.AuthenticationContext;
import org.wso2.apk.enforcer.commons.model.RequestContext;
import org.wso2.apk.enforcer.commons.model.ResourceConfig;
import org.wso2.apk.enforcer.config.ConfigHolder;
import org.wso2.apk.enforcer.constants.APIConstants;
import org.wso2.apk.enforcer.constants.AnalyticsConstants;
import org.wso2.apk.enforcer.constants.GeneralErrorCodeConstants;
import org.wso2.apk.enforcer.discovery.service.websocket.WebSocketFrameRequest;
import org.wso2.apk.enforcer.util.FilterUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Generate FaultDTO for the errors generated from enforcer.
 */
public class ChoreoFaultAnalyticsProvider implements AnalyticsDataProvider {

    private final RequestContext requestContext;
    private static final Map<String, Object> customProperties = new HashMap<>();
    private final boolean isWebsocketUpgradeRequest;

    public ChoreoFaultAnalyticsProvider(RequestContext requestContext) {

        this.requestContext = requestContext;
        // sets all the headers available in the request context
        customProperties.putAll(requestContext.getHeaders());
        isWebsocketUpgradeRequest =
                APIConstants.WEBSOCKET.equals(requestContext.getHeaders().get(APIConstants.UPGRADE_HEADER));
    }

    @Override
    public EventCategory getEventCategory() {

        return EventCategory.FAULT;
    }

    @Override
    public boolean isAnonymous() {

        return requestContext.getAuthenticationContext() == null || StringUtils.isEmpty(requestContext.getAuthenticationContext().getApplicationUUID());
    }

    @Override
    public boolean isAuthenticated() {

        AuthenticationContext authenticationContext = requestContext.getAuthenticationContext();
        return authenticationContext != null && authenticationContext.isAuthenticated();
    }

    @Override
    public FaultCategory getFaultType() {

        if (requestContext.getProperties().containsKey(APIConstants.MessageFormat.STATUS_CODE)) {
            int statusCode =
                    Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.STATUS_CODE).toString());
            switch (statusCode) {
                case 401:
                case 403:
                    // For Denied policies, the status code remains 403, but it is categorized
                    // under throttling
                    if (requestContext.getProperties().containsKey(APIConstants.MessageFormat.ERROR_CODE)) {
                        if (AnalyticsConstants.BLOCKED_ERROR_CODE == Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.ERROR_CODE).toString())) {
                            return FaultCategory.THROTTLED;
                        }
                    }
                    return FaultCategory.AUTH;
                case 429:
                    return FaultCategory.THROTTLED;
                case 503:
                    // for API Blocked Scenario, it is considered as an Auth Failure although the status code
                    // is 503
                    if (requestContext.getProperties().containsKey(APIConstants.MessageFormat.ERROR_CODE) && GeneralErrorCodeConstants.API_BLOCKED_CODE == Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.ERROR_CODE).toString())) {
                        return FaultCategory.AUTH;
                    }
                    return FaultCategory.OTHER;
                default:
                    return FaultCategory.OTHER;
            }
        }
        return FaultCategory.OTHER;
    }

    @Override
    public API getApi() {

        ExtendedAPI api = new ExtendedAPI();
        String apiUUID = AnalyticsUtils.getAPIId(requestContext);
        api.setApiId(apiUUID);
        api.setApiCreator(AnalyticsUtils.getAPIProvider(apiUUID));
        api.setApiType(requestContext.getMatchedAPI().getApiType());
        api.setApiName(requestContext.getMatchedAPI().getName());
        api.setApiVersion(requestContext.getMatchedAPI().getVersion());
        String tenantDomain = FilterUtils.getTenantDomainFromRequestURL(requestContext.getMatchedAPI().getBasePath());
        api.setApiCreatorTenantDomain(tenantDomain == null ? APIConstants.SUPER_TENANT_DOMAIN_NAME : tenantDomain);
        api.setOrganizationId(requestContext.getMatchedAPI().getOrganizationId());
        api.setEnvironmentId(requestContext.getMatchedAPI().getEnvironment());
        return api;
    }

    @Override
    public Application getApplication() {

        AuthenticationContext authContext = AnalyticsUtils.getAuthenticationContext(requestContext);
        Application application = new Application();
        // Default Value would be PRODUCTION
        application.setKeyType(requestContext.getMatchedAPI().getEnvType());
        application.setApplicationId(AnalyticsUtils.setDefaultIfNull(authContext.getApplicationUUID()));
        application.setApplicationOwner(AnalyticsUtils.setDefaultIfNull(authContext.getSubscriber()));
        application.setApplicationName(AnalyticsUtils.setDefaultIfNull(authContext.getApplicationName()));
        return application;
    }

    @Override
    public Operation getOperation() {
        // This could be null if  OPTIONS request comes
        if (requestContext.getMatchedResourcePaths() != null) {
            Operation operation = new Operation();
            if (isWebsocketUpgradeRequest) {
                operation.setApiMethod(WebSocketFrameRequest.MessageDirection.HANDSHAKE.name());
                operation.setApiResourceTemplate(AnalyticsConstants.WEBSOCKET_HANDSHAKE_RESOURCE_PREFIX + requestContext.getMatchedResourcePaths().get(0).getPath());
                return operation;
            }
            operation.setApiMethod(requestContext.getMatchedResourcePaths().get(0).getMethod().name());
            ArrayList<String> resourceTemplate = new ArrayList<>();
            for (ResourceConfig resourceConfig : requestContext.getMatchedResourcePaths()) {
                resourceTemplate.add(resourceConfig.getPath());
            }
            operation.setApiResourceTemplate(String.join(",", resourceTemplate));
            return operation;
        }
        return null;
    }

    @Override
    public Target getTarget() {

        Target target = new Target();
        target.setResponseCacheHit(false);
        target.setTargetResponseCode(Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.STATUS_CODE).toString()));
        // Destination is not included in the fault event scenario
        return target;
    }

    @Override
    public Latencies getLatencies() {
        // Latencies information are not required.

        Latencies latencies = new Latencies();
        latencies.setResponseLatency(System.currentTimeMillis()-getRequestTime());
        return latencies;
    }

    @Override
    public MetaInfo getMetaInfo() {

        MetaInfo metaInfo = new MetaInfo();
        metaInfo.setRegionId(ConfigHolder.getInstance().getEnvVarConfig().getEnforcerRegionId());
        metaInfo.setGatewayType(AnalyticsConstants.GATEWAY_LABEL);
        metaInfo.setCorrelationId(requestContext.getRequestID());
        return metaInfo;
    }

    @Override
    public int getProxyResponseCode() {

        return Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.STATUS_CODE).toString());
    }

    @Override
    public int getTargetResponseCode() {

        return Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.STATUS_CODE).toString());
    }

    @Override
    public long getRequestTime() {

        return requestContext.getRequestTimeStamp();
    }

    @Override
    public Error getError(FaultCategory faultCategory) {
        // All the messages should have the error_code
        if (requestContext.getProperties().containsKey(APIConstants.MessageFormat.ERROR_CODE)) {
            FaultCodeClassifier faultCodeClassifier =
                    new FaultCodeClassifier(Integer.parseInt(requestContext.getProperties().get(APIConstants.MessageFormat.ERROR_CODE).toString()));
            FaultSubCategory faultSubCategory = faultCodeClassifier.getFaultSubCategory(faultCategory);
            Error error = new Error();
            error.setErrorCode(faultCodeClassifier.getErrorCode());
            error.setErrorMessage(faultSubCategory);
            return error;
        }
        return null;
    }

    @Override
    public String getUserAgentHeader() {

        Map<String, String> headers = requestContext.getHeaders();
        // UserAgent header is not validated for fault events.
        return AnalyticsUtils.setDefaultIfNull(headers.get("user-agent"));
    }

    @Override
    public String getUserName() {

        return null;
    }

    @Override
    public String getEndUserIP() {
        // EndUserIP is not validated for fault events.
        return null;
    }

    @Override
    public Map<String, Object> getProperties() {

        Map<String,Object> map = new HashMap<>();
        // Adding Gateway URL
        String gatewayUrl = requestContext.getHeaders().get(AnalyticsConstants.GATEWAY_URL);
        if (!StringUtils.isNotEmpty(gatewayUrl)) {
            String protocol = requestContext.getHeaders().getOrDefault(AnalyticsConstants.X_FORWARD_PROTO_HEADER,
                    APIConstants.HTTPS_PROTOCOL);
            String port = requestContext.getHeaders().getOrDefault(AnalyticsConstants.X_FORWARD_PORT_HEADER, "");
            String host = requestContext.getMatchedAPI().getVhost();
            String path = requestContext.getRequestPath();
            gatewayUrl = protocol.concat("://").concat(host).concat(":").concat(port).concat(path);
        }
        map.put(AnalyticsConstants.GATEWAY_URL, gatewayUrl);
        AnalyticsCustomDataProvider customDataProvider = AnalyticsFilter.getAnalyticsCustomDataProvider();
        if (customDataProvider != null && customDataProvider.getCustomProperties(customProperties) != null) {
            Map<String, Object> retrievedProperties = customDataProvider.getCustomProperties(customProperties);
            map.putAll(retrievedProperties);
        } else {
            map.putAll(customProperties);
        }
        return map;
    }
}
