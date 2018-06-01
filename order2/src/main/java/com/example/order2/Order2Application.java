package com.example.order2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangguo
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("order")
public class Order2Application {

    public static void main(String[] args) {
        SpringApplication.run(Order2Application.class, args);
    }

    @GetMapping("sayHi")
    public String helloWord() {
        return "这是来自订单服务-2 发来的问候";
    }

}
