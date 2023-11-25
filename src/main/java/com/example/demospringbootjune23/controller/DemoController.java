package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @RequestMapping("/sdy")
    public void demoRead(){
        System.out.println("Welcome to Spring boot");
    }
}
