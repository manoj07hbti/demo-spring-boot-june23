package com.example.demospringbootjune23.kirti.controller.requestparamcontroller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

public class DemoRequestParam {


    @RequestMapping("/even_odd")
    public String evenOdd(@RequestParam int number){
        if (number%2==0){
            return "This number is even: "+number;
        }
        else {
            return "This number is odd : "+number;
        }
    }
    @RequestMapping("/Sub")
    public String sub(@RequestParam int a,@RequestParam int b){
        return "printing subtraction is: "+(a-b);
    }

    @RequestMapping("/Add")
    public String Add(@RequestParam int a,@RequestParam int b){
        return "Printing Add : "+(a+b);
    }
    @RequestMapping("/Multiple")
    public String Multiple(@RequestParam int a,@RequestParam int b){

        return " Printing is : "+(a*b);
    }
    @RequestMapping("/Division")
    public String Division(@RequestParam int a,@RequestParam int b){
        return " Division is : "+(a/b);

     }
    }

    


