package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@EnableFeignClients(basePackages = "com.example.demo")
public class ClientOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientOneApplication.class, args);
    }


}
