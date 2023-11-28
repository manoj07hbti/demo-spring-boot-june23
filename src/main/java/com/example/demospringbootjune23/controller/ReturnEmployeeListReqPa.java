package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class ReturnEmployeeListReqPa {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();
    @RequestMapping("/add_get_Employee")


        public ArrayList<Employee> getEmployeeArrayList (@RequestParam String name,@RequestParam int age,
        @RequestParam String company){
            Employee employee = new Employee(name, age, company);
            employeeArrayList.add(employee);
            return employeeArrayList;
        }
        //http://localhost:8080/add_get_Employee?name=Ashwin&age=23&company=LNT
    }


