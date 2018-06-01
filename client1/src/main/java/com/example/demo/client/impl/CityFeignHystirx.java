package com.example.demo.client.impl;

import com.example.demo.client.CityFeign;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

@CommonsLog
@Component
public class CityFeignHystirx implements CityFeign {


    @Override
    public Boolean add(){
        log.info("===================进入断路器==============");
        log.info("===========CityFeignHystirx add()失败===========");
        throw new RuntimeException("===========CityFeignHystirx add()失败===========");
    }
}
