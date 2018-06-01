package com.example.demo.depend;


import com.example.demo.depend.impl.OrderFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangguo
 */
@FeignClient(name = "order-provider", fallback = OrderFallback.class)
public interface OrderFeign {


    @GetMapping("order/sayHi")
    String sayHi();
}
