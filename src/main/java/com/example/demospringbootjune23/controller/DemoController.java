package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //we need to create endpoint 1

    @RequestMapping("/demo")
    public void print(){

        System.out.println("Welcome to Spring Boot...");
    }


    @RequestMapping("/hello")
    public String hello(){

        return "Welcome to Spring Boot...";

    }

    @RequestMapping("/marks")
    public int getMarks(){

        return 33;
    }


}
