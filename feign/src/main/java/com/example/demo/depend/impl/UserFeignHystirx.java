package com.example.demo.depend.impl;

import com.example.demo.depend.UserFeign;
import com.example.demo.entity.User;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author wangguo
 */
@Component
public class UserFeignHystirx implements UserFeign {

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
        return Lists.newArrayList(new User(1L, "test", 14));
    }

    @Override
    public Boolean add(User user) {
        return false;
    }
}

