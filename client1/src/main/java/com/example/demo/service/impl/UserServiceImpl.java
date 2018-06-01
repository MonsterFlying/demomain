package com.example.demo.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.demo.client.CityFeign;
import com.example.demo.client.UserFeign;
import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

/**
 * @author wangguo
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CityFeign cityFeign;


    @TxTransaction(isStart = true)
    @Override
    public boolean add(User user) throws Exception {
        Boolean add = cityFeign.add();
        User result = userRepository.save(user);
        int NUM = 100 % 0;
        return ObjectUtils.isEmpty(result) ? false : true;
    }
}
