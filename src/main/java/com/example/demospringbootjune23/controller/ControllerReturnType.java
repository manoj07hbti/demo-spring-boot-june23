package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerReturnType {
    @RequestMapping("/DemoRead")
    public String read(){
        return "My First Ass";
    }
}
