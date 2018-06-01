package com.example.demo.service.impl;

import com.codingapi.tx.annotation.TxTransaction;
import com.example.demo.entity.City;
import com.example.demo.repository.CityRepository;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import javax.transaction.Transactional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @TxTransaction
    @Override
    public Boolean add(City city) {
        City result = cityRepository.save(city);
        return ObjectUtils.isEmpty(result) ? false : true;
    }
}
