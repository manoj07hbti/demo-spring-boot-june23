package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @PostMapping("/add_emp_database")

    public String add(@RequestBody Employee employee) {

        return service.add(employee);
    }

    @GetMapping("/get_all_employee_database")

    public List<Employee> getAllEmployeeDatabase() {

        return service.getAllEmployeeDatabase();
    }

    @GetMapping("/get_all_employee_database_native")

    public List<Employee> getAllEmployeeDatabaseNative() {

        return service.getAllEmployeeDatabaseNative();
    }

    @GetMapping("/get_employee_by_id/{id}")

    public Optional<Employee> getEmployeeById(@PathVariable Long id) {

        return service.getEmployeeById(id);

    }

    @GetMapping("/get_employee_by_name/{name}")

    public Employee getEmployeeByName(@PathVariable String name) {

        return service.getEmployeeByName(name);
    }

    @GetMapping("/get_employee_by_name_native/{name}")

    public Employee getEmployeeByNameNative(@PathVariable String name) {

        return service.getEmployeeByNameNative(name);
    }

    @GetMapping("/get_employee_by_name_dept_native/{name}/{dept}")

    public Employee getEmployeeByNameDeptNative(@PathVariable String name, @PathVariable String dept) {

        return service.getEmployeeByNameDeptNative(name, dept);
    }

    @DeleteMapping("/remove_employee/{id}")

    public String deleteName(@PathVariable Long id) {

        return service.removeById(id);


    }

}
