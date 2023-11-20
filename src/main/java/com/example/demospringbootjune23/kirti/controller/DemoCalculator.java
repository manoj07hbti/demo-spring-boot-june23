package com.example.demospringbootjune23.kirti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCalculator {
    @RequestMapping("/Add")
    public String Addition(){
        int a = 20;
        int b = 10;
        int add = a+b;
        return " Printing addition  "+add;
    }
    @RequestMapping("/Subtraction")
    public String Subtraction(){
        int a = 20;
        int b = 10;
        int subtraction = a-b;
        return " Printing subtraction "+subtraction;
    }
    @RequestMapping("/Multiple")
    public String Multiple(){
        int a = 20;
        int b = 10;
        int Multiple = a*b;
        return  " Printing Multiple "+Multiple;
    }
    @RequestMapping("/Div")
    public String Div(){
        int a = 20;
        int b = 10;
        int Div = a/b;
        return  " Printing Div  "+Div;
    }
    @RequestMapping("/Cube")
    public String Cube(){
        int number = 10;
        int result = number*number*number;
        return " Cube of given number"+result;
    }
    @RequestMapping("/square")
    public String Square(){
        int number = 10;
        int result = number*number;
        return " Square of given number...."+result;
    }


}
