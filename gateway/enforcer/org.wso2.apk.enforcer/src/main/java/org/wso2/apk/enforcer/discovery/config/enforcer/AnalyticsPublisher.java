// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/config/enforcer/analytics_publisher.proto

package org.wso2.apk.enforcer.discovery.config.enforcer;

/**
 * Protobuf type {@code wso2.discovery.config.enforcer.AnalyticsPublisher}
 */
public final class AnalyticsPublisher extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:wso2.discovery.config.enforcer.AnalyticsPublisher)
    AnalyticsPublisherOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AnalyticsPublisher.newBuilder() to construct.
  private AnalyticsPublisher(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AnalyticsPublisher() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AnalyticsPublisher();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private AnalyticsPublisher(
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
          case 8: {

            enabled_ = input.readBool();
            break;
          }
          case 18: {
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              configProperties_ = com.google.protobuf.MapField.newMapField(
                  ConfigPropertiesDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            configProperties__ = input.readMessage(
                ConfigPropertiesDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            configProperties_.getMutableMap().put(
                configProperties__.getKey(), configProperties__.getValue());
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            type_ = s;
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
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 2:
        return internalGetConfigProperties();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.class, org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_;
  /**
   * <code>bool enabled = 1;</code>
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int CONFIGPROPERTIES_FIELD_NUMBER = 2;
  private static final class ConfigPropertiesDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_ConfigPropertiesEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> configProperties_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetConfigProperties() {
    if (configProperties_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ConfigPropertiesDefaultEntryHolder.defaultEntry);
    }
    return configProperties_;
  }

  public int getConfigPropertiesCount() {
    return internalGetConfigProperties().getMap().size();
  }
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */

  @java.lang.Override
  public boolean containsConfigProperties(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetConfigProperties().getMap().containsKey(key);
  }
  /**
   * Use {@link #getConfigPropertiesMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getConfigProperties() {
    return getConfigPropertiesMap();
  }
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getConfigPropertiesMap() {
    return internalGetConfigProperties().getMap();
  }
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getConfigPropertiesOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetConfigProperties().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <pre>
   * Analytics Publisher Configurations
   * </pre>
   *
   * <code>map&lt;string, string&gt; configProperties = 2;</code>
   */
  @java.lang.Override

  public java.lang.String getConfigPropertiesOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetConfigProperties().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int TYPE_FIELD_NUMBER = 3;
  private volatile java.lang.Object type_;
  /**
   * <pre>
   * Analytics type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Analytics type
   * </pre>
   *
   * <code>string type = 3;</code>
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetConfigProperties(),
        ConfigPropertiesDefaultEntryHolder.defaultEntry,
        2);
    if (!getTypeBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, type_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, enabled_);
    }
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetConfigProperties().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      configProperties__ = ConfigPropertiesDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, configProperties__);
    }
    if (!getTypeBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, type_);
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
    if (!(obj instanceof org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher)) {
      return super.equals(obj);
    }
    org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher other = (org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher) obj;

    if (getEnabled()
        != other.getEnabled()) return false;
    if (!internalGetConfigProperties().equals(
        other.internalGetConfigProperties())) return false;
    if (!getType()
        .equals(other.getType())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getEnabled());
    if (!internalGetConfigProperties().getMap().isEmpty()) {
      hash = (37 * hash) + CONFIGPROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + internalGetConfigProperties().hashCode();
    }
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parseFrom(
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
  public static Builder newBuilder(org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher prototype) {
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
   * Protobuf type {@code wso2.discovery.config.enforcer.AnalyticsPublisher}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:wso2.discovery.config.enforcer.AnalyticsPublisher)
      org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetConfigProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 2:
          return internalGetMutableConfigProperties();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.class, org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.Builder.class);
    }

    // Construct using org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.newBuilder()
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
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      enabled_ = false;

      internalGetMutableConfigProperties().clear();
      type_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisherProto.internal_static_wso2_discovery_config_enforcer_AnalyticsPublisher_descriptor;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher getDefaultInstanceForType() {
      return org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher build() {
      org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher buildPartial() {
      org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher result = new org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher(this);
      int from_bitField0_ = bitField0_;
      result.enabled_ = enabled_;
      result.configProperties_ = internalGetConfigProperties();
      result.configProperties_.makeImmutable();
      result.type_ = type_;
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
      if (other instanceof org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher) {
        return mergeFrom((org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher other) {
      if (other == org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      internalGetMutableConfigProperties().mergeFrom(
          other.internalGetConfigProperties());
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        onChanged();
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
      org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean enabled_ ;
    /**
     * <code>bool enabled = 1;</code>
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {
      
      enabled_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool enabled = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      
      enabled_ = false;
      onChanged();
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> configProperties_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetConfigProperties() {
      if (configProperties_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ConfigPropertiesDefaultEntryHolder.defaultEntry);
      }
      return configProperties_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableConfigProperties() {
      onChanged();;
      if (configProperties_ == null) {
        configProperties_ = com.google.protobuf.MapField.newMapField(
            ConfigPropertiesDefaultEntryHolder.defaultEntry);
      }
      if (!configProperties_.isMutable()) {
        configProperties_ = configProperties_.copy();
      }
      return configProperties_;
    }

    public int getConfigPropertiesCount() {
      return internalGetConfigProperties().getMap().size();
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */

    @java.lang.Override
    public boolean containsConfigProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetConfigProperties().getMap().containsKey(key);
    }
    /**
     * Use {@link #getConfigPropertiesMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getConfigProperties() {
      return getConfigPropertiesMap();
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getConfigPropertiesMap() {
      return internalGetConfigProperties().getMap();
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getConfigPropertiesOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetConfigProperties().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */
    @java.lang.Override

    public java.lang.String getConfigPropertiesOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetConfigProperties().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearConfigProperties() {
      internalGetMutableConfigProperties().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */

    public Builder removeConfigProperties(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableConfigProperties().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableConfigProperties() {
      return internalGetMutableConfigProperties().getMutableMap();
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */
    public Builder putConfigProperties(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableConfigProperties().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <pre>
     * Analytics Publisher Configurations
     * </pre>
     *
     * <code>map&lt;string, string&gt; configProperties = 2;</code>
     */

    public Builder putAllConfigProperties(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableConfigProperties().getMutableMap()
          .putAll(values);
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     * <pre>
     * Analytics type
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Analytics type
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Analytics type
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      type_ = value;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Analytics type
     * </pre>
     *
     * <code>string type = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearType() {
      
      type_ = getDefaultInstance().getType();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Analytics type
     * </pre>
     *
     * <code>string type = 3;</code>
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      type_ = value;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:wso2.discovery.config.enforcer.AnalyticsPublisher)
  }

  // @@protoc_insertion_point(class_scope:wso2.discovery.config.enforcer.AnalyticsPublisher)
  private static final org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher();
  }

  public static org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyticsPublisher>
      PARSER = new com.google.protobuf.AbstractParser<AnalyticsPublisher>() {
    @java.lang.Override
    public AnalyticsPublisher parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new AnalyticsPublisher(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<AnalyticsPublisher> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyticsPublisher> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.config.enforcer.AnalyticsPublisher getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

