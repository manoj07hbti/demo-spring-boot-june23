package com.example.demospringbootjune23.assignmentRequestParamController;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class AssignmentNo_1_ {

    List<Employee> employees = new ArrayList<>();

    @RequestMapping("/GET_EMP_DATA")
    public Employee empData(@RequestParam String EmpName, @RequestParam int EmpID, @RequestParam String dept) {

        Employee employee = new Employee(EmpName, EmpID, dept);

        return employee;


    }


}
