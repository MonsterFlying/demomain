package com.example.register1;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Register1Application {

    public static void main(String[] args) {
        new SpringApplicationBuilder(Register1Application.class).run(args);
    }
}
