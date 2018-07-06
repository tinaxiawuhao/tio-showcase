// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code JoinGroupRespBody}
 */
public final class JoinGroupRespBody extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:JoinGroupRespBody)
		JoinGroupRespBodyOrBuilder {
	/**
	 * Protobuf type {@code JoinGroupRespBody}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:JoinGroupRespBody)
			org.tio.examples.im.common.packets.JoinGroupRespBodyOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_JoinGroupRespBody_descriptor;
		}

		private int result_ = 0;

		private java.lang.Object group_ = "";

		// Construct using org.tio.examples.im.common.packets.JoinGroupRespBody.newBuilder()
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
		public org.tio.examples.im.common.packets.JoinGroupRespBody build() {
			org.tio.examples.im.common.packets.JoinGroupRespBody result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.JoinGroupRespBody buildPartial() {
			org.tio.examples.im.common.packets.JoinGroupRespBody result = new org.tio.examples.im.common.packets.JoinGroupRespBody(this);
			result.result_ = result_;
			result.group_ = group_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			result_ = 0;

			group_ = "";

			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		/**
		 * <code>string group = 2;</code>
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
		 * <code>.JoinGroupResult result = 1;</code>
		 */
		public Builder clearResult() {

			result_ = 0;
			onChanged();
			return this;
		}

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public org.tio.examples.im.common.packets.JoinGroupRespBody getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.JoinGroupRespBody.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_JoinGroupRespBody_descriptor;
		}

		/**
		 * <code>string group = 2;</code>
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
		 * <code>string group = 2;</code>
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
		 * <code>.JoinGroupResult result = 1;</code>
		 */
		@Override
		public org.tio.examples.im.common.packets.JoinGroupResult getResult() {
			org.tio.examples.im.common.packets.JoinGroupResult result = org.tio.examples.im.common.packets.JoinGroupResult.valueOf(result_);
			return result == null ? org.tio.examples.im.common.packets.JoinGroupResult.UNRECOGNIZED : result;
		}

		/**
		 * <code>.JoinGroupResult result = 1;</code>
		 */
		@Override
		public int getResultValue() {
			return result_;
		}

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_JoinGroupRespBody_fieldAccessorTable.ensureFieldAccessorsInitialized(
					org.tio.examples.im.common.packets.JoinGroupRespBody.class, org.tio.examples.im.common.packets.JoinGroupRespBody.Builder.class);
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
			org.tio.examples.im.common.packets.JoinGroupRespBody parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.JoinGroupRespBody) e.getUnfinishedMessage();
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
			if (other instanceof org.tio.examples.im.common.packets.JoinGroupRespBody) {
				return mergeFrom((org.tio.examples.im.common.packets.JoinGroupRespBody) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.JoinGroupRespBody other) {
			if (other == org.tio.examples.im.common.packets.JoinGroupRespBody.getDefaultInstance()) {
				return this;
			}
			if (other.result_ != 0) {
				setResultValue(other.getResultValue());
			}
			if (!other.getGroup().isEmpty()) {
				group_ = other.group_;
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
		 * <code>string group = 2;</code>
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
		 * <code>string group = 2;</code>
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
		 * <code>.JoinGroupResult result = 1;</code>
		 */
		public Builder setResult(org.tio.examples.im.common.packets.JoinGroupResult value) {
			if (value == null) {
				throw new NullPointerException();
			}

			result_ = value.getNumber();
			onChanged();
			return this;
		}

		/**
		 * <code>.JoinGroupResult result = 1;</code>
		 */
		public Builder setResultValue(int value) {
			result_ = value;
			onChanged();
			return this;
		}

		@Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:JoinGroupRespBody)
	}

	public static final int RESULT_FIELD_NUMBER = 1;

	public static final int GROUP_FIELD_NUMBER = 2;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:JoinGroupRespBody)
	private static final org.tio.examples.im.common.packets.JoinGroupRespBody DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.JoinGroupRespBody();
	}

	private static final com.google.protobuf.Parser<JoinGroupRespBody> PARSER = new com.google.protobuf.AbstractParser<JoinGroupRespBody>() {
		@Override
		public JoinGroupRespBody parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new JoinGroupRespBody(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.JoinGroupRespBody getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_JoinGroupRespBody_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.JoinGroupRespBody prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.JoinGroupRespBody parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<JoinGroupRespBody> parser() {
		return PARSER;
	}

	private int result_;

	private volatile java.lang.Object group_;

	private byte memoizedIsInitialized = -1;

	private JoinGroupRespBody() {
		result_ = 0;
		group_ = "";
	}

	private JoinGroupRespBody(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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
					int rawValue = input.readEnum();

					result_ = rawValue;
					break;
				}
				case 18: {
					java.lang.String s = input.readStringRequireUtf8();

					group_ = s;
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

	// Use JoinGroupRespBody.newBuilder() to construct.
	private JoinGroupRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.JoinGroupRespBody)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.JoinGroupRespBody other = (org.tio.examples.im.common.packets.JoinGroupRespBody) obj;

		boolean result = true;
		result = result && result_ == other.result_;
		result = result && getGroup().equals(other.getGroup());
		return result;
	}

	@Override
	public org.tio.examples.im.common.packets.JoinGroupRespBody getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <code>string group = 2;</code>
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
	 * <code>string group = 2;</code>
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
	public com.google.protobuf.Parser<JoinGroupRespBody> getParserForType() {
		return PARSER;
	}

	/**
	 * <code>.JoinGroupResult result = 1;</code>
	 */
	@Override
	public org.tio.examples.im.common.packets.JoinGroupResult getResult() {
		org.tio.examples.im.common.packets.JoinGroupResult result = org.tio.examples.im.common.packets.JoinGroupResult.valueOf(result_);
		return result == null ? org.tio.examples.im.common.packets.JoinGroupResult.UNRECOGNIZED : result;
	}

	/**
	 * <code>.JoinGroupResult result = 1;</code>
	 */
	@Override
	public int getResultValue() {
		return result_;
	}

	@Override
	public int getSerializedSize() {
		int size = memoizedSize;
		if (size != -1) {
			return size;
		}

		size = 0;
		if (result_ != org.tio.examples.im.common.packets.JoinGroupResult.JOIN_GROUP_RESULT_UNKNOW.getNumber()) {
			size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, result_);
		}
		if (!getGroupBytes().isEmpty()) {
			size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, group_);
		}
		memoizedSize = size;
		return size;
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
		hash = 37 * hash + RESULT_FIELD_NUMBER;
		hash = 53 * hash + result_;
		hash = 37 * hash + GROUP_FIELD_NUMBER;
		hash = 53 * hash + getGroup().hashCode();
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_JoinGroupRespBody_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.JoinGroupRespBody.class, org.tio.examples.im.common.packets.JoinGroupRespBody.Builder.class);
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
		if (result_ != org.tio.examples.im.common.packets.JoinGroupResult.JOIN_GROUP_RESULT_UNKNOW.getNumber()) {
			output.writeEnum(1, result_);
		}
		if (!getGroupBytes().isEmpty()) {
			com.google.protobuf.GeneratedMessageV3.writeString(output, 2, group_);
		}
	}

}
