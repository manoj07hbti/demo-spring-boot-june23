package com.example.demospringbootjune23.kirti.controller.pathvariablecontroller;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
@RestController
public class EmployeeSecond {

    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @RequestMapping("/Emp_List/{EmpName}/{EmpID}/{EmpDpt}")
    public ArrayList<Employee> addAndGetEmployees(@PathVariable String EmpName,@PathVariable int EmpId,@PathVariable String EmpDpt){

        Employee employee= new Employee(EmpName,EmpId,EmpDpt);

        employeeArrayList.add(employee);
        return employeeArrayList;
    }
}
