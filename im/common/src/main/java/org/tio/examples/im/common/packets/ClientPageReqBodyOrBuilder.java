// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat.proto

package org.tio.examples.im.common.packets;

public interface ClientPageReqBodyOrBuilder extends
		// @@protoc_insertion_point(interface_extends:ClientPageReqBody)
		com.google.protobuf.MessageOrBuilder {

	/**
	 * <pre>
	 *如果没有，则表示获取所有的
	 * </pre>
	 *
	 * <code>string group = 3;</code>
	 */
	java.lang.String getGroup();

	/**
	 * <pre>
	 *如果没有，则表示获取所有的
	 * </pre>
	 *
	 * <code>string group = 3;</code>
	 */
	com.google.protobuf.ByteString getGroupBytes();

	/**
	 * <pre>
	 *第几页
	 * </pre>
	 *
	 * <code>int32 pageIndex = 1;</code>
	 */
	int getPageIndex();

	/**
	 * <pre>
	 *每页多少条
	 * </pre>
	 *
	 * <code>int32 pageSize = 2;</code>
	 */
	int getPageSize();
}
