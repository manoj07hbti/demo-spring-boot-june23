package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Controller {
    @RequestMapping("/read")

    public String test(){

        return "Welcome To Spring Boot June Batch";

    }
}
