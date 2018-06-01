package com.example.demo.depend.impl;

import com.example.demo.depend.OrderFeign;
import feign.hystrix.FallbackFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wangguo
 * \* Date: 2018/5/14
 * \* Time: 16:02
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 * @author wangguo
 */
@Component
public class OrderFallback implements OrderFeign {

    @Override
    public String sayHi() {
        System.out.println("=================进入方法熔断中===============");
        return "熔断了！";
    }


}