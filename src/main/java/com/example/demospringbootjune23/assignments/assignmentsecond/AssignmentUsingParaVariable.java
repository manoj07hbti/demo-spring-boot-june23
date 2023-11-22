package com.example.demospringbootjune23.assignments.assignmentsecond;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AssignmentUsingParaVariable {
@RequestMapping("/add")
    public String add(@RequestParam int a,@RequestParam int b){
        return "Addition is"+(a+b);
    }
    @RequestMapping("/subs")
    public String sub(@RequestParam int c,@RequestParam int d){
        return "Subtraction is "+(c-d);
    }
    @RequestMapping("/mul")
    public String mul(@RequestParam int p,@RequestParam int q){
        return "Multiplication is"+(p*q);
    }
    @RequestMapping("/div")
    public String div(@RequestParam int a,@RequestParam int b)
    {
        return "Division:"+(a/b);
    }
}
