package com.example.demospringbootjune23.My_Calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoCalculator {
    @RequestMapping("/Add")
    public String Addition() {
        int a = 35;
        int b = 45;
        int Add = a + b;
        return "Printing Addition is = " + Add;
    }

    @RequestMapping("/SUBS")
    public String Subtraction() {
        int a = 35;
        int b = 45;
        int sub = a - b;
        return "Printing Subtraction is = " + sub;
    }

    @RequestMapping("/Mul")
    public String Multiplication() {
        int a = 35;
        int b = 20;
        int Mul = a*b;
        return "Printing Multiplication is = " + Mul;
    }
    @RequestMapping("/Div")
    public String Division() {
        double a = 4;
        double b = 3;
        double Div = a/b;
        return "Printing Division is = " + Div;
    }
    @RequestMapping("/Squire")
    public String Squire(){
        int a=15;
        int Squire=a*a;
        return "Printing Squire Number = " +Squire;
    }
}