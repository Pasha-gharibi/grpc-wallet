package pasha.grpc.wallet.cache;

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
    value = "by gRPC proto compiler (version 1.20.0)",
    comments = "Source: wallet.proto")
public final class WalletServiceGrpc {

  private WalletServiceGrpc() {}

  public static final String SERVICE_NAME = "WalletService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.DepositRequest,
      pasha.grpc.wallet.cache.Wallet.DepositResponse> getDepositMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Deposit",
      requestType = pasha.grpc.wallet.cache.Wallet.DepositRequest.class,
      responseType = pasha.grpc.wallet.cache.Wallet.DepositResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.DepositRequest,
      pasha.grpc.wallet.cache.Wallet.DepositResponse> getDepositMethod() {
    io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.DepositRequest, pasha.grpc.wallet.cache.Wallet.DepositResponse> getDepositMethod;
    if ((getDepositMethod = WalletServiceGrpc.getDepositMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getDepositMethod = WalletServiceGrpc.getDepositMethod) == null) {
          WalletServiceGrpc.getDepositMethod = getDepositMethod = 
              io.grpc.MethodDescriptor.<pasha.grpc.wallet.cache.Wallet.DepositRequest, pasha.grpc.wallet.cache.Wallet.DepositResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WalletService", "Deposit"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.DepositRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.DepositResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("Deposit"))
                  .build();
          }
        }
     }
     return getDepositMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.WithdrawRequest,
      pasha.grpc.wallet.cache.Wallet.WithdrawResponse> getWithdrawMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Withdraw",
      requestType = pasha.grpc.wallet.cache.Wallet.WithdrawRequest.class,
      responseType = pasha.grpc.wallet.cache.Wallet.WithdrawResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.WithdrawRequest,
      pasha.grpc.wallet.cache.Wallet.WithdrawResponse> getWithdrawMethod() {
    io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.WithdrawRequest, pasha.grpc.wallet.cache.Wallet.WithdrawResponse> getWithdrawMethod;
    if ((getWithdrawMethod = WalletServiceGrpc.getWithdrawMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getWithdrawMethod = WalletServiceGrpc.getWithdrawMethod) == null) {
          WalletServiceGrpc.getWithdrawMethod = getWithdrawMethod = 
              io.grpc.MethodDescriptor.<pasha.grpc.wallet.cache.Wallet.WithdrawRequest, pasha.grpc.wallet.cache.Wallet.WithdrawResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WalletService", "Withdraw"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.WithdrawRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.WithdrawResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("Withdraw"))
                  .build();
          }
        }
     }
     return getWithdrawMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.BalanceRequest,
      pasha.grpc.wallet.cache.Wallet.BalanceResponse> getBalanceMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Balance",
      requestType = pasha.grpc.wallet.cache.Wallet.BalanceRequest.class,
      responseType = pasha.grpc.wallet.cache.Wallet.BalanceResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.BalanceRequest,
      pasha.grpc.wallet.cache.Wallet.BalanceResponse> getBalanceMethod() {
    io.grpc.MethodDescriptor<pasha.grpc.wallet.cache.Wallet.BalanceRequest, pasha.grpc.wallet.cache.Wallet.BalanceResponse> getBalanceMethod;
    if ((getBalanceMethod = WalletServiceGrpc.getBalanceMethod) == null) {
      synchronized (WalletServiceGrpc.class) {
        if ((getBalanceMethod = WalletServiceGrpc.getBalanceMethod) == null) {
          WalletServiceGrpc.getBalanceMethod = getBalanceMethod = 
              io.grpc.MethodDescriptor.<pasha.grpc.wallet.cache.Wallet.BalanceRequest, pasha.grpc.wallet.cache.Wallet.BalanceResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(
                  "WalletService", "Balance"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.BalanceRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pasha.grpc.wallet.cache.Wallet.BalanceResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new WalletServiceMethodDescriptorSupplier("Balance"))
                  .build();
          }
        }
     }
     return getBalanceMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WalletServiceStub newStub(io.grpc.Channel channel) {
    return new WalletServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WalletServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new WalletServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WalletServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new WalletServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class WalletServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void deposit(pasha.grpc.wallet.cache.Wallet.DepositRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.DepositResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDepositMethod(), responseObserver);
    }

    /**
     */
    public void withdraw(pasha.grpc.wallet.cache.Wallet.WithdrawRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.WithdrawResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWithdrawMethod(), responseObserver);
    }

    /**
     */
    public void balance(pasha.grpc.wallet.cache.Wallet.BalanceRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.BalanceResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getBalanceMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDepositMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                pasha.grpc.wallet.cache.Wallet.DepositRequest,
                pasha.grpc.wallet.cache.Wallet.DepositResponse>(
                  this, METHODID_DEPOSIT)))
          .addMethod(
            getWithdrawMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                pasha.grpc.wallet.cache.Wallet.WithdrawRequest,
                pasha.grpc.wallet.cache.Wallet.WithdrawResponse>(
                  this, METHODID_WITHDRAW)))
          .addMethod(
            getBalanceMethod(),
            asyncServerStreamingCall(
              new MethodHandlers<
                pasha.grpc.wallet.cache.Wallet.BalanceRequest,
                pasha.grpc.wallet.cache.Wallet.BalanceResponse>(
                  this, METHODID_BALANCE)))
          .build();
    }
  }

  /**
   */
  public static final class WalletServiceStub extends io.grpc.stub.AbstractStub<WalletServiceStub> {
    private WalletServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceStub(channel, callOptions);
    }

    /**
     */
    public void deposit(pasha.grpc.wallet.cache.Wallet.DepositRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.DepositResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getDepositMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void withdraw(pasha.grpc.wallet.cache.Wallet.WithdrawRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.WithdrawResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getWithdrawMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void balance(pasha.grpc.wallet.cache.Wallet.BalanceRequest request,
        io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.BalanceResponse> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(getBalanceMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WalletServiceBlockingStub extends io.grpc.stub.AbstractStub<WalletServiceBlockingStub> {
    private WalletServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<pasha.grpc.wallet.cache.Wallet.DepositResponse> deposit(
        pasha.grpc.wallet.cache.Wallet.DepositRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getDepositMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<pasha.grpc.wallet.cache.Wallet.WithdrawResponse> withdraw(
        pasha.grpc.wallet.cache.Wallet.WithdrawRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getWithdrawMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<pasha.grpc.wallet.cache.Wallet.BalanceResponse> balance(
        pasha.grpc.wallet.cache.Wallet.BalanceRequest request) {
      return blockingServerStreamingCall(
          getChannel(), getBalanceMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WalletServiceFutureStub extends io.grpc.stub.AbstractStub<WalletServiceFutureStub> {
    private WalletServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private WalletServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WalletServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new WalletServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_DEPOSIT = 0;
  private static final int METHODID_WITHDRAW = 1;
  private static final int METHODID_BALANCE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WalletServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WalletServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DEPOSIT:
          serviceImpl.deposit((pasha.grpc.wallet.cache.Wallet.DepositRequest) request,
              (io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.DepositResponse>) responseObserver);
          break;
        case METHODID_WITHDRAW:
          serviceImpl.withdraw((pasha.grpc.wallet.cache.Wallet.WithdrawRequest) request,
              (io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.WithdrawResponse>) responseObserver);
          break;
        case METHODID_BALANCE:
          serviceImpl.balance((pasha.grpc.wallet.cache.Wallet.BalanceRequest) request,
              (io.grpc.stub.StreamObserver<pasha.grpc.wallet.cache.Wallet.BalanceResponse>) responseObserver);
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
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WalletServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pasha.grpc.wallet.cache.Wallet.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("WalletService");
    }
  }

  private static final class WalletServiceFileDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier {
    WalletServiceFileDescriptorSupplier() {}
  }

  private static final class WalletServiceMethodDescriptorSupplier
      extends WalletServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WalletServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (WalletServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WalletServiceFileDescriptorSupplier())
              .addMethod(getDepositMethod())
              .addMethod(getWithdrawMethod())
              .addMethod(getBalanceMethod())
              .build();
        }
      }
    }
    return result;
  }
}
