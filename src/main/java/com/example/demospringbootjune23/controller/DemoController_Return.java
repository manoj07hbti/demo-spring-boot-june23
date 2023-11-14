package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController_Return {

    @RequestMapping("/Return")

    public String demo(){
        return "this is my first spring boot class";
    }


}
