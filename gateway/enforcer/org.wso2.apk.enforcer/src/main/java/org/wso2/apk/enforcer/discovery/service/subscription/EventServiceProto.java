// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/apkmgt/eventds.proto

package org.wso2.apk.enforcer.discovery.service.subscription;

public final class EventServiceProto {
  private EventServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_discovery_service_apkmgt_Request_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_discovery_service_apkmgt_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n+wso2/discovery/service/apkmgt/eventds." +
      "proto\022\030discovery.service.apkmgt\032\'wso2/di" +
      "scovery/subscription/event.proto\"\030\n\007Requ" +
      "est\022\r\n\005event\030\001 \001(\t2o\n\022EventStreamService" +
      "\022Y\n\014StreamEvents\022!.discovery.service.apk" +
      "mgt.Request\032\".wso2.discovery.subscriptio" +
      "n.Event\"\0000\001B\232\001\n4org.wso2.apk.enforcer.di" +
      "scovery.service.subscriptionB\021EventServi" +
      "ceProtoP\001ZJgithub.com/envoyproxy/go-cont" +
      "rol-plane/wso2/discovery/service/subscri" +
      "ption\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.apk.enforcer.discovery.subscription.EventProto.getDescriptor(),
        });
    internal_static_discovery_service_apkmgt_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_discovery_service_apkmgt_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_discovery_service_apkmgt_Request_descriptor,
        new java.lang.String[] { "Event", });
    org.wso2.apk.enforcer.discovery.subscription.EventProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
