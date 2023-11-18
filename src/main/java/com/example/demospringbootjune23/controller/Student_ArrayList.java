package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class Student_ArrayList {
    ArrayList<Student> studentArrayList = new ArrayList<>();

    @RequestMapping("/make_Stu/{name}/{roll_no}/{section}")
    public String addStu(@PathVariable String name, @PathVariable int roll_no, @PathVariable String section) {

        Student student = new Student(name, roll_no, section);
        studentArrayList.add(student);
        return "Student Added Successfully";
    }

    @RequestMapping("/get_students")
    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }

    // ...................UPDATE STUDENT............................
    @RequestMapping("/stu_update")
    public String updateStu(@PathVariable String name, @PathVariable int index) {

        Student student = studentArrayList.get(index);
        student.setName(name);
        studentArrayList.set(index, student);
        return "Record Update Successfully";

    }
    @RequestMapping("/remove_stu")
    public String removeStu(@PathVariable int index){
        studentArrayList.remove(index);
        return "Record Successfully";
    }
}