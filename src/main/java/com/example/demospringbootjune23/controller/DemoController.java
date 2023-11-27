package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @Autowired
    DemoService service;
    @RequestMapping("/message")
    public String message(){
      //  DemoService bj=new DemoService();
        return service.serviceMessage();
    }
}
