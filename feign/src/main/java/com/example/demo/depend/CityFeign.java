package com.example.demo.depend;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "provider-city")
public interface CityFeign {


    @PutMapping("city/add")
    Boolean add();


}
