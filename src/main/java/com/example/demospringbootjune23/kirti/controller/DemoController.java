package com.example.demospringbootjune23.kirti.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DemoController {

    // We need to create endpoint
    @RequestMapping("/demo")
    public String print(){

        System.out.println(" Welcome to springBoot : ");
        return " String";
    }
    @RequestMapping("/Hello")
    public String hello(){
        System.out.println(" Welcome to springBoot : ");
        return " Welcome to stringBoot  : ";
    }
    @RequestMapping("/square")
    public String square(){
        int number = 5;
        int result = number*number;
        return " square of given number......"+result;
    }
    @RequestMapping("/brandsList")
    public String brands(){
        List<String> list = new ArrayList<>();
        list.add("Dell");
        list.add("Lenovo");
        list.add("Apple");
        list.add("HP");

        for (String item : list){
            System.out.println(item);
        }
        return "There are some brands : " + list;
    }

}
