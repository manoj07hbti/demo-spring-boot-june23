package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpController {


    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    // Add
    @RequestMapping("/add_emp/{name}/{id}/{dept}")
    public String addEmp(@PathVariable String name, @PathVariable int id, @PathVariable String dept) {

        Employee employee = new Employee(name, id, dept);

        employeeArrayList.add(employee);

        return "Employee Added";


    }

    //Get...
    @RequestMapping("/get_all_emp")
    public ArrayList<Employee> getEmployeeArrayList() {

        return employeeArrayList;


    }
    // Update..

    @RequestMapping("/update_emp")

    public String updateEmp(@RequestParam String name, @RequestParam int index) {

        Employee employee = employeeArrayList.get(index);

        employee.setEmpName(name);

        employeeArrayList.set(index, employee);

        return "Employee name updated successfully";

    }

    // Delete...

    @RequestMapping("/remove_emp/{index}")

    public String removeEmp(@PathVariable int index) {

        employeeArrayList.remove(index);

        return "record deleted";

    }


}
