package com.cit.micro.service;

import com.cit.micro.grpc.client.*;
import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import java.util.LinkedHashSet;


@GRpcService
public class GrpcServer extends ChatGrpc.ChatImplBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(GrpcServer.class);
    private static LinkedHashSet<StreamObserver<ChatMessageFromServer>> observers = new LinkedHashSet<>();

    @Override
    public StreamObserver<ChatMessage> send (StreamObserver<ChatMessageFromServer> responseObserver){
        observers.add(responseObserver);
        LOGGER.info("Message Received");
        return new StreamObserver<ChatMessage>() {

            @Override
            public void onNext(ChatMessage message) {
                LOGGER.info(message.getText());

                for (StreamObserver<ChatMessageFromServer> observer : observers) {
                    ChatMessageFromServer response = ChatMessageFromServer.newBuilder().setName(message.getName()).setText(message.getText()).build();
                    observer.onNext(response);
                }
            }
            @Override
            public void onError(Throwable throwable) {
                LOGGER.error("Bad");
                LOGGER.error(throwable.getMessage());
                observers.remove(responseObserver);
            }

            @Override
            public void onCompleted() {
                LOGGER.info("Completed");
                responseObserver.onCompleted();
                observers.remove(responseObserver);
            }
        };
    }

    @Override
    public void join(ChatMessage request, StreamObserver<ChatMessageFromServer> responseObserver){
        ChatMessageFromServer response = ChatMessageFromServer.newBuilder().setName("Server: ").setText(String.format("Welcome %s", request.getName())).build();
        responseObserver.onNext(response);
        LOGGER.info("join");
    }

    @Override
    public void test(ChatMessage request, StreamObserver<ChatMessageFromServer> responseObserver) {
        ChatMessageFromServer response = ChatMessageFromServer.newBuilder().setName(request.getName()).setText(request.getText()).build();
        responseObserver.onNext(response);
        LOGGER.info("In test");
    }
}
