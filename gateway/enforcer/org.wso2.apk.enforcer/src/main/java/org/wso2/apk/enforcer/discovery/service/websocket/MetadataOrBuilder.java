// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/websocket/frame_service.proto

package org.wso2.apk.enforcer.discovery.service.websocket;

public interface MetadataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  int getExtAuthzMetadataCount();
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  boolean containsExtAuthzMetadata(
      java.lang.String key);
  /**
   * Use {@link #getExtAuthzMetadataMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String>
  getExtAuthzMetadata();
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.String>
  getExtAuthzMetadataMap();
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */

  java.lang.String getExtAuthzMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue);
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */

  java.lang.String getExtAuthzMetadataOrThrow(
      java.lang.String key);
}
