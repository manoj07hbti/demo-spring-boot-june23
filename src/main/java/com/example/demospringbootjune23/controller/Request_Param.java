package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Request_Param {

    ArrayList<String> Courses = new ArrayList<>();


    @RequestMapping("/even_odd")

    public String evenOdd(@RequestParam int number) {

        if (number % 2 == 0) {

            return "Number is even" + number;
        } else {

            return "Number is odd" + number;
        }

    }


    @RequestMapping("/addition")

    public String Addition(@RequestParam int a, @RequestParam int b) {

        return "Addition of given input is :" + (a + b);

    }

    @RequestMapping("/subtraction")

    public String Subtraction(@RequestParam int a, @RequestParam int b) {

        return "Subtraction of given input is :" + (a - b);

    }

    @RequestMapping("/multiplication")

    public String Multiple(@RequestParam int a, @RequestParam int b) {

        return "Multiply of given input is :" + (a * b);
    }

    @RequestMapping("/divide")

    public String Divide(@RequestParam int a, @RequestParam int b) {

        return "Division of given input is :" + (a / b);

    }

    @RequestMapping("/add_and_get_course")

    public ArrayList<String> addCourses(@RequestParam String courseName) {

        Courses.add(courseName);
        return Courses;
    }

}


