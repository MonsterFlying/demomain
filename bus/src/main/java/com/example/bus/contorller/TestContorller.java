package com.example.bus.contorller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class TestContorller {

    @Value("${order.name}")
    private String orderName;


    @RequestMapping("/test")
    public String test() {
        return "client ====>>> " + orderName;
    }

}
