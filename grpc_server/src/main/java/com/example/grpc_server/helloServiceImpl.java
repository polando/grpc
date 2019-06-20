package com.example.grpc_server;



import com.example.hello.Hello;
import com.example.hello.helloServiceGrpc;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;

@GRpcService
public class helloServiceImpl extends helloServiceGrpc.helloServiceImplBase {
    @Override
    public void sayHello(Hello.clientRequest request, StreamObserver<Hello.serverAnswer> responseObserver) {
        Hello.serverAnswer.Builder answer = Hello.serverAnswer.newBuilder().setAnswer("hello "+request.getRequest());
        responseObserver.onNext(answer.build());
        responseObserver.onCompleted();
    }
}
