package com.example.demospringbootjune23.assignmentRequestParamController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentNo_2_ {

    @RequestMapping("/ADDITION")
    public String add(@RequestParam int a, @RequestParam int b) {
        return "Addition is :" + (a + b);
    }

    @RequestMapping("/SUBTRACTION")
    public String sub(@RequestParam int a, @RequestParam int b) {
        return "Subtraction is :" + (a - b);
    }

    @RequestMapping("/MULTIPLICATION")
    public String multi(@RequestParam int a, @RequestParam int b) {
        return "Multiplication is :" + (a * b);
    }

    @RequestMapping("/DIVISION")
    public String div(@RequestParam int a, @RequestParam int b) {
        return "Division is :" + (a / b);
    }
}
