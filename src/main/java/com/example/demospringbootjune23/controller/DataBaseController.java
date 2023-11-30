package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping("/get_emp_By_id/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {

        return service.getEmployeeById(id);
    }

    @GetMapping("/get_emp_By_name/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {

        return service.getEmployeeByName(name);
    }
    @GetMapping("/get_emp_By_id_name/{id}/{name}")
    public Employee getEmployeeByIdAndName(@PathVariable Long id, @PathVariable String name) {

        return service.getEmployeeByIdAndName(id, name);
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
