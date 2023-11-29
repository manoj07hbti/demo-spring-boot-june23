package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentdbController {

    @Autowired
    StudentService service;

    @PostMapping("/add_student")

    public String add(@RequestBody Student student) {


        return service.add(student);
    }

    @GetMapping("/get_student")

    public List<Student> getAllStu() {

        return service.getAllStu();
    }

    @PutMapping("/update_student")

    public String updateName(@RequestParam String name, @RequestParam Long ID) {

        return service.updateName(name, ID);

    }

    @DeleteMapping("/delete_student/{ID}")

    public String delete(@PathVariable Long ID) {

        return service.removeByID(ID);

    }
}
