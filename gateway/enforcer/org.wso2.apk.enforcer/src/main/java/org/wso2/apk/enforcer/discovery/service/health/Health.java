// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/health/service/health.proto

package org.wso2.apk.enforcer.discovery.service.health;

/**
 * <pre>
 * [#protodoc-title: Health]
 * </pre>
 *
 * Protobuf service {@code grpc.health.v1.Health}
 */
public  abstract class Health
    implements com.google.protobuf.Service {
  protected Health() {}

  public interface Interface {
    /**
     * <code>rpc Check(.grpc.health.v1.HealthCheckRequest) returns (.grpc.health.v1.HealthCheckResponse);</code>
     */
    public abstract void check(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
        com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done);

    /**
     * <code>rpc Watch(.grpc.health.v1.HealthCheckRequest) returns (stream .grpc.health.v1.HealthCheckResponse);</code>
     */
    public abstract void watch(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
        com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done);

  }

  public static com.google.protobuf.Service newReflectiveService(
      final Interface impl) {
    return new Health() {
      @java.lang.Override
      public  void check(
          com.google.protobuf.RpcController controller,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
          com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done) {
        impl.check(controller, request, done);
      }

      @java.lang.Override
      public  void watch(
          com.google.protobuf.RpcController controller,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
          com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done) {
        impl.watch(controller, request, done);
      }

    };
  }

  public static com.google.protobuf.BlockingService
      newReflectiveBlockingService(final BlockingInterface impl) {
    return new com.google.protobuf.BlockingService() {
      public final com.google.protobuf.Descriptors.ServiceDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }

      public final com.google.protobuf.Message callBlockingMethod(
          com.google.protobuf.Descriptors.MethodDescriptor method,
          com.google.protobuf.RpcController controller,
          com.google.protobuf.Message request)
          throws com.google.protobuf.ServiceException {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.callBlockingMethod() given method descriptor for " +
            "wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return impl.check(controller, (org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest)request);
          case 1:
            return impl.watch(controller, (org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest)request);
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getRequestPrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getRequestPrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest.getDefaultInstance();
          case 1:
            return org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

      public final com.google.protobuf.Message
          getResponsePrototype(
          com.google.protobuf.Descriptors.MethodDescriptor method) {
        if (method.getService() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "Service.getResponsePrototype() given method " +
            "descriptor for wrong service type.");
        }
        switch(method.getIndex()) {
          case 0:
            return org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance();
          case 1:
            return org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance();
          default:
            throw new java.lang.AssertionError("Can't get here.");
        }
      }

    };
  }

  /**
   * <code>rpc Check(.grpc.health.v1.HealthCheckRequest) returns (.grpc.health.v1.HealthCheckResponse);</code>
   */
  public abstract void check(
      com.google.protobuf.RpcController controller,
      org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
      com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done);

  /**
   * <code>rpc Watch(.grpc.health.v1.HealthCheckRequest) returns (stream .grpc.health.v1.HealthCheckResponse);</code>
   */
  public abstract void watch(
      com.google.protobuf.RpcController controller,
      org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
      com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done);

  public static final
      com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptor() {
    return org.wso2.apk.enforcer.discovery.service.health.HealthProto.getDescriptor().getServices().get(0);
  }
  public final com.google.protobuf.Descriptors.ServiceDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }

  public final void callMethod(
      com.google.protobuf.Descriptors.MethodDescriptor method,
      com.google.protobuf.RpcController controller,
      com.google.protobuf.Message request,
      com.google.protobuf.RpcCallback<
        com.google.protobuf.Message> done) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.callMethod() given method descriptor for wrong " +
        "service type.");
    }
    switch(method.getIndex()) {
      case 0:
        this.check(controller, (org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest)request,
          com.google.protobuf.RpcUtil.<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse>specializeCallback(
            done));
        return;
      case 1:
        this.watch(controller, (org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest)request,
          com.google.protobuf.RpcUtil.<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse>specializeCallback(
            done));
        return;
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getRequestPrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getRequestPrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest.getDefaultInstance();
      case 1:
        return org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public final com.google.protobuf.Message
      getResponsePrototype(
      com.google.protobuf.Descriptors.MethodDescriptor method) {
    if (method.getService() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "Service.getResponsePrototype() given method " +
        "descriptor for wrong service type.");
    }
    switch(method.getIndex()) {
      case 0:
        return org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance();
      case 1:
        return org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance();
      default:
        throw new java.lang.AssertionError("Can't get here.");
    }
  }

  public static Stub newStub(
      com.google.protobuf.RpcChannel channel) {
    return new Stub(channel);
  }

  public static final class Stub extends org.wso2.apk.enforcer.discovery.service.health.Health implements Interface {
    private Stub(com.google.protobuf.RpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.RpcChannel channel;

    public com.google.protobuf.RpcChannel getChannel() {
      return channel;
    }

    public  void check(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
        com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.class,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance()));
    }

    public  void watch(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request,
        com.google.protobuf.RpcCallback<org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse> done) {
      channel.callMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance(),
        com.google.protobuf.RpcUtil.generalizeCallback(
          done,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.class,
          org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance()));
    }
  }

  public static BlockingInterface newBlockingStub(
      com.google.protobuf.BlockingRpcChannel channel) {
    return new BlockingStub(channel);
  }

  public interface BlockingInterface {
    public org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse check(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request)
        throws com.google.protobuf.ServiceException;

    public org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse watch(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request)
        throws com.google.protobuf.ServiceException;
  }

  private static final class BlockingStub implements BlockingInterface {
    private BlockingStub(com.google.protobuf.BlockingRpcChannel channel) {
      this.channel = channel;
    }

    private final com.google.protobuf.BlockingRpcChannel channel;

    public org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse check(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(0),
        controller,
        request,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance());
    }


    public org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse watch(
        com.google.protobuf.RpcController controller,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckRequest request)
        throws com.google.protobuf.ServiceException {
      return (org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse) channel.callBlockingMethod(
        getDescriptor().getMethods().get(1),
        controller,
        request,
        org.wso2.apk.enforcer.discovery.service.health.HealthCheckResponse.getDefaultInstance());
    }

  }

  // @@protoc_insertion_point(class_scope:grpc.health.v1.Health)
}

