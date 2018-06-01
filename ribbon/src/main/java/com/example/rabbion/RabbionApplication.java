package com.example.rabbion;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@RequestMapping("ribbon/test")
public class RabbionApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbionApplication.class, args);
    }

    /**

     * 开启负债均衡的能力
     *
     * @return
     */
    @Bean
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    /**
     * 定义REST客户端，RestTemplate实例
     */
    @Autowired
    private RestTemplate template;

    private volatile  int i=0;

    @RequestMapping("hi")
    public String helloWorld() {
        System.out.println("这是第"+i++ +"次请求");
        String result= template.getForObject("http://order-provider/order/sayHi", String.class);
        System.out.println("打印响应信息："+result);
        return result;
    }


}
