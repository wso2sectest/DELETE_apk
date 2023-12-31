// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/cert.proto

package org.wso2.apk.enforcer.discovery.config.enforcer;

public interface CertStoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:wso2.discovery.config.enforcer.CertStore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Path to the certificate store. Ex: keystore jks
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   * <pre>
   * Path to the certificate store. Ex: keystore jks
   * </pre>
   *
   * <code>string location = 1;</code>
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString
      getLocationBytes();

  /**
   * <pre>
   * Certificate store type
   * Ex: jks
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <pre>
   * Certificate store type
   * Ex: jks
   * </pre>
   *
   * <code>string type = 2;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <pre>
   * Certificate store password
   * </pre>
   *
   * <code>string password = 3;</code>
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   * <pre>
   * Certificate store password
   * </pre>
   *
   * <code>string password = 3;</code>
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString
      getPasswordBytes();
}
