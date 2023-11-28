package com.example.demospringbootjune23.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class ReturnEmployeeListPath {
    ArrayList<String> Employee = new ArrayList<>();

    @RequestMapping("/add_and_get_Employee/{EmployeeName}")
    public ArrayList<String> addEmployee(@PathVariable String EmployeeName) {


        Employee.add(EmployeeName);

        return Employee;
        //http://localhost:8080/add_and_get_Employee/%7BEmployeeRohan%7D

    }

}




