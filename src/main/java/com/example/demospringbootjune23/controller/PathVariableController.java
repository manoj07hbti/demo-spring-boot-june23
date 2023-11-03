package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVariableController {

    ArrayList<String> courses= new ArrayList<>();

    //"endpoint_name/{path_variable_name}
    @RequestMapping("/message/{name}")
    public String hello(@PathVariable String name){
        return "Hello, Welcome to Spring boot..."+name;
    }

    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b){

        return "Addition of given input is :" +(a+b);
    }

    @RequestMapping("/add_and_get_courses/{courseName}")
    public ArrayList<String> addCourses(@PathVariable String courseName){


        courses.add(courseName);

        return courses;


    }


}
