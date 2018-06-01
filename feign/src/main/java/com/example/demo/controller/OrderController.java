package com.example.demo.controller;

import com.example.demo.depend.OrderFeign;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: wangguo
 * \* Date: 2018/5/14
 * \* Time: 14:56
 * \* To change this template use File | Settings | File Templates.
 * \* Description:
 * \
 */
@RestController
@RequestMapping("feign")
@Slf4j
public class OrderController {

    @Autowired
    private OrderFeign orderFeign;

    @GetMapping("hi")
    public String hi() {
        String sayHi = orderFeign.sayHi();

        log.info(sayHi);
        return sayHi;
    }

}