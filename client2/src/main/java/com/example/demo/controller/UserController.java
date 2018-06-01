package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {


    @Autowired
    private DiscoveryClient discoveryClient;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @GetMapping("user/{id}")
    public User findById(@PathVariable Long id) {
        User findOne = this.userRepository.findOne(id);
      /*  UserList userList = new UserList();
        userList.setUserName(findOne.getUserName());
        userList.setId(findOne.getId());
        userList.setAge(findOne.getAge());
        return userList;*/
        return findOne;
    }


    @GetMapping("/instance-info")
    public ServiceInstance showInfo() {
        ServiceInstance localServiceInstance = this.discoveryClient.getLocalServiceInstance();
        return localServiceInstance;
    }

    @PutMapping("user/add")
    public boolean add(@ModelAttribute User user) {
        return userService.add(user);
    }


}
