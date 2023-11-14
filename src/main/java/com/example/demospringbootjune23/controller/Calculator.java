package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {

    @RequestMapping("/ADD")
    public String add(){
        int a=10;
        int b=10;

        int result=a+b;
        return "sum of two numbers..."+result;
    }
    @RequestMapping("/Subtraction")
    public String sub(){
        int a=60;
        int b=30;

        int result=a-b;
        return "subtract of two number....."+result;
    }
    @RequestMapping("/Multiply")
    public String multiply(){
        int a=10;
        int b=10;

        int result=a*b;
        return "multiply of two number....."+result;
    }
    @RequestMapping("/Divide")
    public String divide(){
        int a=100;
        int b=10;

        int result=a/b;
        return "divide of two number....."+result;
    }
    @RequestMapping("/Percentage")
    public String percentage(){
        int a=100;
        int b=10;

        int result=a*b/100;
        return "percentage of given number......"+result;
    }






}
