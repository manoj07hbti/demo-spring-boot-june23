package com.example.demospringbootjune23.kirti.controller.pathvariablecontroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
    @RequestMapping("/addition/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        return "Addition is :"+(a+b);
    }

    @RequestMapping("/sub/{a}/{b}")
    public String sub(@PathVariable int a,@PathVariable int b){
        return "Subtraction is :"+(a-b);
    }
    @RequestMapping("/multiple/{a}/{b}")
    public String multiple(@PathVariable int a,@PathVariable int b){
        return  "Multiple is : "+(a*b);
    }
    @RequestMapping("/division/{a}/{b}")
    public String division(@PathVariable int a,@PathVariable int b){
        return " Division is :"+(a/b);
    }




}
