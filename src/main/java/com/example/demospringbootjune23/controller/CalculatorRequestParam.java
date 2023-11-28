package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorRequestParam {
    // Calculator RequestParam
    @RequestMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b){
        return "Addition is :"+ (a+b);
    }
     //http://localhost:8080/add?a=5&b=9
     @RequestMapping("/sub")
     public String sub (@RequestParam int a, @RequestParam int b){
         return "Subtraction is :"+ (a-b);
         //http://localhost:8080/sub?a=10&b=5
     }
    @RequestMapping("/multi")
    public String multi(@RequestParam int a, @RequestParam int b){
        return "Multiplication is :"+ (a*b);
        //http://localhost:8080/multi?a=15&b=5
    }
    @RequestMapping("/div")
    public String div (@RequestParam int a, @RequestParam int b){
        return "Division is :"+ (a / b);
        //http://localhost:8080/div?a=50&b=5
    }

}


