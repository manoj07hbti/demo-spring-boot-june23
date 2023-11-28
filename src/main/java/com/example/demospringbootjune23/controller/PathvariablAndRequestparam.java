package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
    //Calculator Pathvariable
public class PathvariablAndRequestparam {
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){
        return "Addition of given input is:"+(a+b);
    }
    //http://localhost:8080/add/78/25


    // Calculator RequestParam
    @RequestMapping("/add")
    public String sub (@RequestParam int a, @RequestParam int b){
        return "Addition is :"+ (a+b);
    }
//http://localhost:8080/add?a=5&b=9
}
