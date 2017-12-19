package com.example.demo.controller;

import com.example.demo.depend.UserClient;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("user")
public class FeignController {


    @Autowired
    private UserClient userClient;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        User user = this.userClient.findById(id);
        return user;
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userClient.list();
    }
}


