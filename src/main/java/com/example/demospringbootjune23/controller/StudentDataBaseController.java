package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class StudentDataBaseController {

@Autowired
    StudentService service;

//CREATE
    @PostMapping("/add_student_dataBase")
    public String add(@RequestBody Student student){

        return service.add(student);
    }

    //READ
    @GetMapping("/get_all_student_db")
    public List<Student> getAllStudent() {

        return service.getAllStudentDataBase();
    }

    @PutMapping("/update_dataBase_student")
    public String updateName(@RequestParam String name, @RequestParam Integer rollNo) {

        return service.updateName(name, rollNo);

    }

    @DeleteMapping("/remove_dataBase_student/{id}")
    public String delete(@PathVariable Integer rollNo) {

        return service.removeById(rollNo);
    }

}
