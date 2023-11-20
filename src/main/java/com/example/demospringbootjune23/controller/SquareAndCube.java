package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareAndCube {
    @RequestMapping("/Sq")
    public String makeSquare(){

        int number = 3;

        int result = number*number;
        return "Number Of Square is " + result;
    }
    @RequestMapping("/cb")
    public String cube(){

        int number = 8 ;
        int result = number*number*number;
        return "Number Of Cube is "+ result;
    }
}
