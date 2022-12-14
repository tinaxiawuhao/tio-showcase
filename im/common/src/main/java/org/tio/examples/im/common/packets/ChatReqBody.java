// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code ChatReqBody}
 */
public final class ChatReqBody extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:ChatReqBody)
		ChatReqBodyOrBuilder {
	/**
	 * Protobuf type {@code ChatReqBody}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:ChatReqBody)
			org.tio.examples.im.common.packets.ChatReqBodyOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatReqBody_descriptor;
		}

		private long time_;

		private int type_ = 0;

		private java.lang.Object text_ = "";

		private java.lang.Object group_ = "";

		private java.lang.Object toId_ = "";

		// Construct using org.tio.examples.im.common.packets.ChatReqBody.newBuilder()
		private Builder() {
			maybeForceBuilderInitialization();
		}

		private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
			super(parent);
			maybeForceBuilderInitialization();
		}

		@Override
		public Builder addRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.addRepeatedField(field, value);
		}

		@Override
		public org.tio.examples.im.common.packets.ChatReqBody build() {
			org.tio.examples.im.common.packets.ChatReqBody result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.ChatReqBody buildPartial() {
			org.tio.examples.im.common.packets.ChatReqBody result = new org.tio.examples.im.common.packets.ChatReqBody(this);
			result.time_ = time_;
			result.type_ = type_;
			result.text_ = text_;
			result.group_ = group_;
			result.toId_ = toId_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			time_ = 0L;

			type_ = 0;

			text_ = "";

			group_ = "";

			toId_ = "";

			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		/**
		 * <pre>
		 *????????????????????????
		 * </pre>
		 *
		 * <code>string group = 4;</code>
		 */
		public Builder clearGroup() {

			group_ = getDefaultInstance().getGroup();
			onChanged();
			return this;
		}

		@Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder clearText() {

			text_ = getDefaultInstance().getText();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *??????????????????
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		public Builder clearTime() {

			time_ = 0L;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *??????channel id
		 * </pre>
		 *
		 * <code>string toId = 5;</code>
		 */
		public Builder clearToId() {

			toId_ = getDefaultInstance().getToId();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder clearType() {

			type_ = 0;
			onChanged();
			return this;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public org.tio.examples.im.common.packets.ChatReqBody getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.ChatReqBody.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatReqBody_descriptor;
		}

		/**
		 * <pre>
		 *????????????????????????
		 * </pre>
		 *
		 * <code>string group = 4;</code>
		 */
		@Override
		public java.lang.String getGroup() {
			java.lang.Object ref = group_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				group_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *????????????????????????
		 * </pre>
		 *
		 * <code>string group = 4;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getGroupBytes() {
			java.lang.Object ref = group_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				group_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		@Override
		public java.lang.String getText() {
			java.lang.Object ref = text_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				text_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getTextBytes() {
			java.lang.Object ref = text_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				text_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *??????????????????
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		@Override
		public long getTime() {
			return time_;
		}

		/**
		 * <pre>
		 *??????channel id
		 * </pre>
		 *
		 * <code>string toId = 5;</code>
		 */
		@Override
		public java.lang.String getToId() {
			java.lang.Object ref = toId_;
			if (!(ref instanceof java.lang.String)) {
				com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
				java.lang.String s = bs.toStringUtf8();
				toId_ = s;
				return s;
			} else {
				return (java.lang.String) ref;
			}
		}

		/**
		 * <pre>
		 *??????channel id
		 * </pre>
		 *
		 * <code>string toId = 5;</code>
		 */
		@Override
		public com.google.protobuf.ByteString getToIdBytes() {
			java.lang.Object ref = toId_;
			if (ref instanceof String) {
				com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
				toId_ = b;
				return b;
			} else {
				return (com.google.protobuf.ByteString) ref;
			}
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.ChatType getType() {
			org.tio.examples.im.common.packets.ChatType result = org.tio.examples.im.common.packets.ChatType.valueOf(type_);
			return result == null ? org.tio.examples.im.common.packets.ChatType.UNRECOGNIZED : result;
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		@Override
		public int getTypeValue() {
			return type_;
		}

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_ChatReqBody_fieldAccessorTable
					.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.ChatReqBody.class, org.tio.examples.im.common.packets.ChatReqBody.Builder.class);
		}

		@Override
		public final boolean isInitialized() {
			return true;
		}

		private void maybeForceBuilderInitialization() {
			if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
			}
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
			org.tio.examples.im.common.packets.ChatReqBody parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.ChatReqBody) e.getUnfinishedMessage();
				throw e.unwrapIOException();
			} finally {
				if (parsedMessage != null) {
					mergeFrom(parsedMessage);
				}
			}
			return this;
		}

		@Override
		public Builder mergeFrom(com.google.protobuf.Message other) {
			if (other instanceof org.tio.examples.im.common.packets.ChatReqBody) {
				return mergeFrom((org.tio.examples.im.common.packets.ChatReqBody) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.ChatReqBody other) {
			if (other == org.tio.examples.im.common.packets.ChatReqBody.getDefaultInstance()) {
				return this;
			}
			if (other.getTime() != 0L) {
				setTime(other.getTime());
			}
			if (other.type_ != 0) {
				setTypeValue(other.getTypeValue());
			}
			if (!other.getText().isEmpty()) {
				text_ = other.text_;
				onChanged();
			}
			if (!other.getGroup().isEmpty()) {
				group_ = other.group_;
				onChanged();
			}
			if (!other.getToId().isEmpty()) {
				toId_ = other.toId_;
				onChanged();
			}
			onChanged();
			return this;
		}

		@Override
		public final Builder mergeUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		@Override
		public Builder setField(com.google.protobuf.Descriptors.FieldDescriptor field, Object value) {
			return super.setField(field, value);
		}

		/**
		 * <pre>
		 *????????????????????????
		 * </pre>
		 *
		 * <code>string group = 4;</code>
		 */
		public Builder setGroup(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			group_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *????????????????????????
		 * </pre>
		 *
		 * <code>string group = 4;</code>
		 */
		public Builder setGroupBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			group_ = value;
			onChanged();
			return this;
		}

		@Override
		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
			return super.setRepeatedField(field, index, value);
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder setText(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			text_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>string text = 3;</code>
		 */
		public Builder setTextBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			text_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *??????????????????
		 * </pre>
		 *
		 * <code>int64 time = 1;</code>
		 */
		public Builder setTime(long value) {

			time_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *??????channel id
		 * </pre>
		 *
		 * <code>string toId = 5;</code>
		 */
		public Builder setToId(java.lang.String value) {
			if (value == null) {
				throw new NullPointerException();
			}

			toId_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *??????channel id
		 * </pre>
		 *
		 * <code>string toId = 5;</code>
		 */
		public Builder setToIdBytes(com.google.protobuf.ByteString value) {
			if (value == null) {
				throw new NullPointerException();
			}
			checkByteStringIsUtf8(value);

			toId_ = value;
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder setType(org.tio.examples.im.common.packets.ChatType value) {
			if (value == null) {
				throw new NullPointerException();
			}

			type_ = value.getNumber();
			onChanged();
			return this;
		}

		/**
		 * <pre>
		 *????????????
		 * </pre>
		 *
		 * <code>.ChatType type = 2;</code>
		 */
		public Builder setTypeValue(int value) {
			type_ = value;
			onChanged();
			return this;
		}

		@Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:ChatReqBody)
	}

	public static final int TIME_FIELD_NUMBER = 1;

	public static final int TYPE_FIELD_NUMBER = 2;

	public static final int TEXT_FIELD_NUMBER = 3;

	public static final int GROUP_FIELD_NUMBER = 4;

	public static final int TOID_FIELD_NUMBER = 5;

	private static final long serialVersionUID = 0L;
	// @@protoc_insertion_point(class_scope:ChatReqBody)
	private static final org.tio.examples.im.common.packets.ChatReqBody DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.ChatReqBody();
	}

	private static final com.google.protobuf.Parser<ChatReqBody> PARSER = new com.google.protobuf.AbstractParser<ChatReqBody>() {
		@Override
		public ChatReqBody parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new ChatReqBody(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.ChatReqBody getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ChatReqBody_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.ChatReqBody prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.ChatReqBody parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<ChatReqBody> parser() {
		return PARSER;
	}

	private long time_;

	private int type_;

	private volatile java.lang.Object text_;

	private volatile java.lang.Object group_;

	private volatile java.lang.Object toId_;

	private byte memoizedIsInitialized = -1;

	private ChatReqBody() {
		time_ = 0L;
		type_ = 0;
		text_ = "";
		group_ = "";
		toId_ = "";
	}

	private ChatReqBody(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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
				case 8: {

					time_ = input.readInt64();
					break;
				}
				case 16: {
					int rawValue = input.readEnum();

					type_ = rawValue;
					break;
				}
				case 26: {
					java.lang.String s = input.readStringRequireUtf8();

					text_ = s;
					break;
				}
				case 34: {
					java.lang.String s = input.readStringRequireUtf8();

					group_ = s;
					break;
				}
				case 42: {
					java.lang.String s = input.readStringRequireUtf8();

					toId_ = s;
					break;
				}
				}
			}
		} catch (com.google.protobuf.InvalidProtocolBufferException e) {
			throw e.setUnfinishedMessage(this);
		} catch (java.io.IOException e) {
			throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
		} finally {
			makeExtensionsImmutable();
		}
	}

	// Use ChatReqBody.newBuilder() to construct.
	private ChatReqBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.ChatReqBody)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.ChatReqBody other = (org.tio.examples.im.common.packets.ChatReqBody) obj;

		boolean result = true;
		result = result && getTime() == other.getTime();
		result = result && type_ == other.type_;
		result = result && getText().equals(other.getText());
		result = result && getGroup().equals(other.getGroup());
		result = result && getToId().equals(other.getToId());
		return result;
	}

	@Override
	public org.tio.examples.im.common.packets.ChatReqBody getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <pre>
	 *????????????????????????
	 * </pre>
	 *
	 * <code>string group = 4;</code>
	 */
	@Override
	public java.lang.String getGroup() {
		java.lang.Object ref = group_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			group_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *????????????????????????
	 * </pre>
	 *
	 * <code>string group = 4;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getGroupBytes() {
		java.lang.Object ref = group_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			group_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	@java.lang.Override
	public com.google.protobuf.Parser<ChatReqBody> getParserForType() {
		return PARSER;
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (time_ != 0L) {
			size += com.google.protobuf.CodedOutputStream.computeInt64Size(1, time_);
		}
		if (type_ != org.tio.examples.im.common.packets.ChatType.CHAT_TYPE_UNKNOW.getNumber()) {
			size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, type_);
		}
		if (!getTextBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, text_);
		}
		if (!getGroupBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, group_);
		}
		if (!getToIdBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, toId_);
		}
		memoizedSize = size;
		return size;
	}

	/**
	 * <pre>
	 *????????????
	 * </pre>
	 *
	 * <code>string text = 3;</code>
	 */
	@Override
	public java.lang.String getText() {
		java.lang.Object ref = text_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			text_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *????????????
	 * </pre>
	 *
	 * <code>string text = 3;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getTextBytes() {
		java.lang.Object ref = text_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			text_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	/**
	 * <pre>
	 *??????????????????
	 * </pre>
	 *
	 * <code>int64 time = 1;</code>
	 */
	@Override
	public long getTime() {
		return time_;
	}

	/**
	 * <pre>
	 *??????channel id
	 * </pre>
	 *
	 * <code>string toId = 5;</code>
	 */
	@Override
	public java.lang.String getToId() {
		java.lang.Object ref = toId_;
		if (ref instanceof java.lang.String) {
			return (java.lang.String) ref;
		} else {
			com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
			java.lang.String s = bs.toStringUtf8();
			toId_ = s;
			return s;
		}
	}

	/**
	 * <pre>
	 *??????channel id
	 * </pre>
	 *
	 * <code>string toId = 5;</code>
	 */
	@Override
	public com.google.protobuf.ByteString getToIdBytes() {
		java.lang.Object ref = toId_;
		if (ref instanceof java.lang.String) {
			com.google.protobuf.ByteString b = com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
			toId_ = b;
			return b;
		} else {
			return (com.google.protobuf.ByteString) ref;
		}
	}

	/**
	 * <pre>
	 *????????????
	 * </pre>
	 *
	 * <code>.ChatType type = 2;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.ChatType getType() {
		org.tio.examples.im.common.packets.ChatType result = org.tio.examples.im.common.packets.ChatType.valueOf(type_);
		return result == null ? org.tio.examples.im.common.packets.ChatType.UNRECOGNIZED : result;
	}

	/**
	 * <pre>
	 *????????????
	 * </pre>
	 *
	 * <code>.ChatType type = 2;</code>
	 */
	@Override
	public int getTypeValue() {
		return type_;
	}

	@java.lang.Override
	public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
		return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
	}

	@java.lang.Override
	public int hashCode() {
		if (memoizedHashCode != 0) {
			return memoizedHashCode;
		}
		int hash = 41;
		hash = 19 * hash + getDescriptor().hashCode();
		hash = 37 * hash + TIME_FIELD_NUMBER;
		hash = 53 * hash + com.google.protobuf.Internal.hashLong(getTime());
		hash = 37 * hash + TYPE_FIELD_NUMBER;
		hash = 53 * hash + type_;
		hash = 37 * hash + TEXT_FIELD_NUMBER;
		hash = 53 * hash + getText().hashCode();
		hash = 37 * hash + GROUP_FIELD_NUMBER;
		hash = 53 * hash + getGroup().hashCode();
		hash = 37 * hash + TOID_FIELD_NUMBER;
		hash = 53 * hash + getToId().hashCode();
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_ChatReqBody_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.ChatReqBody.class, org.tio.examples.im.common.packets.ChatReqBody.Builder.class);
	}

	@Override
	public final boolean isInitialized() {
		byte isInitialized = memoizedIsInitialized;
		if (isInitialized == 1) {
			return true;
		}
		if (isInitialized == 0) {
			return false;
		}

		memoizedIsInitialized = 1;
		return true;
	}

	@Override
	public Builder newBuilderForType() {
		return newBuilder();
	}

	@java.lang.Override
	protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
		Builder builder = new Builder(parent);
		return builder;
	}

	@Override
	public Builder toBuilder() {
		return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
	}

	@Override
	public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
		if (time_ != 0L) {
			output.writeInt64(1, time_);
		}
		if (type_ != org.tio.examples.im.common.packets.ChatType.CHAT_TYPE_UNKNOW.getNumber()) {
			output.writeEnum(2, type_);
		}
		if (!getTextBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 3, text_);
		}
		if (!getGroupBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 4, group_);
		}
		if (!getToIdBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 5, toId_);
		}
	}

}
