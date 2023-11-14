package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class RequestParamController {
    ArrayList<Student> studentArrayList=new ArrayList<>();
    @RequestMapping("/even_odd")
    public String evenOdd(@RequestParam int number){
        if (number%2==0){
            return "This number is even : " +number;
        }
        else {
            return "This is number is odd : " +number;
        }
    }
    @RequestMapping("/sub")
    public String sub(@RequestParam int a,@RequestParam int b){
        return "Printing Subtraction is : " +(a-b);
    }
    @RequestMapping("/add_get_Students")
    public ArrayList<Student> addAndGetStudents(@RequestParam String Name,@RequestParam int Age, @RequestParam String Section){

        Student student=new Student(Name,Age,Section);
        studentArrayList.add(student);
        return studentArrayList;

    }
}
