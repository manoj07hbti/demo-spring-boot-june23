package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.model.Student;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class EmpController {

    ArrayList<Employee> employeeArrayList=new ArrayList<>();

    //Add
    @RequestMapping("/add_emp/{name}/{id}/{dept}")
    public String addEmp(@PathVariable String name, @PathVariable int id,@PathVariable String dept, @PathVariable String city){
        Employee employee=new Employee(name,id,dept,city);
       employeeArrayList.add(employee);
     return "Employee Added Successfully...";
    }

    @RequestMapping("/get_all_emp")
    public ArrayList<Employee> getEmployeeArrayList(){

        return employeeArrayList;
    }

    @RequestMapping("/update_emp")
    public String updateEmp(@RequestParam String name ,@RequestParam int  index){
        //get employee object
       Employee emp= employeeArrayList.get(index);//
        emp.setEmpName(name);
        employeeArrayList.set(index,emp);
        return "Record update_successfully...";
    }

    @RequestMapping("remove_emp/{index}")
    public String removeEmp(@PathVariable int index){
        employeeArrayList.remove(index);
        return "record_deleted..";
    }

}
