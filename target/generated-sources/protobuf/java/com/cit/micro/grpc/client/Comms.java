// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Comms.proto

package com.cit.micro.grpc.client;

public final class Comms {
  private Comms() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cit_micro_grpc_client_ChatMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cit_micro_grpc_client_ChatMessage_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_cit_micro_grpc_client_ChatMessageFromServer_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_cit_micro_grpc_client_ChatMessageFromServer_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Comms.proto\022\031com.cit.micro.grpc.client" +
      "\")\n\013ChatMessage\022\014\n\004name\030\001 \001(\t\022\014\n\004text\030\002 " +
      "\001(\t\"3\n\025ChatMessageFromServer\022\014\n\004name\030\001 \001" +
      "(\t\022\014\n\004text\030\002 \001(\t2\266\002\n\004Chat\022b\n\004join\022&.com." +
      "cit.micro.grpc.client.ChatMessage\0320.com." +
      "cit.micro.grpc.client.ChatMessageFromSer" +
      "ver\"\000\022f\n\004send\022&.com.cit.micro.grpc.clien" +
      "t.ChatMessage\0320.com.cit.micro.grpc.clien" +
      "t.ChatMessageFromServer\"\000(\0010\001\022b\n\004test\022&." +
      "com.cit.micro.grpc.client.ChatMessage\0320." +
      "com.cit.micro.grpc.client.ChatMessageFro" +
      "mServer\"\000B\002P\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_com_cit_micro_grpc_client_ChatMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_cit_micro_grpc_client_ChatMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cit_micro_grpc_client_ChatMessage_descriptor,
        new java.lang.String[] { "Name", "Text", });
    internal_static_com_cit_micro_grpc_client_ChatMessageFromServer_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_cit_micro_grpc_client_ChatMessageFromServer_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_cit_micro_grpc_client_ChatMessageFromServer_descriptor,
        new java.lang.String[] { "Name", "Text", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
