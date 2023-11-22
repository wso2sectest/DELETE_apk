// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/analytics_publisher.proto

package org.wso2.apk.enforcer.discovery.config.enforcer;

public interface AnalyticsPublisherOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.AnalyticsPublisher)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  int getConfigPropertiesCount();
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  boolean containsConfigProperties(
      java.lang.String key);
  /**
   * Use {@link #getConfigPropertiesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getConfigProperties();
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getConfigPropertiesMap();
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */

  java.lang.String getConfigPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */

  java.lang.String getConfigPropertiesOrThrow(
      java.lang.String key);

  /**
   * <pre>
   * Analytics type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Analytics type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();
}
