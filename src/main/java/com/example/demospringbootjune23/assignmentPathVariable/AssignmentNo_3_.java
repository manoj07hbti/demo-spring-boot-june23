package com.example.demospringbootjune23.assignmentPathVariable;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class AssignmentNo_3_ {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @RequestMapping("/EMP_LIST/{EmpName}/{EmpID}/{EmpSal}")
    public ArrayList<Employee> addAndGetEmployees(@PathVariable String EmpName, @PathVariable int EmpID, @PathVariable String dept) {
        Employee employee = new Employee(EmpName, EmpID, dept);
        employeeArrayList.add(employee);
        return employeeArrayList;

    }
}
