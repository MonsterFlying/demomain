package com.example.order1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("order")
public class Order1Application {

    public static void main(String[] args) {
        SpringApplication.run(Order1Application.class, args);
    }

    @GetMapping("sayHi")
    public String helloWord() {

        return "这是来自订单服务-1 发来的问候";
    }


}
