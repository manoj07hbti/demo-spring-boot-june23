package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.Model2.Student;
import com.example.demospringbootjune23.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DBControllerStudent {

    @Autowired
    StudentService service;
     //create
    @PostMapping("/make_stu_db")
    public String addStu(@RequestBody Student student){

        return service.add(student);

    }

    @GetMapping("/get_all_stu_db")

    public List<Student>getAllStu(){

        return service.getAllStu();
    }

    @PutMapping("/update_stu_db")
    public String updateName(@RequestParam String name,@RequestParam Long id){

     return service.updateName(name,id);

    }

    @DeleteMapping("/delete_emp_db/{id}")
    public String delete(@PathVariable Long id){

        return service.removeById(id);
    }




}
