package com.example.demo.service.impl;

import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public Boolean add(City city) {
        City result = cityRepository.save(city);
        return ObjectUtils.isEmpty(result) ? false : true;
    }

    public static void main(String[] args) {
        String testStr="http://sdfd.dss";

        System.out.println(testStr.contains("http"));
    }
}
