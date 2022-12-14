// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

/**
 * Protobuf type {@code EndLiveRespBody}
 */
public final class EndLiveRespBody extends com.google.protobuf.GeneratedMessageV3 implements
		// @@protoc_insertion_point(message_implements:EndLiveRespBody)
		EndLiveRespBodyOrBuilder {
	/**
	 * Protobuf type {@code EndLiveRespBody}
	 */
	public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
			// @@protoc_insertion_point(builder_implements:EndLiveRespBody)
			org.tio.examples.im.common.packets.EndLiveRespBodyOrBuilder {
		public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
			return org.tio.examples.im.common.packets.Chat.internal_static_EndLiveRespBody_descriptor;
		}

		private long time_;

		private long liveid_;

		// Construct using org.tio.examples.im.common.packets.EndLiveRespBody.newBuilder()
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
		public org.tio.examples.im.common.packets.EndLiveRespBody build() {
			org.tio.examples.im.common.packets.EndLiveRespBody result = buildPartial();
			if (!result.isInitialized()) {
				throw newUninitializedMessageException(result);
			}
			return result;
		}

		@Override
		public org.tio.examples.im.common.packets.EndLiveRespBody buildPartial() {
			org.tio.examples.im.common.packets.EndLiveRespBody result = new org.tio.examples.im.common.packets.EndLiveRespBody(this);
			result.time_ = time_;
			result.liveid_ = liveid_;
			onBuilt();
			return result;
		}

		@Override
		public Builder clear() {
			super.clear();
			time_ = 0L;

			liveid_ = 0L;

			return this;
		}

		@Override
		public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
			return super.clearField(field);
		}

		/**
		 * <pre>
		 *????????????id
		 * </pre>
		 *
		 * <code>int64 liveid = 2;</code>
		 */
		public Builder clearLiveid() {

			liveid_ = 0L;
			onChanged();
			return this;
		}

		@Override
		public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
			return super.clearOneof(oneof);
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

		@Override
		public Builder clone() {
			return super.clone();
		}

		@Override
		public org.tio.examples.im.common.packets.EndLiveRespBody getDefaultInstanceForType() {
			return org.tio.examples.im.common.packets.EndLiveRespBody.getDefaultInstance();
		}

		@Override
		public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
			return org.tio.examples.im.common.packets.Chat.internal_static_EndLiveRespBody_descriptor;
		}

		/**
		 * <pre>
		 *????????????id
		 * </pre>
		 *
		 * <code>int64 liveid = 2;</code>
		 */
		@Override
		public long getLiveid() {
			return liveid_;
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

		@Override
		protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
			return org.tio.examples.im.common.packets.Chat.internal_static_EndLiveRespBody_fieldAccessorTable
					.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.EndLiveRespBody.class, org.tio.examples.im.common.packets.EndLiveRespBody.Builder.class);
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
			org.tio.examples.im.common.packets.EndLiveRespBody parsedMessage = null;
			try {
				parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
			} catch (com.google.protobuf.InvalidProtocolBufferException e) {
				parsedMessage = (org.tio.examples.im.common.packets.EndLiveRespBody) e.getUnfinishedMessage();
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
			if (other instanceof org.tio.examples.im.common.packets.EndLiveRespBody) {
				return mergeFrom((org.tio.examples.im.common.packets.EndLiveRespBody) other);
			} else {
				super.mergeFrom(other);
				return this;
			}
		}

		public Builder mergeFrom(org.tio.examples.im.common.packets.EndLiveRespBody other) {
			if (other == org.tio.examples.im.common.packets.EndLiveRespBody.getDefaultInstance()) {
				return this;
			}
			if (other.getTime() != 0L) {
				setTime(other.getTime());
			}
			if (other.getLiveid() != 0L) {
				setLiveid(other.getLiveid());
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
		 *????????????id
		 * </pre>
		 *
		 * <code>int64 liveid = 2;</code>
		 */
		public Builder setLiveid(long value) {

			liveid_ = value;
			onChanged();
			return this;
		}

		@Override
		public Builder setRepeatedField(com.google.protobuf.Descriptors.FieldDescriptor field, int index, Object value) {
			return super.setRepeatedField(field, index, value);
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

		@Override
		public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
			return this;
		}

		// @@protoc_insertion_point(builder_scope:EndLiveRespBody)
	}

	public static final int TIME_FIELD_NUMBER = 1;

	public static final int LIVEID_FIELD_NUMBER = 2;

	private static final long serialVersionUID = 0L;

	// @@protoc_insertion_point(class_scope:EndLiveRespBody)
	private static final org.tio.examples.im.common.packets.EndLiveRespBody DEFAULT_INSTANCE;

	static {
		DEFAULT_INSTANCE = new org.tio.examples.im.common.packets.EndLiveRespBody();
	}

	private static final com.google.protobuf.Parser<EndLiveRespBody> PARSER = new com.google.protobuf.AbstractParser<EndLiveRespBody>() {
		@Override
		public EndLiveRespBody parsePartialFrom(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
				throws com.google.protobuf.InvalidProtocolBufferException {
			return new EndLiveRespBody(input, extensionRegistry);
		}
	};

	public static org.tio.examples.im.common.packets.EndLiveRespBody getDefaultInstance() {
		return DEFAULT_INSTANCE;
	}

	public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
		return org.tio.examples.im.common.packets.Chat.internal_static_EndLiveRespBody_descriptor;
	}

	public static Builder newBuilder() {
		return DEFAULT_INSTANCE.toBuilder();
	}

	public static Builder newBuilder(org.tio.examples.im.common.packets.EndLiveRespBody prototype) {
		return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseDelimitedFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(com.google.protobuf.ByteString data) throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(com.google.protobuf.ByteString data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws com.google.protobuf.InvalidProtocolBufferException {
		return PARSER.parseFrom(data, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(com.google.protobuf.CodedInputStream input,
			com.google.protobuf.ExtensionRegistryLite extensionRegistry) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(java.io.InputStream input) throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
	}

	public static org.tio.examples.im.common.packets.EndLiveRespBody parseFrom(java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
			throws java.io.IOException {
		return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input, extensionRegistry);
	}

	public static com.google.protobuf.Parser<EndLiveRespBody> parser() {
		return PARSER;
	}

	private long time_;

	private long liveid_;

	private byte memoizedIsInitialized = -1;

	private EndLiveRespBody() {
		time_ = 0L;
		liveid_ = 0L;
	}

	private EndLiveRespBody(com.google.protobuf.CodedInputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
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

					liveid_ = input.readInt64();
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

	// Use EndLiveRespBody.newBuilder() to construct.
	private EndLiveRespBody(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
		super(builder);
	}

	@java.lang.Override
	public boolean equals(final java.lang.Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof org.tio.examples.im.common.packets.EndLiveRespBody)) {
			return super.equals(obj);
		}
		org.tio.examples.im.common.packets.EndLiveRespBody other = (org.tio.examples.im.common.packets.EndLiveRespBody) obj;

		boolean result = true;
		result = result && getTime() == other.getTime();
		result = result && getLiveid() == other.getLiveid();
		return result;
	}

	@Override
	public org.tio.examples.im.common.packets.EndLiveRespBody getDefaultInstanceForType() {
		return DEFAULT_INSTANCE;
	}

	/**
	 * <pre>
	 *????????????id
	 * </pre>
	 *
	 * <code>int64 liveid = 2;</code>
	 */
	@Override
	public long getLiveid() {
		return liveid_;
	}

	@java.lang.Override
	public com.google.protobuf.Parser<EndLiveRespBody> getParserForType() {
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
		if (liveid_ != 0L) {
			size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, liveid_);
		}
		memoizedSize = size;
		return size;
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
		hash = 37 * hash + LIVEID_FIELD_NUMBER;
		hash = 53 * hash + com.google.protobuf.Internal.hashLong(getLiveid());
		hash = 29 * hash + unknownFields.hashCode();
		memoizedHashCode = hash;
		return hash;
	}

	@Override
	protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
		return org.tio.examples.im.common.packets.Chat.internal_static_EndLiveRespBody_fieldAccessorTable
				.ensureFieldAccessorsInitialized(org.tio.examples.im.common.packets.EndLiveRespBody.class, org.tio.examples.im.common.packets.EndLiveRespBody.Builder.class);
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
		if (liveid_ != 0L) {
			output.writeInt64(2, liveid_);
		}
	}

}
