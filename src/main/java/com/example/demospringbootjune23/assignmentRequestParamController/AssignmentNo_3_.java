package com.example.demospringbootjune23.assignmentRequestParamController;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssignmentNo_3_ {
    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @RequestMapping("/ADD_GET_EMPLOYEE")
    public ArrayList<Employee> addAndGetEmployees(@RequestParam String EmpName, @RequestParam int EmpID, @RequestParam String dept) {
        Employee employee = new Employee(EmpName, EmpID, dept);
        employeeArrayList.add(employee);
        return employeeArrayList;

    }


}
