package com.example.demospringbootjune23.controller.demo_pathvariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Even_Odd {

    @RequestMapping("/even_odd/{number}")

    public String evenOdd(@PathVariable int number ){


        if (number%2==0){
            return "Number is Even " + number;
        }else {
            return "Number is Odd " + number;
        }
    }
}
