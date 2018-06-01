package com.example.demo.client;

import com.example.demo.client.impl.UserFeignHystirx;
import com.example.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;

/**
 * @author wangguo
 */
@FeignClient(name = "provider-test", fallback = UserFeignHystirx.class)
public interface UserFeign {


    @PutMapping("user/add")
    Boolean add(@ModelAttribute User user);


}
