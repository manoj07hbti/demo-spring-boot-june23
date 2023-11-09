package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class StudentController{
        ArrayList<Student> studentClassArrayList = new ArrayList<>();

        @RequestMapping("/add_student/{name}/{age}/{section}")
        public String addStudent(@PathVariable String name, @PathVariable int age, @PathVariable String section) {

            Student student = new Student(name, age, section);

            studentClassArrayList.add(student);
            return "Student data successfully add";
        }

        @RequestMapping("/get_all_student")
        public ArrayList<Student> getStudentClassArrayList() {

            return studentClassArrayList;
        }

        @RequestMapping("/update_student")
        public String updateStudent(@RequestParam String name, @RequestParam int age, @RequestParam String section, @RequestParam int index) {

            Student student = studentClassArrayList.get(index);
            student.setName(name);
            student.setAge(age);
            student.setSection(section);
            studentClassArrayList.set(index, student);
            return "update student successfully";
        }

        @RequestMapping("/remove_student/{index}")
        public String removeStudent(@PathVariable int index) {

            studentClassArrayList.remove(index);

            return "Data deleted successfully";
        }


    }




