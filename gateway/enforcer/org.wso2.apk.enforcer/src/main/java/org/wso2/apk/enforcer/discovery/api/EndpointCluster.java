// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/api/endpoint_cluster.proto

package org.wso2.apk.enforcer.discovery.api;

/**
 * <pre>
 * Holds endpoint URLs and the config
 * </pre>
 *
 * Protobuf type {@code wso2.discovery.api.EndpointCluster}
 */
public final class EndpointCluster extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.api.EndpointCluster)
    EndpointClusterOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EndpointCluster.newBuilder() to construct.
  private EndpointCluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EndpointCluster() {
    urls_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EndpointCluster();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private EndpointCluster(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              urls_ = new java.util.ArrayList<org.wso2.apk.enforcer.discovery.api.Endpoint>();
              mutable_bitField0_ |= 0x00000001;
            }
            urls_.add(
                input.readMessage(org.wso2.apk.enforcer.discovery.api.Endpoint.parser(), extensionRegistry));
            break;
          }
          case 18: {
            org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder subBuilder = null;
            if (config_ != null) {
              subBuilder = config_.toBuilder();
            }
            config_ = input.readMessage(org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(config_);
              config_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        urls_ = java.util.Collections.unmodifiableList(urls_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.apk.enforcer.discovery.api.EndpointClusterProto.internal_static_wso2_discovery_api_EndpointCluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.apk.enforcer.discovery.api.EndpointClusterProto.internal_static_wso2_discovery_api_EndpointCluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.apk.enforcer.discovery.api.EndpointCluster.class, org.wso2.apk.enforcer.discovery.api.EndpointCluster.Builder.class);
  }

  public static final int URLS_FIELD_NUMBER = 1;
  private java.util.List<org.wso2.apk.enforcer.discovery.api.Endpoint> urls_;
  /**
   * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.wso2.apk.enforcer.discovery.api.Endpoint> getUrlsList() {
    return urls_;
  }
  /**
   * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder> 
      getUrlsOrBuilderList() {
    return urls_;
  }
  /**
   * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
   */
  @java.lang.Override
  public int getUrlsCount() {
    return urls_.size();
  }
  /**
   * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.api.Endpoint getUrls(int index) {
    return urls_.get(index);
  }
  /**
   * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder getUrlsOrBuilder(
      int index) {
    return urls_.get(index);
  }

  public static final int CONFIG_FIELD_NUMBER = 2;
  private org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig config_;
  /**
   * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
   * @return Whether the config field is set.
   */
  @java.lang.Override
  public boolean hasConfig() {
    return config_ != null;
  }
  /**
   * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
   * @return The config.
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig getConfig() {
    return config_ == null ? org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.getDefaultInstance() : config_;
  }
  /**
   * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
   */
  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.api.EndpointClusterConfigOrBuilder getConfigOrBuilder() {
    return getConfig();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < urls_.size(); i++) {
      output.writeMessage(1, urls_.get(i));
    }
    if (config_ != null) {
      output.writeMessage(2, getConfig());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < urls_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, urls_.get(i));
    }
    if (config_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getConfig());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof org.wso2.apk.enforcer.discovery.api.EndpointCluster)) {
      return super.equals(obj);
    }
    org.wso2.apk.enforcer.discovery.api.EndpointCluster other = (org.wso2.apk.enforcer.discovery.api.EndpointCluster) obj;

    if (!getUrlsList()
        .equals(other.getUrlsList())) return false;
    if (hasConfig() != other.hasConfig()) return false;
    if (hasConfig()) {
      if (!getConfig()
          .equals(other.getConfig())) return false;
    }
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getUrlsCount() > 0) {
      hash = (37 * hash) + URLS_FIELD_NUMBER;
      hash = (53 * hash) + getUrlsList().hashCode();
    }
    if (hasConfig()) {
      hash = (37 * hash) + CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getConfig().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.wso2.apk.enforcer.discovery.api.EndpointCluster prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Holds endpoint URLs and the config
   * </pre>
   *
   * Protobuf type {@code wso2.discovery.api.EndpointCluster}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.api.EndpointCluster)
      org.wso2.apk.enforcer.discovery.api.EndpointClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.apk.enforcer.discovery.api.EndpointClusterProto.internal_static_wso2_discovery_api_EndpointCluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.apk.enforcer.discovery.api.EndpointClusterProto.internal_static_wso2_discovery_api_EndpointCluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.apk.enforcer.discovery.api.EndpointCluster.class, org.wso2.apk.enforcer.discovery.api.EndpointCluster.Builder.class);
    }

    // Construct using org.wso2.apk.enforcer.discovery.api.EndpointCluster.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getUrlsFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (urlsBuilder_ == null) {
        urls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        urlsBuilder_.clear();
      }
      if (configBuilder_ == null) {
        config_ = null;
      } else {
        config_ = null;
        configBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.apk.enforcer.discovery.api.EndpointClusterProto.internal_static_wso2_discovery_api_EndpointCluster_descriptor;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.api.EndpointCluster getDefaultInstanceForType() {
      return org.wso2.apk.enforcer.discovery.api.EndpointCluster.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.api.EndpointCluster build() {
      org.wso2.apk.enforcer.discovery.api.EndpointCluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.api.EndpointCluster buildPartial() {
      org.wso2.apk.enforcer.discovery.api.EndpointCluster result = new org.wso2.apk.enforcer.discovery.api.EndpointCluster(this);
      int from_bitField0_ = bitField0_;
      if (urlsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          urls_ = java.util.Collections.unmodifiableList(urls_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.urls_ = urls_;
      } else {
        result.urls_ = urlsBuilder_.build();
      }
      if (configBuilder_ == null) {
        result.config_ = config_;
      } else {
        result.config_ = configBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.wso2.apk.enforcer.discovery.api.EndpointCluster) {
        return mergeFrom((org.wso2.apk.enforcer.discovery.api.EndpointCluster)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.apk.enforcer.discovery.api.EndpointCluster other) {
      if (other == org.wso2.apk.enforcer.discovery.api.EndpointCluster.getDefaultInstance()) return this;
      if (urlsBuilder_ == null) {
        if (!other.urls_.isEmpty()) {
          if (urls_.isEmpty()) {
            urls_ = other.urls_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureUrlsIsMutable();
            urls_.addAll(other.urls_);
          }
          onChanged();
        }
      } else {
        if (!other.urls_.isEmpty()) {
          if (urlsBuilder_.isEmpty()) {
            urlsBuilder_.dispose();
            urlsBuilder_ = null;
            urls_ = other.urls_;
            bitField0_ = (bitField0_ & ~0x00000001);
            urlsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getUrlsFieldBuilder() : null;
          } else {
            urlsBuilder_.addAllMessages(other.urls_);
          }
        }
      }
      if (other.hasConfig()) {
        mergeConfig(other.getConfig());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      org.wso2.apk.enforcer.discovery.api.EndpointCluster parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.apk.enforcer.discovery.api.EndpointCluster) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<org.wso2.apk.enforcer.discovery.api.Endpoint> urls_ =
      java.util.Collections.emptyList();
    private void ensureUrlsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        urls_ = new java.util.ArrayList<org.wso2.apk.enforcer.discovery.api.Endpoint>(urls_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.api.Endpoint, org.wso2.apk.enforcer.discovery.api.Endpoint.Builder, org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder> urlsBuilder_;

    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public java.util.List<org.wso2.apk.enforcer.discovery.api.Endpoint> getUrlsList() {
      if (urlsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(urls_);
      } else {
        return urlsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public int getUrlsCount() {
      if (urlsBuilder_ == null) {
        return urls_.size();
      } else {
        return urlsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.Endpoint getUrls(int index) {
      if (urlsBuilder_ == null) {
        return urls_.get(index);
      } else {
        return urlsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder setUrls(
        int index, org.wso2.apk.enforcer.discovery.api.Endpoint value) {
      if (urlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlsIsMutable();
        urls_.set(index, value);
        onChanged();
      } else {
        urlsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder setUrls(
        int index, org.wso2.apk.enforcer.discovery.api.Endpoint.Builder builderForValue) {
      if (urlsBuilder_ == null) {
        ensureUrlsIsMutable();
        urls_.set(index, builderForValue.build());
        onChanged();
      } else {
        urlsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder addUrls(org.wso2.apk.enforcer.discovery.api.Endpoint value) {
      if (urlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlsIsMutable();
        urls_.add(value);
        onChanged();
      } else {
        urlsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder addUrls(
        int index, org.wso2.apk.enforcer.discovery.api.Endpoint value) {
      if (urlsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureUrlsIsMutable();
        urls_.add(index, value);
        onChanged();
      } else {
        urlsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder addUrls(
        org.wso2.apk.enforcer.discovery.api.Endpoint.Builder builderForValue) {
      if (urlsBuilder_ == null) {
        ensureUrlsIsMutable();
        urls_.add(builderForValue.build());
        onChanged();
      } else {
        urlsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder addUrls(
        int index, org.wso2.apk.enforcer.discovery.api.Endpoint.Builder builderForValue) {
      if (urlsBuilder_ == null) {
        ensureUrlsIsMutable();
        urls_.add(index, builderForValue.build());
        onChanged();
      } else {
        urlsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder addAllUrls(
        java.lang.Iterable<? extends org.wso2.apk.enforcer.discovery.api.Endpoint> values) {
      if (urlsBuilder_ == null) {
        ensureUrlsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, urls_);
        onChanged();
      } else {
        urlsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder clearUrls() {
      if (urlsBuilder_ == null) {
        urls_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        urlsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public Builder removeUrls(int index) {
      if (urlsBuilder_ == null) {
        ensureUrlsIsMutable();
        urls_.remove(index);
        onChanged();
      } else {
        urlsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.Endpoint.Builder getUrlsBuilder(
        int index) {
      return getUrlsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder getUrlsOrBuilder(
        int index) {
      if (urlsBuilder_ == null) {
        return urls_.get(index);  } else {
        return urlsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public java.util.List<? extends org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder> 
         getUrlsOrBuilderList() {
      if (urlsBuilder_ != null) {
        return urlsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(urls_);
      }
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.Endpoint.Builder addUrlsBuilder() {
      return getUrlsFieldBuilder().addBuilder(
          org.wso2.apk.enforcer.discovery.api.Endpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.Endpoint.Builder addUrlsBuilder(
        int index) {
      return getUrlsFieldBuilder().addBuilder(
          index, org.wso2.apk.enforcer.discovery.api.Endpoint.getDefaultInstance());
    }
    /**
     * <code>repeated .wso2.discovery.api.Endpoint urls = 1;</code>
     */
    public java.util.List<org.wso2.apk.enforcer.discovery.api.Endpoint.Builder> 
         getUrlsBuilderList() {
      return getUrlsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.api.Endpoint, org.wso2.apk.enforcer.discovery.api.Endpoint.Builder, org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder> 
        getUrlsFieldBuilder() {
      if (urlsBuilder_ == null) {
        urlsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.wso2.apk.enforcer.discovery.api.Endpoint, org.wso2.apk.enforcer.discovery.api.Endpoint.Builder, org.wso2.apk.enforcer.discovery.api.EndpointOrBuilder>(
                urls_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        urls_ = null;
      }
      return urlsBuilder_;
    }

    private org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig config_;
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfigOrBuilder> configBuilder_;
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     * @return Whether the config field is set.
     */
    public boolean hasConfig() {
      return configBuilder_ != null || config_ != null;
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     * @return The config.
     */
    public org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig getConfig() {
      if (configBuilder_ == null) {
        return config_ == null ? org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.getDefaultInstance() : config_;
      } else {
        return configBuilder_.getMessage();
      }
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public Builder setConfig(org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig value) {
      if (configBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        configBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public Builder setConfig(
        org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder builderForValue) {
      if (configBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        configBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public Builder mergeConfig(org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig value) {
      if (configBuilder_ == null) {
        if (config_ != null) {
          config_ =
            org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.newBuilder(config_).mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        configBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public Builder clearConfig() {
      if (configBuilder_ == null) {
        config_ = null;
        onChanged();
      } else {
        config_ = null;
        configBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder getConfigBuilder() {
      
      onChanged();
      return getConfigFieldBuilder().getBuilder();
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    public org.wso2.apk.enforcer.discovery.api.EndpointClusterConfigOrBuilder getConfigOrBuilder() {
      if (configBuilder_ != null) {
        return configBuilder_.getMessageOrBuilder();
      } else {
        return config_ == null ?
            org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.getDefaultInstance() : config_;
      }
    }
    /**
     * <code>.wso2.discovery.api.EndpointClusterConfig config = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfigOrBuilder> 
        getConfigFieldBuilder() {
      if (configBuilder_ == null) {
        configBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfig.Builder, org.wso2.apk.enforcer.discovery.api.EndpointClusterConfigOrBuilder>(
                getConfig(),
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      return configBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:wso2.discovery.api.EndpointCluster)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.api.EndpointCluster)
  private static final org.wso2.apk.enforcer.discovery.api.EndpointCluster DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.apk.enforcer.discovery.api.EndpointCluster();
  }

  public static org.wso2.apk.enforcer.discovery.api.EndpointCluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EndpointCluster>
      PARSER = new com.google.protobuf.AbstractParser<EndpointCluster>() {
    @java.lang.Override
    public EndpointCluster parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new EndpointCluster(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EndpointCluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EndpointCluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.api.EndpointCluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

