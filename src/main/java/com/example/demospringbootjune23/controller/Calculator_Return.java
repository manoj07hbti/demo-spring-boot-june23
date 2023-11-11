package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator_Return {
    @RequestMapping("/makeAdd")
    public String add() {

        int a = 40;
        int b = 20;
        int add = a + b;
        return "Add of a and b  is " + add;
    }

    @RequestMapping("/makeSub")
    public String subtraction() {

        int a = 80;
        int b = 20;
        int Subtraction = a - b;
        return "Subtraction of a and b  is " + Subtraction;

    }

    @RequestMapping("/makeMulti")
    public String multiply() {

        int a = 5;
        int b = 4;
        int multiply = a * b;
        return "Multiply of a and b  is " + multiply;

    }

    @RequestMapping("/makeDiv")
    public String divide() {

        int a = 20;
        int b = 4;
        int divide = a * b;
        return "Divide of a and b  is " + divide;

    }

    @RequestMapping("/makePer")
    public String percent() {

        int a = 200;
        int b = 4;
        int percent = a * b / 100;
        return "percent of a and b  is " + percent;
    }
}