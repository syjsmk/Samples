package com.example.ppojinreceiver;

import com.example.ppojinreceiver.grpcServer.CalculatorService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class PpojinReceiverApplication {

    public static void main(String[] args) {
        SpringApplication.run(PpojinReceiverApplication.class, args);
    }
}
