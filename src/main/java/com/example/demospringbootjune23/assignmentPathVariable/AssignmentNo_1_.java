package com.example.demospringbootjune23.assignmentPathVariable;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

public class AssignmentNo_1_ {


    List<Employee> employees = new ArrayList<>();

    @RequestMapping("/EMP_DATA/{EmpName}/{EmpID}/{EmpSal}")
    public Employee empData(@PathVariable String EmpName, @PathVariable int EmpID, @PathVariable String dept) {

        Employee employee = new Employee(EmpName, EmpID, dept);

        return employee;


    }


}
