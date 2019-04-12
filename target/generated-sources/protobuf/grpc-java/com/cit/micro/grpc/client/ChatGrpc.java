package com.cit.micro.grpc.client;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 *Service class to be used by the clients
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.16.1)",
    comments = "Source: Comms.proto")
public final class ChatGrpc {

  private ChatGrpc() {}

  public static final String SERVICE_NAME = "com.cit.micro.grpc.client.Chat";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "join",
      requestType = com.cit.micro.grpc.client.ChatMessage.class,
      responseType = com.cit.micro.grpc.client.ChatMessageFromServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getJoinMethod() {
    io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer> getJoinMethod;
    if ((getJoinMethod = ChatGrpc.getJoinMethod) == null) {
      synchronized (ChatGrpc.class) {
        if ((getJoinMethod = ChatGrpc.getJoinMethod) == null) {
          ChatGrpc.getJoinMethod = getJoinMethod = 
              io.grpc.MethodDescriptor.<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cit.micro.grpc.client.Chat", "join"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessageFromServer.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatMethodDescriptorSupplier("join"))
                  .build();
          }
        }
     }
     return getJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getSendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "send",
      requestType = com.cit.micro.grpc.client.ChatMessage.class,
      responseType = com.cit.micro.grpc.client.ChatMessageFromServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getSendMethod() {
    io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer> getSendMethod;
    if ((getSendMethod = ChatGrpc.getSendMethod) == null) {
      synchronized (ChatGrpc.class) {
        if ((getSendMethod = ChatGrpc.getSendMethod) == null) {
          ChatGrpc.getSendMethod = getSendMethod = 
              io.grpc.MethodDescriptor.<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "com.cit.micro.grpc.client.Chat", "send"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessageFromServer.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatMethodDescriptorSupplier("send"))
                  .build();
          }
        }
     }
     return getSendMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getTestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "test",
      requestType = com.cit.micro.grpc.client.ChatMessage.class,
      responseType = com.cit.micro.grpc.client.ChatMessageFromServer.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage,
      com.cit.micro.grpc.client.ChatMessageFromServer> getTestMethod() {
    io.grpc.MethodDescriptor<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer> getTestMethod;
    if ((getTestMethod = ChatGrpc.getTestMethod) == null) {
      synchronized (ChatGrpc.class) {
        if ((getTestMethod = ChatGrpc.getTestMethod) == null) {
          ChatGrpc.getTestMethod = getTestMethod = 
              io.grpc.MethodDescriptor.<com.cit.micro.grpc.client.ChatMessage, com.cit.micro.grpc.client.ChatMessageFromServer>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "com.cit.micro.grpc.client.Chat", "test"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.cit.micro.grpc.client.ChatMessageFromServer.getDefaultInstance()))
                  .setSchemaDescriptor(new ChatMethodDescriptorSupplier("test"))
                  .build();
          }
        }
     }
     return getTestMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ChatStub newStub(io.grpc.Channel channel) {
    return new ChatStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ChatBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ChatFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatFutureStub(channel);
  }

  /**
   * <pre>
   *Service class to be used by the clients
   * </pre>
   */
  public static abstract class ChatImplBase implements io.grpc.BindableService {

    /**
     */
    public void join(com.cit.micro.grpc.client.ChatMessage request,
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      asyncUnimplementedUnaryCall(getJoinMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessage> send(
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      return asyncUnimplementedStreamingCall(getSendMethod(), responseObserver);
    }

    /**
     */
    public void test(com.cit.micro.grpc.client.ChatMessage request,
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      asyncUnimplementedUnaryCall(getTestMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getJoinMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cit.micro.grpc.client.ChatMessage,
                com.cit.micro.grpc.client.ChatMessageFromServer>(
                  this, METHODID_JOIN)))
          .addMethod(
            getSendMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                com.cit.micro.grpc.client.ChatMessage,
                com.cit.micro.grpc.client.ChatMessageFromServer>(
                  this, METHODID_SEND)))
          .addMethod(
            getTestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.cit.micro.grpc.client.ChatMessage,
                com.cit.micro.grpc.client.ChatMessageFromServer>(
                  this, METHODID_TEST)))
          .build();
    }
  }

  /**
   * <pre>
   *Service class to be used by the clients
   * </pre>
   */
  public static final class ChatStub extends io.grpc.stub.AbstractStub<ChatStub> {
    private ChatStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatStub(channel, callOptions);
    }

    /**
     */
    public void join(com.cit.micro.grpc.client.ChatMessage request,
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessage> send(
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getSendMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void test(com.cit.micro.grpc.client.ChatMessage request,
        io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *Service class to be used by the clients
   * </pre>
   */
  public static final class ChatBlockingStub extends io.grpc.stub.AbstractStub<ChatBlockingStub> {
    private ChatBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.cit.micro.grpc.client.ChatMessageFromServer join(com.cit.micro.grpc.client.ChatMessage request) {
      return blockingUnaryCall(
          getChannel(), getJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.cit.micro.grpc.client.ChatMessageFromServer test(com.cit.micro.grpc.client.ChatMessage request) {
      return blockingUnaryCall(
          getChannel(), getTestMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *Service class to be used by the clients
   * </pre>
   */
  public static final class ChatFutureStub extends io.grpc.stub.AbstractStub<ChatFutureStub> {
    private ChatFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cit.micro.grpc.client.ChatMessageFromServer> join(
        com.cit.micro.grpc.client.ChatMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.cit.micro.grpc.client.ChatMessageFromServer> test(
        com.cit.micro.grpc.client.ChatMessage request) {
      return futureUnaryCall(
          getChannel().newCall(getTestMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_JOIN = 0;
  private static final int METHODID_TEST = 1;
  private static final int METHODID_SEND = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ChatImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ChatImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_JOIN:
          serviceImpl.join((com.cit.micro.grpc.client.ChatMessage) request,
              (io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer>) responseObserver);
          break;
        case METHODID_TEST:
          serviceImpl.test((com.cit.micro.grpc.client.ChatMessage) request,
              (io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.send(
              (io.grpc.stub.StreamObserver<com.cit.micro.grpc.client.ChatMessageFromServer>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ChatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ChatBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.cit.micro.grpc.client.Comms.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Chat");
    }
  }

  private static final class ChatFileDescriptorSupplier
      extends ChatBaseDescriptorSupplier {
    ChatFileDescriptorSupplier() {}
  }

  private static final class ChatMethodDescriptorSupplier
      extends ChatBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ChatMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ChatGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ChatFileDescriptorSupplier())
              .addMethod(getJoinMethod())
              .addMethod(getSendMethod())
              .addMethod(getTestMethod())
              .build();
        }
      }
    }
    return result;
  }
}
