package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

public class EmployeeController {


    @RestController
    public class EmployeeControlar {
        ArrayList<Employee> employeeArrayList = new ArrayList<>();

        @RequestMapping("/add_emp/{name}/{ID}/{department}")
        public String addEmp(@PathVariable String name, @PathVariable int ID, @PathVariable String department) {

            Employee employee = new Employee(name, ID, department);
            employeeArrayList.add(employee);
            return "Employee added successfully";

        }

        @RequestMapping("/get_all_emp")
        public ArrayList<Employee> getEmployeeArrayList() {

            return employeeArrayList;
        }

        @RequestMapping("/update_emp")
        public String updateEmp(@RequestParam String name, @RequestParam int ID, @RequestParam String department, int index) {

            Employee emp = employeeArrayList.get(index);
            emp.setEmpName(name);
            emp.setEmpID(ID);
            emp.setEmpDepartment(department);
            employeeArrayList.set(index, emp);
            return "update employee successfully";

        }

        @RequestMapping("/remove_emp/{index}")
        public String removeEmp(@PathVariable int index) {

            employeeArrayList.remove(index);

            return "Data delete successfully";
        }

    }


}
