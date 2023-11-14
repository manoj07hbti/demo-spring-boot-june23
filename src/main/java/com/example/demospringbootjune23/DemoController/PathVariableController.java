package com.example.demospringbootjune23.DemoController;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayDeque;
import java.util.ArrayList;

@RestController

public class PathVariableController {
    ArrayList<String> courses=new ArrayList<>();

    @RequestMapping("/Message/{Name}")
    public String hello(@PathVariable String Name)
    {
        return "Welcome to spring boot class...." +Name ;
    }
    @RequestMapping("/add/{a}/{b}")
    public String add(@PathVariable int a,@PathVariable int b){
        return "Printing Addition of given input is= " +(a+b);
    }
    @RequestMapping("/add_and_get_course/{courseName}")
    public ArrayList<String> addCourses(@PathVariable String courseName)
    {

        courses.add(courseName);
        return courses;
    }

}
