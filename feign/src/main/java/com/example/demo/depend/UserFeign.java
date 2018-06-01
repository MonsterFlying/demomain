package com.example.demo.depend;

import com.example.demo.depend.impl.UserFeignHystirx;
import com.example.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author wangguo
 */
@FeignClient(name = "provider-user", fallback = UserFeignHystirx.class)
public interface UserFeign {

    @GetMapping("user/{id}")
    User findById(@PathVariable("id") Long id);


    @GetMapping("user/list")
    List<User> list();


    @PutMapping("user/add")
    public Boolean add(@ModelAttribute User user);
}