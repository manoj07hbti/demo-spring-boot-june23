package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.service.CarDesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarDesignController {

    @Autowired
    CarDesignService service;


    @RequestMapping("/CAR")
    public String carManufacturing() {

        return service.carManufacturing();

    }

}
