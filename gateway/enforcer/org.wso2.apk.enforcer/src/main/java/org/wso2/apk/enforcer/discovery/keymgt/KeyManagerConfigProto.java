// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/keymgt/key_manager_config.proto

package org.wso2.apk.enforcer.discovery.keymgt;

public final class KeyManagerConfigProto {
  private KeyManagerConfigProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_keymgt_KeyManagerConfig_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_keymgt_KeyManagerConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n.wso2/discovery/keymgt/key_manager_conf" +
      "ig.proto\022\025wso2.discovery.keymgt\"l\n\020KeyMa" +
      "nagerConfig\022\014\n\004name\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022" +
      "\017\n\007enabled\030\003 \001(\010\022\024\n\014tenantDomain\030\004 \001(\t\022\025" +
      "\n\rconfiguration\030\005 \001(\tB\206\001\n&org.wso2.apk.e" +
      "nforcer.discovery.keymgtB\025KeyManagerConf" +
      "igProtoP\001ZCgithub.com/envoyproxy/go-cont" +
      "rol-plane/wso2/discovery/keymgt;keymgtb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_keymgt_KeyManagerConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_keymgt_KeyManagerConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_keymgt_KeyManagerConfig_descriptor,
        new java.lang.String[] { "Name", "Type", "Enabled", "TenantDomain", "Configuration", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
