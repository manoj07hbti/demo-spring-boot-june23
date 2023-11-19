package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class Student_ArrayList {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    @PostMapping("/add_Stu")
    public String addStu(@RequestBody Student student) {

        studentArrayList.add(student);
        return "Student Added Successfully";
    }

    @GetMapping("/get_students")
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    // ...................UPDATE STUDENT............................
    @PutMapping("/stu_update")
    public String updateStu(@PathVariable String name, @PathVariable int index) {

        Student student = studentArrayList.get(index);
        student.setName(name);
        studentArrayList.set(index, student);
        return "Record Update Successfully";

    }
    @DeleteMapping("/remove_stu")
    public String removeStu(@PathVariable int index){
        studentArrayList.remove(index);
        return "Record Successfully";
    }
}