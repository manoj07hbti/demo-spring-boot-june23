package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class RequestParamController {

    ArrayList<Student> studentArrayList = new ArrayList<>();

    @RequestMapping("/even_odd")
    public String evenOdd(@RequestParam int number) {
//localhost:8080/even_odd?number=11
        if (number % 2 == 0) {

            return "Number is even number :" + number;
        } else {
            return "Number is ODD number :" + number;
        }
    }

    //localhost:8080/add?a=45&b=66
    @RequestMapping("/add")
    public String add(@RequestParam int a, @RequestParam int b) {

        return "Addition is :" + (a + b);
    }

    @RequestMapping("/sub")
    public String sub(@RequestParam int a, @RequestParam int b) {

        return "Subtraction is :" + (a - b);
    }

    @RequestMapping("/multi")
    public String multi(@RequestParam int a, @RequestParam int b) {

        return "Multiplication is :" + (a * b);
    }

    @RequestMapping("/div")
    public String div(@RequestParam int a, @RequestParam int b) {

        return "Division is :" + (a / b);
    }

    @RequestMapping("/add_get_students")
    public ArrayList<Student> addAndGetStudents(@RequestParam String name, @RequestParam int age, @RequestParam String section) {
        Student student = new Student(name, age, section);

        studentArrayList.add(student);

        return studentArrayList;

    }

}
