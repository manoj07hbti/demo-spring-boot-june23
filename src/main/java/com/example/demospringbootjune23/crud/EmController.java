package com.example.demospringbootjune23.crud;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmController {


    ArrayList<Employee> employeeArrayList = new ArrayList<>();

    @PostMapping("/add_em_obj")
    public String addEmployee(@RequestBody Employee employee) {
        employeeArrayList.add(employee);

        return "Employee added...";
    }

    // Add
    @PostMapping("/add_em/{name}/{id}/{dept}")
    public String addEm(@PathVariable String name, @PathVariable int id, @PathVariable String dept) {

        Employee employee = new Employee(name, id, dept);

        employeeArrayList.add(employee);

        return "Employee Added";


    }

    //Get...
    @GetMapping("/get_all_em")
    public ArrayList<Employee> getEmployeeArrayList() {

        return employeeArrayList;


    }
    // Update..

    @PutMapping("/update_em")

    public String updateEm(@RequestParam String name, @RequestParam int index) {

        Employee employee = employeeArrayList.get(index);

        employee.setEmpName(name);

        employeeArrayList.set(index, employee);

        return "Employee name updated successfully";

    }

    // Delete...

    @DeleteMapping("/remove_em/{index}")

    public String removeEmp(@PathVariable int index) {

        employeeArrayList.remove(index);

        return "record deleted";


    }

}

