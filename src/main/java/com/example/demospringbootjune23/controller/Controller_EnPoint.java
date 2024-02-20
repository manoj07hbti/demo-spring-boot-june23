package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller_EnPoint {


    List<String> list = new ArrayList<>();

    @RequestMapping("/Dauli")

    public String hello() {

        return "Controller";
    }


    @RequestMapping("/Anshu")
    public void print() {

        System.out.println("Welcome to spring boot ");

    }

    @RequestMapping("/add")

    public String addition() {
        int a = 3;
        int b = 5;
        int sum = a + b;

        return "Addition of a,b is :" + sum;
    }

    @RequestMapping("/sub")

    public String subtraction() {

        int a = 7;
        int b = 4;
        int sub = a - b;

        return "subtraction of a,b is :" + sub;

    }

    @RequestMapping("/multi")

    public String Multiply() {

        int a = 8;
        int b = 4;
        int multiply = a * b;
        return "multiply of a,b is :" + multiply;
    }

    @RequestMapping("/div")

    public String Division() {
        int a = 5;
        int b = 9;
        int divide = a / b;

        return "Division of a,b is :" + divide;

    }

    @RequestMapping("/Square")
    public String makeSquare() {

        int number = 18;
        int result = number * number;
        return "Square of given number is : " + result;

    }

    @RequestMapping("/cube")
    public String makeCube() {

        int number = 5;
        int result = number * number * number;

        return "Cube of given number is :" + result;
    }

    @RequestMapping("/Food")

    public List<String> foodName() {

        list.add("Noodles");
        list.add("Potato");
        list.add("Vegetable");
        list.add("Tomato");
        list.add("Pasta");

        return list;

    }

}


