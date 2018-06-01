package com.example.demo.controller;

import com.example.demo.client.CityFeign;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {


    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private UserRepository userRepository;


    @Autowired
    private CityFeign cityFeign;

    @Autowired
    private UserService userService;

    @GetMapping("/{id}")
    public User findById(@PathVariable Long id) {

        User findOne = this.userRepository.findOne(id);
        return findOne;
    }

    @GetMapping("/list")
    public List<User> list() {
        return this.userRepository.findAll();
    }

    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }


    @PutMapping("add")
    public Boolean add(@ModelAttribute User user)throws Exception {
        return userService.add(user);
    }

}
