package com.example.grpc_client;

import com.example.hello.helloServiceGrpc;
import com.example.hello.Hello;
import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloServiceConsumer {



    @RequestMapping(value = "/sayhello")
    public String sayHello(@RequestParam String name) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 6565)
                .usePlaintext()
                .build();

        helloServiceGrpc.helloServiceBlockingStub helloStub
                = helloServiceGrpc.newBlockingStub(channel);


        Hello.clientRequest request = Hello.clientRequest.newBuilder().setRequest(name).build();
        Hello.serverAnswer asnwer = helloStub.sayHello(request);
        String ans = asnwer.getAnswer();
        channel.shutdown();
        return ans;
    }
}