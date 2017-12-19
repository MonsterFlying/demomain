package com.example.demo.depend.impl;

import com.example.demo.depend.UserClient;
import com.example.demo.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserClientImpl implements UserClient {

    @Override
    public User findById(@PathVariable("id") Long id) {
        User user = new User();
        user.setAge(10);
        user.setId(11L);
        user.setUserName("testUser");
        return user;
    }

    @Override
    public List<User> list() {
        String s = "111";
        String www = s + "111";
        System.out.print(www);
        return new ArrayList<>();
    }
}

