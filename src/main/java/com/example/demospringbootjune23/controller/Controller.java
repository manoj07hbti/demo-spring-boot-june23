package com.example.demospringbootjune23.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;


@RestController
public class Controller{

    List<String> list = new ArrayList<>();

    @RequestMapping("/Demo")
    public void print() {

        for (int i = 0; i < 300; i++) {
            System.out.println("<--Welcome to SpringBoot-->");
        }
    }


    @RequestMapping("/AT&T")
    public String hello() {
        return " Welcome to FrameWork ";

    }

    @RequestMapping("/ADD")
    public String addition() {
        int a = 3;
        int b = 6;

        int sum = a + b;
        return "Addition of two number is :" + sum;
    }

    @RequestMapping("/SUB")
    public String subtraction() {
        int a = 6;
        int b = 5;
        int sub = a - b;
        return "Subtraction of two number is :" + sub;

    }

    @RequestMapping("/MULTI")
    public String multiplication() {
        int a = 6;
        int b = 5;
        int multi = a * b;
        return "multiplication of two number is :" + multi;

    }

    @RequestMapping("/DIV")
    public String divide() {
        int a = 6;
        int b = 5;
        int div = a / b;
        return "Divide of two number is :" + div;

    }

    @RequestMapping("/SQUARE")
    public String makeSquare() {
        int number = 6;
        int result = number * number;
        return "Square of given number is :" + result;

    }

    @RequestMapping("/BRAND")
    public List<String> brandName() {
        list.add("Koenigsegg");
        list.add("LVHM");

        return list;
    }

}
