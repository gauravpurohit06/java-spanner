// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: book.proto

package com.example.spanner.protobuf.book;

/**
 * Protobuf type {@code com.book.Book}
 */
public final class Book extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:com.book.Book)
    BookOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Book.newBuilder() to construct.
  private Book(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Book() {
    title_ = "";
    author_ = "";
    genre_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Book();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Book(
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

            isbn_ = input.readInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            title_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            author_ = s;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            genre_ = rawValue;
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
    return com.example.spanner.protobuf.book.BookProto.internal_static_com_book_Book_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
  internalGetFieldAccessorTable() {
    return com.example.spanner.protobuf.book.BookProto.internal_static_com_book_Book_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.example.spanner.protobuf.book.Book.class, com.example.spanner.protobuf.book.Book.Builder.class);
  }

  public static final int ISBN_FIELD_NUMBER = 1;
  private long isbn_;
  /**
   * <code>int64 isbn = 1;</code>
   * @return The isbn.
   */
  @java.lang.Override
  public long getIsbn() {
    return isbn_;
  }

  public static final int TITLE_FIELD_NUMBER = 2;
  private volatile java.lang.Object title_;
  /**
   * <code>string title = 2;</code>
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   * <code>string title = 2;</code>
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int AUTHOR_FIELD_NUMBER = 3;
  private volatile java.lang.Object author_;
  /**
   * <code>string author = 3;</code>
   * @return The author.
   */
  @java.lang.Override
  public java.lang.String getAuthor() {
    java.lang.Object ref = author_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs =
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      author_ = s;
      return s;
    }
  }
  /**
   * <code>string author = 3;</code>
   * @return The bytes for author.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
  getAuthorBytes() {
    java.lang.Object ref = author_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      author_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GENRE_FIELD_NUMBER = 4;
  private int genre_;
  /**
   * <code>.com.book.Genre genre = 4;</code>
   * @return The enum numeric value on the wire for genre.
   */
  @java.lang.Override public int getGenreValue() {
    return genre_;
  }
  /**
   * <code>.com.book.Genre genre = 4;</code>
   * @return The genre.
   */
  @java.lang.Override public com.example.spanner.protobuf.book.Genre getGenre() {
    @SuppressWarnings("deprecation")
    com.example.spanner.protobuf.book.Genre result = com.example.spanner.protobuf.book.Genre.valueOf(genre_);
    return result == null ? com.example.spanner.protobuf.book.Genre.UNRECOGNIZED : result;
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
    if (isbn_ != 0L) {
      output.writeInt64(1, isbn_);
    }
    if (!getTitleBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!getAuthorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, author_);
    }
    if (genre_ != com.example.spanner.protobuf.book.Genre.BLUES.getNumber()) {
      output.writeEnum(4, genre_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isbn_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(1, isbn_);
    }
    if (!getTitleBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!getAuthorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, author_);
    }
    if (genre_ != com.example.spanner.protobuf.book.Genre.BLUES.getNumber()) {
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
    if (!(obj instanceof com.example.spanner.protobuf.book.Book)) {
      return super.equals(obj);
    }
    com.example.spanner.protobuf.book.Book other = (com.example.spanner.protobuf.book.Book) obj;

    if (getIsbn()
        != other.getIsbn()) return false;
    if (!getTitle()
        .equals(other.getTitle())) return false;
    if (!getAuthor()
        .equals(other.getAuthor())) return false;
    if (genre_ != other.genre_) return false;
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
    hash = (37 * hash) + ISBN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getIsbn());
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + AUTHOR_FIELD_NUMBER;
    hash = (53 * hash) + getAuthor().hashCode();
    hash = (37 * hash) + GENRE_FIELD_NUMBER;
    hash = (53 * hash) + genre_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.example.spanner.protobuf.book.Book parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.spanner.protobuf.book.Book parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.example.spanner.protobuf.book.Book parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.example.spanner.protobuf.book.Book parseFrom(
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
  public static Builder newBuilder(com.example.spanner.protobuf.book.Book prototype) {
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
   * Protobuf type {@code com.book.Book}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:com.book.Book)
      com.example.spanner.protobuf.book.BookOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
    getDescriptor() {
      return com.example.spanner.protobuf.book.BookProto.internal_static_com_book_Book_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
    internalGetFieldAccessorTable() {
      return com.example.spanner.protobuf.book.BookProto.internal_static_com_book_Book_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.example.spanner.protobuf.book.Book.class, com.example.spanner.protobuf.book.Book.Builder.class);
    }

    // Construct using com.example.spanner.protobuf.book.Book.newBuilder()
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
      isbn_ = 0L;

      title_ = "";

      author_ = "";

      genre_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
    getDescriptorForType() {
      return com.example.spanner.protobuf.book.BookProto.internal_static_com_book_Book_descriptor;
    }

    @java.lang.Override
    public com.example.spanner.protobuf.book.Book getDefaultInstanceForType() {
      return com.example.spanner.protobuf.book.Book.getDefaultInstance();
    }

    @java.lang.Override
    public com.example.spanner.protobuf.book.Book build() {
      com.example.spanner.protobuf.book.Book result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.example.spanner.protobuf.book.Book buildPartial() {
      com.example.spanner.protobuf.book.Book result = new com.example.spanner.protobuf.book.Book(this);
      result.isbn_ = isbn_;
      result.title_ = title_;
      result.author_ = author_;
      result.genre_ = genre_;
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
      if (other instanceof com.example.spanner.protobuf.book.Book) {
        return mergeFrom((com.example.spanner.protobuf.book.Book)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.example.spanner.protobuf.book.Book other) {
      if (other == com.example.spanner.protobuf.book.Book.getDefaultInstance()) return this;
      if (other.getIsbn() != 0L) {
        setIsbn(other.getIsbn());
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        onChanged();
      }
      if (!other.getAuthor().isEmpty()) {
        author_ = other.author_;
        onChanged();
      }
      if (other.genre_ != 0) {
        setGenreValue(other.getGenreValue());
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
      com.example.spanner.protobuf.book.Book parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.example.spanner.protobuf.book.Book) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long isbn_ ;
    /**
     * <code>int64 isbn = 1;</code>
     * @return The isbn.
     */
    @java.lang.Override
    public long getIsbn() {
      return isbn_;
    }
    /**
     * <code>int64 isbn = 1;</code>
     * @param value The isbn to set.
     * @return This builder for chaining.
     */
    public Builder setIsbn(long value) {

      isbn_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int64 isbn = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearIsbn() {

      isbn_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     * <code>string title = 2;</code>
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString
    getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string title = 2;</code>
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(
        java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      title_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearTitle() {

      title_ = getDefaultInstance().getTitle();
      onChanged();
      return this;
    }
    /**
     * <code>string title = 2;</code>
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      title_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object author_ = "";
    /**
     * <code>string author = 3;</code>
     * @return The author.
     */
    public java.lang.String getAuthor() {
      java.lang.Object ref = author_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        author_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string author = 3;</code>
     * @return The bytes for author.
     */
    public com.google.protobuf.ByteString
    getAuthorBytes() {
      java.lang.Object ref = author_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        author_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string author = 3;</code>
     * @param value The author to set.
     * @return This builder for chaining.
     */
    public Builder setAuthor(
        java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      author_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string author = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAuthor() {

      author_ = getDefaultInstance().getAuthor();
      onChanged();
      return this;
    }
    /**
     * <code>string author = 3;</code>
     * @param value The bytes for author to set.
     * @return This builder for chaining.
     */
    public Builder setAuthorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      author_ = value;
      onChanged();
      return this;
    }

    private int genre_ = 0;
    /**
     * <code>.com.book.Genre genre = 4;</code>
     * @return The enum numeric value on the wire for genre.
     */
    @java.lang.Override public int getGenreValue() {
      return genre_;
    }
    /**
     * <code>.com.book.Genre genre = 4;</code>
     * @param value The enum numeric value on the wire for genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenreValue(int value) {

      genre_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.com.book.Genre genre = 4;</code>
     * @return The genre.
     */
    @java.lang.Override
    public com.example.spanner.protobuf.book.Genre getGenre() {
      @SuppressWarnings("deprecation")
      com.example.spanner.protobuf.book.Genre result = com.example.spanner.protobuf.book.Genre.valueOf(genre_);
      return result == null ? com.example.spanner.protobuf.book.Genre.UNRECOGNIZED : result;
    }
    /**
     * <code>.com.book.Genre genre = 4;</code>
     * @param value The genre to set.
     * @return This builder for chaining.
     */
    public Builder setGenre(com.example.spanner.protobuf.book.Genre value) {
      if (value == null) {
        throw new NullPointerException();
      }

      genre_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.com.book.Genre genre = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearGenre() {

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


    // @@protoc_insertion_point(builder_scope:com.book.Book)
  }

  // @@protoc_insertion_point(class_scope:com.book.Book)
  private static final com.example.spanner.protobuf.book.Book DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.example.spanner.protobuf.book.Book();
  }

  public static com.example.spanner.protobuf.book.Book getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Book>
      PARSER = new com.google.protobuf.AbstractParser<Book>() {
    @java.lang.Override
    public Book parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Book(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Book> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Book> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.example.spanner.protobuf.book.Book getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

