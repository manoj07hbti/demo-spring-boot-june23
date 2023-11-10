package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class EmpController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();


    @PostMapping("/add_emp_obj")
    public String addEmployee(@RequestBody Employee employee){
        employeeArrayList.add(employee);

        return "Employee added...";
    }
    //Add
    @PostMapping("/add_emp/{name}/{id}/{dept}")
    public String addEmp(@PathVariable String name, @PathVariable int id,@PathVariable String dept){
        Employee employee=new Employee(name,id,dept);
       employeeArrayList.add(employee);
     return "Employee Added Successfully...";
    }

    @GetMapping("/get_all_emp")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    @PutMapping("/update_emp")
    public String updateEmp(@RequestParam String name ,@RequestParam int  index){
        //get employee object
       Employee emp= employeeArrayList.get(index);//
        emp.setEmpName(name);
        employeeArrayList.set(index,emp);
        return "Record update_successfully...";
    }

    @DeleteMapping("remove_emp/{index}")
    public String removeEmp(@PathVariable int index){
        employeeArrayList.remove(index);
        return "record_deleted..";
    }

}
