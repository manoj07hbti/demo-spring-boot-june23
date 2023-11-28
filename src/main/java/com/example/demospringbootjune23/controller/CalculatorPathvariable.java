package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
    //Calculator Pathvariable
public class CalculatorPathvariable {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition of given input is:" + (a + b);
    }
    //http://localhost:8080/add/78/25

    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction of given input is:" + (a - b);
        //http://localhost:8080/sub/21/5
    }

    @RequestMapping("/multi/{a}/{b}")
    public String  multi(@PathVariable int a, @PathVariable int b) {
        return "Multiplication of given input is:" + (a*b);
        //http://localhost:8080/multi/78/25
    }
    @RequestMapping("/div/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b){
        return"Division of given input is:"+(a/b);
        //http://localhost:8080/div/78/25
    }

}





