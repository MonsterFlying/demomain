package com.example.demo.client.impl;

import com.example.demo.client.UserFeign;
import com.example.demo.entity.User;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;

/**
 * @author wangguo
 */
@CommonsLog
@Component
public class UserFeignHystirx implements UserFeign {
    @Override
    public Boolean add(User user) {
        log.info("========================进入断路器===============================");
        log.info("=================provider-user->add()失败================");
        throw new RuntimeException("provider-user->add()失败");
    }
}
