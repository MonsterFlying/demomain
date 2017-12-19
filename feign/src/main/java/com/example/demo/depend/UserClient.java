package com.example.demo.depend;

import com.example.demo.depend.impl.UserClientImpl;
import com.example.demo.entity.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
@Component
@FeignClient(value = "provider-user", fallback = UserClientImpl.class)
public interface UserClient {

    @RequestMapping("/user/{id}")
    User findById(@PathVariable("id") Long id);


    @RequestMapping("/user/list")
    List<User> list();


}