package com.example.demo.controller;

import com.example.demo.depend.CityFeign;
import com.example.demo.depend.UserFeign;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user")
public class FeignController {


    @Autowired
    private UserFeign userFeign;

    @Autowired
    private CityFeign cityFeign;

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long id) {
        User user = this.userFeign.findById(id);
        return user;
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userFeign.list();
    }

    @PutMapping("/add")
    public boolean add(@ModelAttribute User user) {
        cityFeign.add();
        userFeign.add(user);
        int s = 100 % 0;
        return true;
    }
}


