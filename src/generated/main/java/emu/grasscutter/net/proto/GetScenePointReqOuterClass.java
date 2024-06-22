// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GetScenePointReq.proto

package emu.grasscutter.net.proto;

public final class GetScenePointReqOuterClass {
  private GetScenePointReqOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GetScenePointReqOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GetScenePointReq)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 scene_id = 1;</code>
     * @return The sceneId.
     */
    int getSceneId();

    /**
     * <code>bool LEPDAGALLND = 3;</code>
     * @return The lEPDAGALLND.
     */
    boolean getLEPDAGALLND();

    /**
     * <code>uint32 belong_uid = 10;</code>
     * @return The belongUid.
     */
    int getBelongUid();
  }
  /**
   * <pre>
   * 4.7.0
   * CmdId: 6271
   * </pre>
   *
   * Protobuf type {@code GetScenePointReq}
   */
  public static final class GetScenePointReq extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GetScenePointReq)
      GetScenePointReqOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GetScenePointReq.newBuilder() to construct.
    private GetScenePointReq(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GetScenePointReq() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GetScenePointReq();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GetScenePointReq(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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

              sceneId_ = input.readUInt32();
              break;
            }
            case 24: {

              lEPDAGALLND_ = input.readBool();
              break;
            }
            case 80: {

              belongUid_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.class, emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.Builder.class);
    }

    public static final int SCENE_ID_FIELD_NUMBER = 1;
    private int sceneId_;
    /**
     * <code>uint32 scene_id = 1;</code>
     * @return The sceneId.
     */
    @java.lang.Override
    public int getSceneId() {
      return sceneId_;
    }

    public static final int LEPDAGALLND_FIELD_NUMBER = 3;
    private boolean lEPDAGALLND_;
    /**
     * <code>bool LEPDAGALLND = 3;</code>
     * @return The lEPDAGALLND.
     */
    @java.lang.Override
    public boolean getLEPDAGALLND() {
      return lEPDAGALLND_;
    }

    public static final int BELONG_UID_FIELD_NUMBER = 10;
    private int belongUid_;
    /**
     * <code>uint32 belong_uid = 10;</code>
     * @return The belongUid.
     */
    @java.lang.Override
    public int getBelongUid() {
      return belongUid_;
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
      if (sceneId_ != 0) {
        output.writeUInt32(1, sceneId_);
      }
      if (lEPDAGALLND_ != false) {
        output.writeBool(3, lEPDAGALLND_);
      }
      if (belongUid_ != 0) {
        output.writeUInt32(10, belongUid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (sceneId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, sceneId_);
      }
      if (lEPDAGALLND_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(3, lEPDAGALLND_);
      }
      if (belongUid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, belongUid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq other = (emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq) obj;

      if (getSceneId()
          != other.getSceneId()) return false;
      if (getLEPDAGALLND()
          != other.getLEPDAGALLND()) return false;
      if (getBelongUid()
          != other.getBelongUid()) return false;
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
      hash = (37 * hash) + SCENE_ID_FIELD_NUMBER;
      hash = (53 * hash) + getSceneId();
      hash = (37 * hash) + LEPDAGALLND_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLEPDAGALLND());
      hash = (37 * hash) + BELONG_UID_FIELD_NUMBER;
      hash = (53 * hash) + getBelongUid();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq prototype) {
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
     * 4.7.0
     * CmdId: 6271
     * </pre>
     *
     * Protobuf type {@code GetScenePointReq}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GetScenePointReq)
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReqOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.class, emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.newBuilder()
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
        sceneId_ = 0;

        lEPDAGALLND_ = false;

        belongUid_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.internal_static_GetScenePointReq_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq build() {
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq buildPartial() {
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq result = new emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq(this);
        result.sceneId_ = sceneId_;
        result.lEPDAGALLND_ = lEPDAGALLND_;
        result.belongUid_ = belongUid_;
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
        if (other instanceof emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq) {
          return mergeFrom((emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq other) {
        if (other == emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq.getDefaultInstance()) return this;
        if (other.getSceneId() != 0) {
          setSceneId(other.getSceneId());
        }
        if (other.getLEPDAGALLND() != false) {
          setLEPDAGALLND(other.getLEPDAGALLND());
        }
        if (other.getBelongUid() != 0) {
          setBelongUid(other.getBelongUid());
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
        emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int sceneId_ ;
      /**
       * <code>uint32 scene_id = 1;</code>
       * @return The sceneId.
       */
      @java.lang.Override
      public int getSceneId() {
        return sceneId_;
      }
      /**
       * <code>uint32 scene_id = 1;</code>
       * @param value The sceneId to set.
       * @return This builder for chaining.
       */
      public Builder setSceneId(int value) {
        
        sceneId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 scene_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSceneId() {
        
        sceneId_ = 0;
        onChanged();
        return this;
      }

      private boolean lEPDAGALLND_ ;
      /**
       * <code>bool LEPDAGALLND = 3;</code>
       * @return The lEPDAGALLND.
       */
      @java.lang.Override
      public boolean getLEPDAGALLND() {
        return lEPDAGALLND_;
      }
      /**
       * <code>bool LEPDAGALLND = 3;</code>
       * @param value The lEPDAGALLND to set.
       * @return This builder for chaining.
       */
      public Builder setLEPDAGALLND(boolean value) {
        
        lEPDAGALLND_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool LEPDAGALLND = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearLEPDAGALLND() {
        
        lEPDAGALLND_ = false;
        onChanged();
        return this;
      }

      private int belongUid_ ;
      /**
       * <code>uint32 belong_uid = 10;</code>
       * @return The belongUid.
       */
      @java.lang.Override
      public int getBelongUid() {
        return belongUid_;
      }
      /**
       * <code>uint32 belong_uid = 10;</code>
       * @param value The belongUid to set.
       * @return This builder for chaining.
       */
      public Builder setBelongUid(int value) {
        
        belongUid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 belong_uid = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearBelongUid() {
        
        belongUid_ = 0;
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


      // @@protoc_insertion_point(builder_scope:GetScenePointReq)
    }

    // @@protoc_insertion_point(class_scope:GetScenePointReq)
    private static final emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq();
    }

    public static emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GetScenePointReq>
        PARSER = new com.google.protobuf.AbstractParser<GetScenePointReq>() {
      @java.lang.Override
      public GetScenePointReq parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GetScenePointReq(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GetScenePointReq> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GetScenePointReq> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GetScenePointReqOuterClass.GetScenePointReq getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GetScenePointReq_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GetScenePointReq_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GetScenePointReq.proto\"M\n\020GetScenePoin" +
      "tReq\022\020\n\010scene_id\030\001 \001(\r\022\023\n\013LEPDAGALLND\030\003 " +
      "\001(\010\022\022\n\nbelong_uid\030\n \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GetScenePointReq_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GetScenePointReq_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GetScenePointReq_descriptor,
        new java.lang.String[] { "SceneId", "LEPDAGALLND", "BelongUid", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
