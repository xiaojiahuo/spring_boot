// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: src/main/resources/com/hry/spring/grpc/mystream/hello_stream.proto

package com.hry.spring.grpc.mystream;

/**
 * <pre>
 * 测试类
 * </pre>
 *
 * Protobuf type {@code SimpleFeatureDatabase}
 */
public  final class SimpleFeatureDatabase extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:SimpleFeatureDatabase)
    SimpleFeatureDatabaseOrBuilder {
  // Use SimpleFeatureDatabase.newBuilder() to construct.
  private SimpleFeatureDatabase(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SimpleFeatureDatabase() {
    feature_ = java.util.Collections.emptyList();
  }

  @Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private SimpleFeatureDatabase(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              feature_ = new java.util.ArrayList<SimpleFeature>();
              mutable_bitField0_ |= 0x00000001;
            }
            feature_.add(
                input.readMessage(SimpleFeature.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        feature_ = java.util.Collections.unmodifiableList(feature_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return HelloStreamEntity.internal_static_SimpleFeatureDatabase_descriptor;
  }

  protected FieldAccessorTable
      internalGetFieldAccessorTable() {
    return HelloStreamEntity.internal_static_SimpleFeatureDatabase_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            SimpleFeatureDatabase.class, Builder.class);
  }

  public static final int FEATURE_FIELD_NUMBER = 1;
  private java.util.List<SimpleFeature> feature_;
  /**
   * <code>repeated .SimpleFeature feature = 1;</code>
   */
  public java.util.List<SimpleFeature> getFeatureList() {
    return feature_;
  }
  /**
   * <code>repeated .SimpleFeature feature = 1;</code>
   */
  public java.util.List<? extends com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder> 
      getFeatureOrBuilderList() {
    return feature_;
  }
  /**
   * <code>repeated .SimpleFeature feature = 1;</code>
   */
  public int getFeatureCount() {
    return feature_.size();
  }
  /**
   * <code>repeated .SimpleFeature feature = 1;</code>
   */
  public SimpleFeature getFeature(int index) {
    return feature_.get(index);
  }
  /**
   * <code>repeated .SimpleFeature feature = 1;</code>
   */
  public com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder getFeatureOrBuilder(
      int index) {
    return feature_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < feature_.size(); i++) {
      output.writeMessage(1, feature_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < feature_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, feature_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @Override
  public boolean equals(final Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof SimpleFeatureDatabase)) {
      return super.equals(obj);
    }
    SimpleFeatureDatabase other = (SimpleFeatureDatabase) obj;

    boolean result = true;
    result = result && getFeatureList()
        .equals(other.getFeatureList());
    return result;
  }

  @Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    if (getFeatureCount() > 0) {
      hash = (37 * hash) + FEATURE_FIELD_NUMBER;
      hash = (53 * hash) + getFeatureList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static SimpleFeatureDatabase parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SimpleFeatureDatabase parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SimpleFeatureDatabase parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static SimpleFeatureDatabase parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static SimpleFeatureDatabase parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SimpleFeatureDatabase parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static SimpleFeatureDatabase parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static SimpleFeatureDatabase parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static SimpleFeatureDatabase parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static SimpleFeatureDatabase parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(SimpleFeatureDatabase prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @Override
  protected Builder newBuilderForType(
      BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * 测试类
   * </pre>
   *
   * Protobuf type {@code SimpleFeatureDatabase}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:SimpleFeatureDatabase)
      com.hry.spring.grpc.mystream.SimpleFeatureDatabaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return HelloStreamEntity.internal_static_SimpleFeatureDatabase_descriptor;
    }

    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return HelloStreamEntity.internal_static_SimpleFeatureDatabase_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              SimpleFeatureDatabase.class, Builder.class);
    }

    // Construct using com.hry.spring.grpc.mystream.SimpleFeatureDatabase.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
        getFeatureFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (featureBuilder_ == null) {
        feature_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        featureBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return HelloStreamEntity.internal_static_SimpleFeatureDatabase_descriptor;
    }

    public SimpleFeatureDatabase getDefaultInstanceForType() {
      return SimpleFeatureDatabase.getDefaultInstance();
    }

    public SimpleFeatureDatabase build() {
      SimpleFeatureDatabase result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public SimpleFeatureDatabase buildPartial() {
      SimpleFeatureDatabase result = new SimpleFeatureDatabase(this);
      int from_bitField0_ = bitField0_;
      if (featureBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          feature_ = java.util.Collections.unmodifiableList(feature_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.feature_ = feature_;
      } else {
        result.feature_ = featureBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof SimpleFeatureDatabase) {
        return mergeFrom((SimpleFeatureDatabase)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(SimpleFeatureDatabase other) {
      if (other == SimpleFeatureDatabase.getDefaultInstance()) return this;
      if (featureBuilder_ == null) {
        if (!other.feature_.isEmpty()) {
          if (feature_.isEmpty()) {
            feature_ = other.feature_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureFeatureIsMutable();
            feature_.addAll(other.feature_);
          }
          onChanged();
        }
      } else {
        if (!other.feature_.isEmpty()) {
          if (featureBuilder_.isEmpty()) {
            featureBuilder_.dispose();
            featureBuilder_ = null;
            feature_ = other.feature_;
            bitField0_ = (bitField0_ & ~0x00000001);
            featureBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeatureFieldBuilder() : null;
          } else {
            featureBuilder_.addAllMessages(other.feature_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      SimpleFeatureDatabase parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (SimpleFeatureDatabase) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<SimpleFeature> feature_ =
      java.util.Collections.emptyList();
    private void ensureFeatureIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        feature_ = new java.util.ArrayList<SimpleFeature>(feature_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        SimpleFeature, SimpleFeature.Builder, com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder> featureBuilder_;

    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public java.util.List<SimpleFeature> getFeatureList() {
      if (featureBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feature_);
      } else {
        return featureBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public int getFeatureCount() {
      if (featureBuilder_ == null) {
        return feature_.size();
      } else {
        return featureBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public SimpleFeature getFeature(int index) {
      if (featureBuilder_ == null) {
        return feature_.get(index);
      } else {
        return featureBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder setFeature(
        int index, SimpleFeature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.set(index, value);
        onChanged();
      } else {
        featureBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder setFeature(
        int index, SimpleFeature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.set(index, builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder addFeature(SimpleFeature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.add(value);
        onChanged();
      } else {
        featureBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder addFeature(
        int index, SimpleFeature value) {
      if (featureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeatureIsMutable();
        feature_.add(index, value);
        onChanged();
      } else {
        featureBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder addFeature(
        SimpleFeature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.add(builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder addFeature(
        int index, SimpleFeature.Builder builderForValue) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.add(index, builderForValue.build());
        onChanged();
      } else {
        featureBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder addAllFeature(
        Iterable<? extends SimpleFeature> values) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feature_);
        onChanged();
      } else {
        featureBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder clearFeature() {
      if (featureBuilder_ == null) {
        feature_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        featureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public Builder removeFeature(int index) {
      if (featureBuilder_ == null) {
        ensureFeatureIsMutable();
        feature_.remove(index);
        onChanged();
      } else {
        featureBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public SimpleFeature.Builder getFeatureBuilder(
        int index) {
      return getFeatureFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder getFeatureOrBuilder(
        int index) {
      if (featureBuilder_ == null) {
        return feature_.get(index);  } else {
        return featureBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public java.util.List<? extends com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder> 
         getFeatureOrBuilderList() {
      if (featureBuilder_ != null) {
        return featureBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feature_);
      }
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public SimpleFeature.Builder addFeatureBuilder() {
      return getFeatureFieldBuilder().addBuilder(
          SimpleFeature.getDefaultInstance());
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public SimpleFeature.Builder addFeatureBuilder(
        int index) {
      return getFeatureFieldBuilder().addBuilder(
          index, SimpleFeature.getDefaultInstance());
    }
    /**
     * <code>repeated .SimpleFeature feature = 1;</code>
     */
    public java.util.List<SimpleFeature.Builder>
         getFeatureBuilderList() {
      return getFeatureFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        SimpleFeature, SimpleFeature.Builder, com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder>
        getFeatureFieldBuilder() {
      if (featureBuilder_ == null) {
        featureBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            SimpleFeature, SimpleFeature.Builder, com.hry.spring.grpc.mystream.SimpleFeatureOrBuilder>(
                feature_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        feature_ = null;
      }
      return featureBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:SimpleFeatureDatabase)
  }

  // @@protoc_insertion_point(class_scope:SimpleFeatureDatabase)
  private static final SimpleFeatureDatabase DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new SimpleFeatureDatabase();
  }

  public static SimpleFeatureDatabase getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SimpleFeatureDatabase>
      PARSER = new com.google.protobuf.AbstractParser<SimpleFeatureDatabase>() {
    public SimpleFeatureDatabase parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new SimpleFeatureDatabase(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<SimpleFeatureDatabase> parser() {
    return PARSER;
  }

  @Override
  public com.google.protobuf.Parser<SimpleFeatureDatabase> getParserForType() {
    return PARSER;
  }

  public SimpleFeatureDatabase getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

