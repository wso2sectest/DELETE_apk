// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/api_authentication.proto

package org.wso2.apk.enforcer.discovery.api;

public interface APIKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.api.APIKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name of the security scheme
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <pre>
   * name of the security scheme
   * </pre>
   *
   * <code>string name = 1;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   * location of the API key in request
   * </pre>
   *
   * <code>string in = 2;</code>
   * @return The in.
   */
  java.lang.String getIn();
  /**
   * <pre>
   * location of the API key in request
   * </pre>
   *
   * <code>string in = 2;</code>
   * @return The bytes for in.
   */
  com.google.protobuf.ByteString
      getInBytes();

  /**
   * <pre>
   * send the token to upstream
   * </pre>
   *
   * <code>bool sendTokenToUpstream = 3;</code>
   * @return The sendTokenToUpstream.
   */
  boolean getSendTokenToUpstream();
}
