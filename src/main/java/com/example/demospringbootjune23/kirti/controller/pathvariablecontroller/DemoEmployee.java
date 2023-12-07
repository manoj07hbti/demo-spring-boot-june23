package com.example.demospringbootjune23.kirti.controller.pathvariablecontroller;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class DemoEmployee {

    List<Employee> employees = new ArrayList<>();
    @RequestMapping("/EmpData/{EmpName}/{EmpID}/{EmpDpt}")
    public Employee empData(@PathVariable String EmpName,@PathVariable int EmpID,@PathVariable String EmpDpt){

        Employee employee = new Employee(EmpName,EmpID,EmpDpt);

        return employee;

    }
}
