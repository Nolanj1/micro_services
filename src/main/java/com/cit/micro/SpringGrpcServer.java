package com.cit.micro;


import com.cit.micro.service.GrpcServer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SpringGrpcServer {

    public static void main(String[] args) {
        final Logger LOGGER = LoggerFactory.getLogger(GrpcServer.class);

        SpringApplication.run(SpringGrpcServer.class, args);

    }
}
