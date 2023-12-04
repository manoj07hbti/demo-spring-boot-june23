package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.model.Teacher;
import com.example.demospringbootjune23.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBTeacherController {

    @Autowired
    TeacherService service;

    @PostMapping("/Db_Teacher")
    public String addTeacher(@RequestBody Teacher teacher) {

        return service.add(teacher);
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @GetMapping("/get_all_tea")
    public List<Teacher> getAllTea() {
        return service.getAllTea();
    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @PutMapping("/update_Tea_db")
    public String updateName(@RequestParam String name, @RequestParam Long id) {
        return service.updateName(name, id);

    }
//<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
    @DeleteMapping("/delete_Tea_db/{id}")
    public String delete(@PathVariable Long id) {
        return service.removeById(id);

    }
//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
    @GetMapping("/get_tea_search_by_name/{name}")
    public  Teacher getTeacherName( @PathVariable String name ){
        return service.getTeacherName(name);

    }
    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    @GetMapping("/get_tea_search_by_id_name/{id}/{name}")
    public  Teacher getTeacherName( @PathVariable Long id , @PathVariable String name ) {
        return service.getTeacherName(id, name);
    }

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*****************************************************
    @GetMapping("/get_tea_search_by_id/{id}")
    public Teacher getTeacher( @PathVariable Long id){
        return service.getTeacherById(id);

    }

    }






