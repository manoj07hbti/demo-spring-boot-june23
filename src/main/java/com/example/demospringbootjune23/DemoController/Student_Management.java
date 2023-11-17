package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Student_Management {
    ArrayList<Student> StudentList=new ArrayList<>();
    @RequestMapping("/Add_Student/{Name}/{Age}/{Section}")
    public String addStudent(@PathVariable String Name, @PathVariable int Age, @PathVariable String Section){
        Student student=new Student(Name,Age,Section);
        StudentList.add(student);
        return "Student Added Successfully....";

    }

    @RequestMapping("/get_all_Student")
    public ArrayList<Student> getStudentList(){
        return StudentList;
    }
    @RequestMapping("/update_Student")
    public String updateStudent(@RequestParam String Name, @RequestParam int index){
        Student student=StudentList.get(index);
        student.setName(Name);
        StudentList.set(index,student);
        return "updated Student Recorded successfully...";
    }
    @RequestMapping("/remove_Student")
    public String removeStudent(@PathVariable int index){
        StudentList.remove(index);
        return "removed Student Successfully...";
    }
}
