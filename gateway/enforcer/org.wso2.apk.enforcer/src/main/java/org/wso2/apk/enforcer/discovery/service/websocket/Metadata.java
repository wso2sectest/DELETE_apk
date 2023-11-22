// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/service/websocket/frame_service.proto

package org.wso2.apk.enforcer.discovery.service.websocket;

/**
 * Protobuf type {@code envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata}
 */
public final class Metadata extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata)
    MetadataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Metadata.newBuilder() to construct.
  private Metadata(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Metadata() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Metadata();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Metadata(
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
              extAuthzMetadata_ = com.google.protobuf.MapField.newMapField(
                  ExtAuthzMetadataDefaultEntryHolder.defaultEntry);
              mutable_bitField0_ |= 0x00000001;
            }
            com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
            extAuthzMetadata__ = input.readMessage(
                ExtAuthzMetadataDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
            extAuthzMetadata_.getMutableMap().put(
                extAuthzMetadata__.getKey(), extAuthzMetadata__.getValue());
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
    return org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapField internalGetMapField(
      int number) {
    switch (number) {
      case 1:
        return internalGetExtAuthzMetadata();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.wso2.apk.enforcer.discovery.service.websocket.Metadata.class, org.wso2.apk.enforcer.discovery.service.websocket.Metadata.Builder.class);
  }

  public static final int EXT_AUTHZ_METADATA_FIELD_NUMBER = 1;
  private static final class ExtAuthzMetadataDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.String, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.String, java.lang.String>newDefaultInstance(
                org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_ExtAuthzMetadataEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.STRING,
                "",
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  private com.google.protobuf.MapField<
      java.lang.String, java.lang.String> extAuthzMetadata_;
  private com.google.protobuf.MapField<java.lang.String, java.lang.String>
  internalGetExtAuthzMetadata() {
    if (extAuthzMetadata_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ExtAuthzMetadataDefaultEntryHolder.defaultEntry);
    }
    return extAuthzMetadata_;
  }

  public int getExtAuthzMetadataCount() {
    return internalGetExtAuthzMetadata().getMap().size();
  }
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */

  @java.lang.Override
  public boolean containsExtAuthzMetadata(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    return internalGetExtAuthzMetadata().getMap().containsKey(key);
  }
  /**
   * Use {@link #getExtAuthzMetadataMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getExtAuthzMetadata() {
    return getExtAuthzMetadataMap();
  }
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  @java.lang.Override

  public java.util.Map<java.lang.String, java.lang.String> getExtAuthzMetadataMap() {
    return internalGetExtAuthzMetadata().getMap();
  }
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getExtAuthzMetadataOrDefault(
      java.lang.String key,
      java.lang.String defaultValue) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetExtAuthzMetadata().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
   */
  @java.lang.Override

  public java.lang.String getExtAuthzMetadataOrThrow(
      java.lang.String key) {
    if (key == null) { throw new java.lang.NullPointerException(); }
    java.util.Map<java.lang.String, java.lang.String> map =
        internalGetExtAuthzMetadata().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessageV3
      .serializeStringMapTo(
        output,
        internalGetExtAuthzMetadata(),
        ExtAuthzMetadataDefaultEntryHolder.defaultEntry,
        1);
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry
         : internalGetExtAuthzMetadata().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String>
      extAuthzMetadata__ = ExtAuthzMetadataDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, extAuthzMetadata__);
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
    if (!(obj instanceof org.wso2.apk.enforcer.discovery.service.websocket.Metadata)) {
      return super.equals(obj);
    }
    org.wso2.apk.enforcer.discovery.service.websocket.Metadata other = (org.wso2.apk.enforcer.discovery.service.websocket.Metadata) obj;

    if (!internalGetExtAuthzMetadata().equals(
        other.internalGetExtAuthzMetadata())) return false;
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
    if (!internalGetExtAuthzMetadata().getMap().isEmpty()) {
      hash = (37 * hash) + EXT_AUTHZ_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + internalGetExtAuthzMetadata().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata parseFrom(
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
  public static Builder newBuilder(org.wso2.apk.enforcer.discovery.service.websocket.Metadata prototype) {
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
   * Protobuf type {@code envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata)
      org.wso2.apk.enforcer.discovery.service.websocket.MetadataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetExtAuthzMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapField internalGetMutableMapField(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableExtAuthzMetadata();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.wso2.apk.enforcer.discovery.service.websocket.Metadata.class, org.wso2.apk.enforcer.discovery.service.websocket.Metadata.Builder.class);
    }

    // Construct using org.wso2.apk.enforcer.discovery.service.websocket.Metadata.newBuilder()
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
      internalGetMutableExtAuthzMetadata().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.wso2.apk.enforcer.discovery.service.websocket.MgwWebSocketProto.internal_static_envoy_extensions_filters_http_mgw_wasm_websocket_v3_Metadata_descriptor;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.service.websocket.Metadata getDefaultInstanceForType() {
      return org.wso2.apk.enforcer.discovery.service.websocket.Metadata.getDefaultInstance();
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.service.websocket.Metadata build() {
      org.wso2.apk.enforcer.discovery.service.websocket.Metadata result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.wso2.apk.enforcer.discovery.service.websocket.Metadata buildPartial() {
      org.wso2.apk.enforcer.discovery.service.websocket.Metadata result = new org.wso2.apk.enforcer.discovery.service.websocket.Metadata(this);
      int from_bitField0_ = bitField0_;
      result.extAuthzMetadata_ = internalGetExtAuthzMetadata();
      result.extAuthzMetadata_.makeImmutable();
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
      if (other instanceof org.wso2.apk.enforcer.discovery.service.websocket.Metadata) {
        return mergeFrom((org.wso2.apk.enforcer.discovery.service.websocket.Metadata)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.wso2.apk.enforcer.discovery.service.websocket.Metadata other) {
      if (other == org.wso2.apk.enforcer.discovery.service.websocket.Metadata.getDefaultInstance()) return this;
      internalGetMutableExtAuthzMetadata().mergeFrom(
          other.internalGetExtAuthzMetadata());
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
      org.wso2.apk.enforcer.discovery.service.websocket.Metadata parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (org.wso2.apk.enforcer.discovery.service.websocket.Metadata) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.MapField<
        java.lang.String, java.lang.String> extAuthzMetadata_;
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetExtAuthzMetadata() {
      if (extAuthzMetadata_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ExtAuthzMetadataDefaultEntryHolder.defaultEntry);
      }
      return extAuthzMetadata_;
    }
    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
    internalGetMutableExtAuthzMetadata() {
      onChanged();;
      if (extAuthzMetadata_ == null) {
        extAuthzMetadata_ = com.google.protobuf.MapField.newMapField(
            ExtAuthzMetadataDefaultEntryHolder.defaultEntry);
      }
      if (!extAuthzMetadata_.isMutable()) {
        extAuthzMetadata_ = extAuthzMetadata_.copy();
      }
      return extAuthzMetadata_;
    }

    public int getExtAuthzMetadataCount() {
      return internalGetExtAuthzMetadata().getMap().size();
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */

    @java.lang.Override
    public boolean containsExtAuthzMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      return internalGetExtAuthzMetadata().getMap().containsKey(key);
    }
    /**
     * Use {@link #getExtAuthzMetadataMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getExtAuthzMetadata() {
      return getExtAuthzMetadataMap();
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */
    @java.lang.Override

    public java.util.Map<java.lang.String, java.lang.String> getExtAuthzMetadataMap() {
      return internalGetExtAuthzMetadata().getMap();
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getExtAuthzMetadataOrDefault(
        java.lang.String key,
        java.lang.String defaultValue) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetExtAuthzMetadata().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */
    @java.lang.Override

    public java.lang.String getExtAuthzMetadataOrThrow(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      java.util.Map<java.lang.String, java.lang.String> map =
          internalGetExtAuthzMetadata().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearExtAuthzMetadata() {
      internalGetMutableExtAuthzMetadata().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */

    public Builder removeExtAuthzMetadata(
        java.lang.String key) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableExtAuthzMetadata().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String>
    getMutableExtAuthzMetadata() {
      return internalGetMutableExtAuthzMetadata().getMutableMap();
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */
    public Builder putExtAuthzMetadata(
        java.lang.String key,
        java.lang.String value) {
      if (key == null) { throw new java.lang.NullPointerException(); }
      if (value == null) { throw new java.lang.NullPointerException(); }
      internalGetMutableExtAuthzMetadata().getMutableMap()
          .put(key, value);
      return this;
    }
    /**
     * <code>map&lt;string, string&gt; ext_authz_metadata = 1;</code>
     */

    public Builder putAllExtAuthzMetadata(
        java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableExtAuthzMetadata().getMutableMap()
          .putAll(values);
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


    // @@protoc_insertion_point(builder_scope:envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata)
  }

  // @@protoc_insertion_point(class_scope:envoy.extensions.filters.http.mgw_wasm_websocket.v3.Metadata)
  private static final org.wso2.apk.enforcer.discovery.service.websocket.Metadata DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.wso2.apk.enforcer.discovery.service.websocket.Metadata();
  }

  public static org.wso2.apk.enforcer.discovery.service.websocket.Metadata getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Metadata>
      PARSER = new com.google.protobuf.AbstractParser<Metadata>() {
    @java.lang.Override
    public Metadata parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Metadata(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Metadata> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Metadata> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.wso2.apk.enforcer.discovery.service.websocket.Metadata getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

