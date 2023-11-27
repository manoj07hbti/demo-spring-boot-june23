package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class DBController {

    @Autowired
    EmployeeService service;
    //CREATE

    @PostMapping("/add_emp_db")
    public String add(@RequestBody Employee employee) {

        return service.add(employee);
    }

    //READ
    @GetMapping("/get_all_emp_db")
    public List<Employee> getAllEmp() {

        return service.getAllEmp();
    }

    @PutMapping("/update_emp_db")
    public String updateName(@RequestParam String name, @RequestParam Long id) {

        return service.updateName(name, id);
    }

    @DeleteMapping("/delete_emp_db/{id}")
    public String delete(@PathVariable Long id) {

        return service.removeById(id);
    }
}
