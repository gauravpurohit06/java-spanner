// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: singer.proto

package com.example.spanner.protobuf;

public final class SingerProto {
  private SingerProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code spanner.examples.music.Genre}
   */
  public enum Genre
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>POP = 0;</code>
     */
    POP(0),
    /**
     * <code>JAZZ = 1;</code>
     */
    JAZZ(1),
    /**
     * <code>FOLK = 2;</code>
     */
    FOLK(2),
    /**
     * <code>ROCK = 3;</code>
     */
    ROCK(3),
    ;

    /**
     * <code>POP = 0;</code>
     */
    public static final int POP_VALUE = 0;
    /**
     * <code>JAZZ = 1;</code>
     */
    public static final int JAZZ_VALUE = 1;
    /**
     * <code>FOLK = 2;</code>
     */
    public static final int FOLK_VALUE = 2;
    /**
     * <code>ROCK = 3;</code>
     */
    public static final int ROCK_VALUE = 3;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Genre valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Genre forNumber(int value) {
      switch (value) {
        case 0: return POP;
        case 1: return JAZZ;
        case 2: return FOLK;
        case 3: return ROCK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Genre>
    internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Genre> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Genre>() {
          public Genre findValueByNumber(int number) {
            return Genre.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
    getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
    getDescriptor() {
      return com.example.spanner.protobuf.SingerProto.getDescriptor().getEnumTypes().get(0);
    }

    private static final Genre[] VALUES = values();

    public static Genre valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Genre(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:spanner.examples.music.Genre)
  }

  public interface SingerInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:spanner.examples.music.SingerInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return Whether the singerId field is set.
     */
    boolean hasSingerId();
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return The singerId.
     */
    long getSingerId();

    /**
     * <code>optional string birth_date = 2;</code>
     * @return Whether the birthDate field is set.
     */
    boolean hasBirthDate();
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The birthDate.
     */
    java.lang.String getBirthDate();
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The bytes for birthDate.
     */
    com.google.protobuf.ByteString
    getBirthDateBytes();

    /**
     * <code>optional string nationality = 3;</code>
     * @return Whether the nationality field is set.
     */
    boolean hasNationality();
    /**
     * <code>optional string nationality = 3;</code>
     * @return The nationality.
     */
    java.lang.String getNationality();
    /**
     * <code>optional string nationality = 3;</code>
     * @return The bytes for nationality.
     */
    com.google.protobuf.ByteString
    getNationalityBytes();

    /**
     * <code>optional .spanner.examples.music.Genre genre = 4;</code>
     * @return Whether the genre field is set.
     */
    boolean hasGenre();
    /**
     * <code>optional .spanner.examples.music.Genre genre = 4;</code>
     * @return The genre.
     */
    com.example.spanner.protobuf.SingerProto.Genre getGenre();
  }
  /**
   * Protobuf type {@code spanner.examples.music.SingerInfo}
   */
  public static final class SingerInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:spanner.examples.music.SingerInfo)
      SingerInfoOrBuilder {
    private static final long serialVersionUID = 0L;
    // Use SingerInfo.newBuilder() to construct.
    private SingerInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SingerInfo() {
      birthDate_ = "";
      nationality_ = "";
      genre_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SingerInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SingerInfo(
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
              bitField0_ |= 0x00000001;
              singerId_ = input.readInt64();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              birthDate_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              nationality_ = bs;
              break;
            }
            case 32: {
              int rawValue = input.readEnum();
              @SuppressWarnings("deprecation")
              com.example.spanner.protobuf.SingerProto.Genre value = com.example.spanner.protobuf.SingerProto.Genre.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(4, rawValue);
              } else {
                bitField0_ |= 0x00000008;
                genre_ = rawValue;
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.example.spanner.protobuf.SingerProto.internal_static_spanner_examples_music_SingerInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.example.spanner.protobuf.SingerProto.internal_static_spanner_examples_music_SingerInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.spanner.protobuf.SingerProto.SingerInfo.class, com.example.spanner.protobuf.SingerProto.SingerInfo.Builder.class);
    }

    private int bitField0_;
    public static final int SINGER_ID_FIELD_NUMBER = 1;
    private long singerId_;
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return Whether the singerId field is set.
     */
    @java.lang.Override
    public boolean hasSingerId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional int64 singer_id = 1;</code>
     * @return The singerId.
     */
    @java.lang.Override
    public long getSingerId() {
      return singerId_;
    }

    public static final int BIRTH_DATE_FIELD_NUMBER = 2;
    private volatile java.lang.Object birthDate_;
    /**
     * <code>optional string birth_date = 2;</code>
     * @return Whether the birthDate field is set.
     */
    @java.lang.Override
    public boolean hasBirthDate() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The birthDate.
     */
    @java.lang.Override
    public java.lang.String getBirthDate() {
      java.lang.Object ref = birthDate_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          birthDate_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string birth_date = 2;</code>
     * @return The bytes for birthDate.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getBirthDateBytes() {
      java.lang.Object ref = birthDate_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        birthDate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int NATIONALITY_FIELD_NUMBER = 3;
    private volatile java.lang.Object nationality_;
    /**
     * <code>optional string nationality = 3;</code>
     * @return Whether the nationality field is set.
     */
    @java.lang.Override
    public boolean hasNationality() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The nationality.
     */
    @java.lang.Override
    public java.lang.String getNationality() {
      java.lang.Object ref = nationality_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          nationality_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string nationality = 3;</code>
     * @return The bytes for nationality.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
    getNationalityBytes() {
      java.lang.Object ref = nationality_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nationality_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int GENRE_FIELD_NUMBER = 4;
    private int genre_;
    /**
     * <code>optional .spanner.examples.music.Genre genre = 4;</code>
     * @return Whether the genre field is set.
     */
    @java.lang.Override public boolean hasGenre() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>optional .spanner.examples.music.Genre genre = 4;</code>
     * @return The genre.
     */
    @java.lang.Override public com.example.spanner.protobuf.SingerProto.Genre getGenre() {
      @SuppressWarnings("deprecation")
      com.example.spanner.protobuf.SingerProto.Genre result = com.example.spanner.protobuf.SingerProto.Genre.valueOf(genre_);
      return result == null ? com.example.spanner.protobuf.SingerProto.Genre.POP : result;
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
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeInt64(1, singerId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, birthDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, nationality_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        output.writeEnum(4, genre_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
            .computeInt64Size(1, singerId_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, birthDate_);
      }
      if (((bitField0_ & 0x00000004) != 0)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, nationality_);
      }
      if (((bitField0_ & 0x00000008) != 0)) {
        size += com.google.protobuf.CodedOutputStream
            .computeEnumSize(4, genre_);
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
      if (!(obj instanceof com.example.spanner.protobuf.SingerProto.SingerInfo)) {
        return super.equals(obj);
      }
      com.example.spanner.protobuf.SingerProto.SingerInfo other = (com.example.spanner.protobuf.SingerProto.SingerInfo) obj;

      if (hasSingerId() != other.hasSingerId()) return false;
      if (hasSingerId()) {
        if (getSingerId()
            != other.getSingerId()) return false;
      }
      if (hasBirthDate() != other.hasBirthDate()) return false;
      if (hasBirthDate()) {
        if (!getBirthDate()
            .equals(other.getBirthDate())) return false;
      }
      if (hasNationality() != other.hasNationality()) return false;
      if (hasNationality()) {
        if (!getNationality()
            .equals(other.getNationality())) return false;
      }
      if (hasGenre() != other.hasGenre()) return false;
      if (hasGenre()) {
        if (genre_ != other.genre_) return false;
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
      if (hasSingerId()) {
        hash = (37 * hash) + SINGER_ID_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getSingerId());
      }
      if (hasBirthDate()) {
        hash = (37 * hash) + BIRTH_DATE_FIELD_NUMBER;
        hash = (53 * hash) + getBirthDate().hashCode();
      }
      if (hasNationality()) {
        hash = (37 * hash) + NATIONALITY_FIELD_NUMBER;
        hash = (53 * hash) + getNationality().hashCode();
      }
      if (hasGenre()) {
        hash = (37 * hash) + GENRE_FIELD_NUMBER;
        hash = (53 * hash) + genre_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.example.spanner.protobuf.SingerProto.SingerInfo parseFrom(
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
    public static Builder newBuilder(com.example.spanner.protobuf.SingerProto.SingerInfo prototype) {
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
     * Protobuf type {@code spanner.examples.music.SingerInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:spanner.examples.music.SingerInfo)
        com.example.spanner.protobuf.SingerProto.SingerInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
        return com.example.spanner.protobuf.SingerProto.internal_static_spanner_examples_music_SingerInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
        return com.example.spanner.protobuf.SingerProto.internal_static_spanner_examples_music_SingerInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.example.spanner.protobuf.SingerProto.SingerInfo.class, com.example.spanner.protobuf.SingerProto.SingerInfo.Builder.class);
      }

      // Construct using com.example.spanner.protobuf.SingerProto.SingerInfo.newBuilder()
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
        singerId_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000001);
        birthDate_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        nationality_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        genre_ = 0;
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
      getDescriptorForType() {
        return com.example.spanner.protobuf.SingerProto.internal_static_spanner_examples_music_SingerInfo_descriptor;
      }

      @java.lang.Override
      public com.example.spanner.protobuf.SingerProto.SingerInfo getDefaultInstanceForType() {
        return com.example.spanner.protobuf.SingerProto.SingerInfo.getDefaultInstance();
      }

      @java.lang.Override
      public com.example.spanner.protobuf.SingerProto.SingerInfo build() {
        com.example.spanner.protobuf.SingerProto.SingerInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.example.spanner.protobuf.SingerProto.SingerInfo buildPartial() {
        com.example.spanner.protobuf.SingerProto.SingerInfo result = new com.example.spanner.protobuf.SingerProto.SingerInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.singerId_ = singerId_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          to_bitField0_ |= 0x00000002;
        }
        result.birthDate_ = birthDate_;
        if (((from_bitField0_ & 0x00000004) != 0)) {
          to_bitField0_ |= 0x00000004;
        }
        result.nationality_ = nationality_;
        if (((from_bitField0_ & 0x00000008) != 0)) {
          to_bitField0_ |= 0x00000008;
        }
        result.genre_ = genre_;
        result.bitField0_ = to_bitField0_;
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
        if (other instanceof com.example.spanner.protobuf.SingerProto.SingerInfo) {
          return mergeFrom((com.example.spanner.protobuf.SingerProto.SingerInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.example.spanner.protobuf.SingerProto.SingerInfo other) {
        if (other == com.example.spanner.protobuf.SingerProto.SingerInfo.getDefaultInstance()) return this;
        if (other.hasSingerId()) {
          setSingerId(other.getSingerId());
        }
        if (other.hasBirthDate()) {
          bitField0_ |= 0x00000002;
          birthDate_ = other.birthDate_;
          onChanged();
        }
        if (other.hasNationality()) {
          bitField0_ |= 0x00000004;
          nationality_ = other.nationality_;
          onChanged();
        }
        if (other.hasGenre()) {
          setGenre(other.getGenre());
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
        com.example.spanner.protobuf.SingerProto.SingerInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.example.spanner.protobuf.SingerProto.SingerInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private long singerId_ ;
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return Whether the singerId field is set.
       */
      @java.lang.Override
      public boolean hasSingerId() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return The singerId.
       */
      @java.lang.Override
      public long getSingerId() {
        return singerId_;
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @param value The singerId to set.
       * @return This builder for chaining.
       */
      public Builder setSingerId(long value) {
        bitField0_ |= 0x00000001;
        singerId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int64 singer_id = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearSingerId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        singerId_ = 0L;
        onChanged();
        return this;
      }

      private java.lang.Object birthDate_ = "";
      /**
       * <code>optional string birth_date = 2;</code>
       * @return Whether the birthDate field is set.
       */
      public boolean hasBirthDate() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return The birthDate.
       */
      public java.lang.String getBirthDate() {
        java.lang.Object ref = birthDate_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            birthDate_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return The bytes for birthDate.
       */
      public com.google.protobuf.ByteString
      getBirthDateBytes() {
        java.lang.Object ref = birthDate_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          birthDate_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @param value The birthDate to set.
       * @return This builder for chaining.
       */
      public Builder setBirthDate(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        birthDate_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearBirthDate() {
        bitField0_ = (bitField0_ & ~0x00000002);
        birthDate_ = getDefaultInstance().getBirthDate();
        onChanged();
        return this;
      }
      /**
       * <code>optional string birth_date = 2;</code>
       * @param value The bytes for birthDate to set.
       * @return This builder for chaining.
       */
      public Builder setBirthDateBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        birthDate_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object nationality_ = "";
      /**
       * <code>optional string nationality = 3;</code>
       * @return Whether the nationality field is set.
       */
      public boolean hasNationality() {
        return ((bitField0_ & 0x00000004) != 0);
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return The nationality.
       */
      public java.lang.String getNationality() {
        java.lang.Object ref = nationality_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            nationality_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return The bytes for nationality.
       */
      public com.google.protobuf.ByteString
      getNationalityBytes() {
        java.lang.Object ref = nationality_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b =
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          nationality_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @param value The nationality to set.
       * @return This builder for chaining.
       */
      public Builder setNationality(
          java.lang.String value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nationality_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearNationality() {
        bitField0_ = (bitField0_ & ~0x00000004);
        nationality_ = getDefaultInstance().getNationality();
        onChanged();
        return this;
      }
      /**
       * <code>optional string nationality = 3;</code>
       * @param value The bytes for nationality to set.
       * @return This builder for chaining.
       */
      public Builder setNationalityBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000004;
        nationality_ = value;
        onChanged();
        return this;
      }

      private int genre_ = 0;
      /**
       * <code>optional .spanner.examples.music.Genre genre = 4;</code>
       * @return Whether the genre field is set.
       */
      @java.lang.Override public boolean hasGenre() {
        return ((bitField0_ & 0x00000008) != 0);
      }
      /**
       * <code>optional .spanner.examples.music.Genre genre = 4;</code>
       * @return The genre.
       */
      @java.lang.Override
      public com.example.spanner.protobuf.SingerProto.Genre getGenre() {
        @SuppressWarnings("deprecation")
        com.example.spanner.protobuf.SingerProto.Genre result = com.example.spanner.protobuf.SingerProto.Genre.valueOf(genre_);
        return result == null ? com.example.spanner.protobuf.SingerProto.Genre.POP : result;
      }
      /**
       * <code>optional .spanner.examples.music.Genre genre = 4;</code>
       * @param value The genre to set.
       * @return This builder for chaining.
       */
      public Builder setGenre(com.example.spanner.protobuf.SingerProto.Genre value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000008;
        genre_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>optional .spanner.examples.music.Genre genre = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearGenre() {
        bitField0_ = (bitField0_ & ~0x00000008);
        genre_ = 0;
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


      // @@protoc_insertion_point(builder_scope:spanner.examples.music.SingerInfo)
    }

    // @@protoc_insertion_point(class_scope:spanner.examples.music.SingerInfo)
    private static final com.example.spanner.protobuf.SingerProto.SingerInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.example.spanner.protobuf.SingerProto.SingerInfo();
    }

    public static com.example.spanner.protobuf.SingerProto.SingerInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<SingerInfo>
        PARSER = new com.google.protobuf.AbstractParser<SingerInfo>() {
      @java.lang.Override
      public SingerInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SingerInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SingerInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SingerInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.example.spanner.protobuf.SingerProto.SingerInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
      internal_static_spanner_examples_music_SingerInfo_descriptor;
  private static final
  com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_spanner_examples_music_SingerInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
  getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
        "\n\014singer.proto\022\026spanner.examples.music\"v" +
            "\n\nSingerInfo\022\021\n\tsinger_id\030\001 \001(\003\022\022\n\nbirth" +
            "_date\030\002 \001(\t\022\023\n\013nationality\030\003 \001(\t\022,\n\005genr" +
            "e\030\004 \001(\0162\035.spanner.examples.music.Genre*." +
            "\n\005Genre\022\007\n\003POP\020\000\022\010\n\004JAZZ\020\001\022\010\n\004FOLK\020\002\022\010\n\004" +
            "ROCK\020\003B4\n#com.example.spanner.protobuf.s" +
            "ingerB\013SingerProtoP\000"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
        .internalBuildGeneratedFileFrom(descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
            });
    internal_static_spanner_examples_music_SingerInfo_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_spanner_examples_music_SingerInfo_fieldAccessorTable = new
        com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_spanner_examples_music_SingerInfo_descriptor,
        new java.lang.String[] { "SingerId", "BirthDate", "Nationality", "Genre", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}