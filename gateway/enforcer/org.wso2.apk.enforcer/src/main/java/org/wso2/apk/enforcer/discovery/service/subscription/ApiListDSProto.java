// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/subscription/apids.proto

package org.wso2.apk.enforcer.discovery.service.subscription;

public final class ApiListDSProto {
  private ApiListDSProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n/wso2/discovery/service/subscription/ap" +
      "ids.proto\022\036discovery.service.subscriptio" +
      "n\032*envoy/service/discovery/v3/discovery." +
      "proto2\215\001\n\027ApiListDiscoveryService\022r\n\rStr" +
      "eamApiList\022,.envoy.service.discovery.v3." +
      "DiscoveryRequest\032-.envoy.service.discove" +
      "ry.v3.DiscoveryResponse\"\000(\0010\001B\227\001\n4org.ws" +
      "o2.apk.enforcer.discovery.service.subscr" +
      "iptionB\016ApiListDSProtoP\001ZJgithub.com/env" +
      "oyproxy/go-control-plane/wso2/discovery/" +
      "service/subscription\210\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor(),
        });
    io.envoyproxy.envoy.service.discovery.v3.DiscoveryProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
