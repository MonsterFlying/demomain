package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * @author wangguo
 */
@RestController
@RequestMapping("city")
public class CityController {


    @Autowired
    public CityService cityService;

    @PutMapping("/add")
    public Boolean add() {
        int randomNum = new Random().nextInt(10000);
        City city = new City();
        city.setCityName("test_" + randomNum);
        city.setCityName("深圳");
        return cityService.add(city);
    }


}
