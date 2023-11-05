package com.example.demospringbootjune23.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class PathVariableController {
    ArrayList<String>courses=new ArrayList<>();
@GetMapping("hello/{Name}")
public String hello(@PathVariable String Name){


    return "Hello,welcome to spring boot project......"+Name;
}

@RequestMapping("addition/{a}/{b}")
public String addition(@PathVariable int a, @PathVariable int b){

        return "Addition of two number :"+(a+b);
}
@RequestMapping("/add_and_get_courses/{CourseName}")
public ArrayList<String>addCourses(@PathVariable String CourseName){


    courses.add(CourseName);
 return courses;
}
@RequestMapping("/subtraction/{a}/{b}")
public String subtraction(@PathVariable int a, @PathVariable int b){

    return "subtraction of two number:"+(a-b);

}
@RequestMapping("/multiple/{a}/{b}")
public String multiple(@PathVariable int a, @PathVariable int b){

    return "multiple of to number:"+(a*b);

}
@RequestMapping("/division/{a}/{b}")
public String division(@PathVariable double a, @PathVariable double b){

    return "division of two number :"+(a/b);
}




}

