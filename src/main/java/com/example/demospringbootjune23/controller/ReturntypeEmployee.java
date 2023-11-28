package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReturntypeEmployee {
    @RequestMapping("/message/{name}")
    public String Employee(@PathVariable String name){
        return "Welcome to the TCS.."+ name;
        //http://localhost:8080/message/Rohan
    }

    @RequestMapping("/Age")
    public String Age(@RequestParam int number){
        return "The age of Rohan is:"+ number;
        //http://localhost:8080/Age?number=25
    }

}
