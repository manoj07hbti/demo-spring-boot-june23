package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Demo_Square_Cube {

    @RequestMapping("/Square")

    public String square(){
        int number=10;

        int result=number*number;
        return "square of given number....."+result;
    }

    @RequestMapping("/Cube")

    public String cube(){
        int number=10;

        int result=number*number*number;

        return "cube of given number....."+result;
    }

}
