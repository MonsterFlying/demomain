package com.example.demo.depend.impl;

import com.example.demo.depend.CityFeign;
import com.example.demo.depend.UserFeign;
import com.example.demo.entity.User;
import com.google.common.collect.Lists;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @author wangguo
 */
@Component
public class CityFeignHystirx implements CityFeign {

    @Override
    public Boolean add() {
        return false;
    }
}

