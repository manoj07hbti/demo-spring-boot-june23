package com.example.demospringbootjune23.assignmentPathVariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentNo_2_ {


    @RequestMapping("/Addition/{a}/{b}")
    public String add(@PathVariable int a, @PathVariable int b) {
        return "Addition is :" + (a + b);
    }

    @RequestMapping("/Subtraction/{a}/{b}")
    public String sub(@PathVariable int a, @PathVariable int b) {
        return "Subtraction is :" + (a - b);
    }

    @RequestMapping("/Multiplication/{a}/{b}")
    public String multi(@PathVariable int a, @PathVariable int b) {
        return "Multiplication is :" + (a * b);
    }

    @RequestMapping("/Division/{a}/{b}")
    public String div(@PathVariable int a, @PathVariable int b) {
        return "Division is :" + (a / b);
    }
}
