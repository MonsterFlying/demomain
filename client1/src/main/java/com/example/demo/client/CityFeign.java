package com.example.demo.client;

import com.example.demo.client.impl.CityFeignHystirx;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author wangguo
 */
@FeignClient(name = "city", fallback = CityFeignHystirx.class)
public interface CityFeign {

    @PutMapping("city/add")
    Boolean add();

}
