package net.ontopsolutions.computeraverage;

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
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.31.0)",
    comments = "Source: maximum/findmaximum.proto")
public final class OperationServiceGrpc {

  private OperationServiceGrpc() {}

  public static final String SERVICE_NAME = "net.ontopsolutions.maximum.OperationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.FindMaximumRequest,
      net.ontopsolutions.computeraverage.FindMaximumResponse> getFindMaximumMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findMaximum",
      requestType = net.ontopsolutions.computeraverage.FindMaximumRequest.class,
      responseType = net.ontopsolutions.computeraverage.FindMaximumResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.FindMaximumRequest,
      net.ontopsolutions.computeraverage.FindMaximumResponse> getFindMaximumMethod() {
    io.grpc.MethodDescriptor<net.ontopsolutions.computeraverage.FindMaximumRequest, net.ontopsolutions.computeraverage.FindMaximumResponse> getFindMaximumMethod;
    if ((getFindMaximumMethod = OperationServiceGrpc.getFindMaximumMethod) == null) {
      synchronized (OperationServiceGrpc.class) {
        if ((getFindMaximumMethod = OperationServiceGrpc.getFindMaximumMethod) == null) {
          OperationServiceGrpc.getFindMaximumMethod = getFindMaximumMethod =
              io.grpc.MethodDescriptor.<net.ontopsolutions.computeraverage.FindMaximumRequest, net.ontopsolutions.computeraverage.FindMaximumResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findMaximum"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.computeraverage.FindMaximumRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.ontopsolutions.computeraverage.FindMaximumResponse.getDefaultInstance()))
              .setSchemaDescriptor(new OperationServiceMethodDescriptorSupplier("findMaximum"))
              .build();
        }
      }
    }
    return getFindMaximumMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OperationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceStub>() {
        @java.lang.Override
        public OperationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceStub(channel, callOptions);
        }
      };
    return OperationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OperationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceBlockingStub>() {
        @java.lang.Override
        public OperationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceBlockingStub(channel, callOptions);
        }
      };
    return OperationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OperationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OperationServiceFutureStub>() {
        @java.lang.Override
        public OperationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OperationServiceFutureStub(channel, callOptions);
        }
      };
    return OperationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OperationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.FindMaximumResponse> responseObserver) {
      return asyncUnimplementedStreamingCall(getFindMaximumMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getFindMaximumMethod(),
            asyncBidiStreamingCall(
              new MethodHandlers<
                net.ontopsolutions.computeraverage.FindMaximumRequest,
                net.ontopsolutions.computeraverage.FindMaximumResponse>(
                  this, METHODID_FIND_MAXIMUM)))
          .build();
    }
  }

  /**
   */
  public static final class OperationServiceStub extends io.grpc.stub.AbstractAsyncStub<OperationServiceStub> {
    private OperationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.FindMaximumRequest> findMaximum(
        io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.FindMaximumResponse> responseObserver) {
      return asyncBidiStreamingCall(
          getChannel().newCall(getFindMaximumMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class OperationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OperationServiceBlockingStub> {
    private OperationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceBlockingStub(channel, callOptions);
    }
  }

  /**
   */
  public static final class OperationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OperationServiceFutureStub> {
    private OperationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OperationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OperationServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_FIND_MAXIMUM = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final OperationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OperationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_FIND_MAXIMUM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.findMaximum(
              (io.grpc.stub.StreamObserver<net.ontopsolutions.computeraverage.FindMaximumResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    OperationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.ontopsolutions.computeraverage.Findmaximum.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("OperationService");
    }
  }

  private static final class OperationServiceFileDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier {
    OperationServiceFileDescriptorSupplier() {}
  }

  private static final class OperationServiceMethodDescriptorSupplier
      extends OperationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    OperationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (OperationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new OperationServiceFileDescriptorSupplier())
              .addMethod(getFindMaximumMethod())
              .build();
        }
      }
    }
    return result;
  }
}
