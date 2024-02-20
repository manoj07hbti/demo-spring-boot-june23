package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController


public class Path_Variable {

    ArrayList<String> Courses = new ArrayList<>();

    @RequestMapping("/messege/{name}")

    public String goodLuck(@PathVariable String name) {

        return "Hello Welcome to SpringBoot : " + name;

    }

    @RequestMapping("/add/{a}/{b}")

    public String addition(@PathVariable int a, @PathVariable int b) {

        return "Hii Addition of given input is :" + (a + b);

    }

    @RequestMapping("/sub/{a}/{b}")

    public String subtraction(@PathVariable int a, @PathVariable int b) {

        return "Subtraction of given input is :" + (a - b);


    }

    @RequestMapping("/multiply/{a}/{b}")

    public String Multiply(@PathVariable int a, @PathVariable int b) {

        return "Multiple of given input is :" + (a * b);

    }

    @RequestMapping("/division/{a}/{b}")

    public String Divide(@PathVariable int a, @PathVariable int b) {

        return "Division of given input is :" + (a / b);

    }

    @RequestMapping("/add_and_get_courses/{courseName}")

    public ArrayList<String> addCourses (@PathVariable String courseName){

         Courses.add(courseName);
         return Courses;

    }




}
