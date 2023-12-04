package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.service.DesignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DesignController {
    //Autowired
    //ClassName obj.Name;
    @Autowired
    DesignService service;
    @RequestMapping("/message")
    public String message(){

        //DesignService obj = new DesignService
         //return obj.message()
        return service.message();
    }
}