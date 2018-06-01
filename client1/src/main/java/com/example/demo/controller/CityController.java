package com.example.demo.controller;

import com.example.demo.entity.City;
import com.example.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("city")
public class CityController {


    @Autowired
    private CityService cityService;

    @PutMapping("add")
    public boolean add() {
        City city = new City();
        city.setCityName("长沙");
        return cityService.add(city);
    }

}
