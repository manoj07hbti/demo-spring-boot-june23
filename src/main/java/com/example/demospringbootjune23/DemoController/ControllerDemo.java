package com.example.demospringbootjune23.DemoController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {
    @RequestMapping("/First")
    public void Print(){
        System.out.println("Welcome to Spring boot class.....");
    }
    @RequestMapping("/Return")
    public String demo(){
        return "My First Spring Boot Class......";

    }
}