package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DataBaseController {

    @Autowired
    EmployeeService service;


    //CREATE
    @PostMapping("/add_dataBase_emp")
    public String add(@RequestBody Employee employee) {
        return service.add(employee);
    }

    //READ

    @GetMapping("/get_all_dataBase_emp")
    public List<Employee> getAllEmployeeDataBase() {

        return service.getAllEmployeeDataBase();
    }

    @PutMapping("/update_dataBase_emp")
    public String updateName(@RequestParam String name, @RequestParam Long id) {

        return service.updateName(name, id);

    }

    @DeleteMapping("/remove_dataBase_emp/{id}")
    public String delete(@PathVariable Long id) {

        return service.removeById(id);
    }

}
