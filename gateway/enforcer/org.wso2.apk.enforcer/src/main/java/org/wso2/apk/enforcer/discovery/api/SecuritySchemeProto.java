// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/security_scheme.proto

package org.wso2.apk.enforcer.discovery.api;

public final class SecuritySchemeProto {
  private SecuritySchemeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_SecurityScheme_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_SecurityScheme_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_SecurityList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_SecurityList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_api_Scopes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_api_Scopes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(wso2/discovery/api/security_scheme.pro" +
      "to\022\022wso2.discovery.api\"P\n\016SecurityScheme" +
      "\022\026\n\016definitionName\030\001 \001(\t\022\014\n\004type\030\002 \001(\t\022\014" +
      "\n\004name\030\003 \001(\t\022\n\n\002in\030\004 \001(\t\"\240\001\n\014SecurityLis" +
      "t\022B\n\tscopeList\030\001 \003(\0132/.wso2.discovery.ap" +
      "i.SecurityList.ScopeListEntry\032L\n\016ScopeLi" +
      "stEntry\022\013\n\003key\030\001 \001(\t\022)\n\005value\030\002 \001(\0132\032.ws" +
      "o2.discovery.api.Scopes:\0028\001\"\030\n\006Scopes\022\016\n" +
      "\006scopes\030\001 \003(\tB{\n#org.wso2.apk.enforcer.d" +
      "iscovery.apiB\023SecuritySchemeProtoP\001Z=git" +
      "hub.com/envoyproxy/go-control-plane/wso2" +
      "/discovery/api;apib\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_api_SecurityScheme_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_api_SecurityScheme_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_SecurityScheme_descriptor,
        new java.lang.String[] { "DefinitionName", "Type", "Name", "In", });
    internal_static_wso2_discovery_api_SecurityList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_wso2_discovery_api_SecurityList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_SecurityList_descriptor,
        new java.lang.String[] { "ScopeList", });
    internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_descriptor =
      internal_static_wso2_discovery_api_SecurityList_descriptor.getNestedTypes().get(0);
    internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_SecurityList_ScopeListEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_wso2_discovery_api_Scopes_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_wso2_discovery_api_Scopes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_api_Scopes_descriptor,
        new java.lang.String[] { "Scopes", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
