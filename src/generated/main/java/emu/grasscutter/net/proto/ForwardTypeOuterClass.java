// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ForwardType.proto

package emu.grasscutter.net.proto;

public final class ForwardTypeOuterClass {
  private ForwardTypeOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * <pre>
   * 4.7.0
   * </pre>
   *
   * Protobuf enum {@code ForwardType}
   */
  public enum ForwardType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FORWARD_TYPE_LOCAL = 0;</code>
     */
    FORWARD_TYPE_LOCAL(0),
    /**
     * <code>FORWARD_TYPE_TO_ALL = 1;</code>
     */
    FORWARD_TYPE_TO_ALL(1),
    /**
     * <code>FORWARD_TYPE_TO_ALL_EXCEPT_CUR = 2;</code>
     */
    FORWARD_TYPE_TO_ALL_EXCEPT_CUR(2),
    /**
     * <code>FORWARD_TYPE_TO_HOST = 3;</code>
     */
    FORWARD_TYPE_TO_HOST(3),
    /**
     * <code>FORWARD_TYPE_TO_ALL_GUEST = 4;</code>
     */
    FORWARD_TYPE_TO_ALL_GUEST(4),
    /**
     * <code>FORWARD_TYPE_TO_PEER = 5;</code>
     */
    FORWARD_TYPE_TO_PEER(5),
    /**
     * <code>FORWARD_TYPE_TO_PEERS = 6;</code>
     */
    FORWARD_TYPE_TO_PEERS(6),
    /**
     * <code>FORWARD_TYPE_ONLY_SERVER = 7;</code>
     */
    FORWARD_TYPE_ONLY_SERVER(7),
    /**
     * <code>FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR = 8;</code>
     */
    FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR(8),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>FORWARD_TYPE_LOCAL = 0;</code>
     */
    public static final int FORWARD_TYPE_LOCAL_VALUE = 0;
    /**
     * <code>FORWARD_TYPE_TO_ALL = 1;</code>
     */
    public static final int FORWARD_TYPE_TO_ALL_VALUE = 1;
    /**
     * <code>FORWARD_TYPE_TO_ALL_EXCEPT_CUR = 2;</code>
     */
    public static final int FORWARD_TYPE_TO_ALL_EXCEPT_CUR_VALUE = 2;
    /**
     * <code>FORWARD_TYPE_TO_HOST = 3;</code>
     */
    public static final int FORWARD_TYPE_TO_HOST_VALUE = 3;
    /**
     * <code>FORWARD_TYPE_TO_ALL_GUEST = 4;</code>
     */
    public static final int FORWARD_TYPE_TO_ALL_GUEST_VALUE = 4;
    /**
     * <code>FORWARD_TYPE_TO_PEER = 5;</code>
     */
    public static final int FORWARD_TYPE_TO_PEER_VALUE = 5;
    /**
     * <code>FORWARD_TYPE_TO_PEERS = 6;</code>
     */
    public static final int FORWARD_TYPE_TO_PEERS_VALUE = 6;
    /**
     * <code>FORWARD_TYPE_ONLY_SERVER = 7;</code>
     */
    public static final int FORWARD_TYPE_ONLY_SERVER_VALUE = 7;
    /**
     * <code>FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR = 8;</code>
     */
    public static final int FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR_VALUE = 8;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ForwardType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ForwardType forNumber(int value) {
      switch (value) {
        case 0: return FORWARD_TYPE_LOCAL;
        case 1: return FORWARD_TYPE_TO_ALL;
        case 2: return FORWARD_TYPE_TO_ALL_EXCEPT_CUR;
        case 3: return FORWARD_TYPE_TO_HOST;
        case 4: return FORWARD_TYPE_TO_ALL_GUEST;
        case 5: return FORWARD_TYPE_TO_PEER;
        case 6: return FORWARD_TYPE_TO_PEERS;
        case 7: return FORWARD_TYPE_ONLY_SERVER;
        case 8: return FORWARD_TYPE_TO_ALL_EXIST_EXCEPT_CUR;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ForwardType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ForwardType> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ForwardType>() {
            public ForwardType findValueByNumber(int number) {
              return ForwardType.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ForwardTypeOuterClass.getDescriptor().getEnumTypes().get(0);
    }

    private static final ForwardType[] VALUES = values();

    public static ForwardType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ForwardType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:ForwardType)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ForwardType.proto*\230\002\n\013ForwardType\022\026\n\022F" +
      "ORWARD_TYPE_LOCAL\020\000\022\027\n\023FORWARD_TYPE_TO_A" +
      "LL\020\001\022\"\n\036FORWARD_TYPE_TO_ALL_EXCEPT_CUR\020\002" +
      "\022\030\n\024FORWARD_TYPE_TO_HOST\020\003\022\035\n\031FORWARD_TY" +
      "PE_TO_ALL_GUEST\020\004\022\030\n\024FORWARD_TYPE_TO_PEE" +
      "R\020\005\022\031\n\025FORWARD_TYPE_TO_PEERS\020\006\022\034\n\030FORWAR" +
      "D_TYPE_ONLY_SERVER\020\007\022(\n$FORWARD_TYPE_TO_" +
      "ALL_EXIST_EXCEPT_CUR\020\010B\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
