package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.Model2.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;


    @PostMapping("/add_emp_db")
    public String addEmp(@RequestBody Employee employee){

        return service.addEmp(employee);

    }
     @GetMapping("/get_all_emp_db")
    public List<Employee> getAllEmp(){

        return service.getAllEmp();
     }
     @DeleteMapping("/deleted_emp_db/{id}")
     public String delete(@PathVariable Long id){
        return service.removeById(id);
     }
     @PutMapping("/update_emp_db")
     public String updateName(@RequestParam String name,@RequestParam Long id){
        return service.updateName(name,id);
     }
     @GetMapping("get_emp_by_id/{id}")
    public Employee getEmployee(@PathVariable Long id){
        return service.getEmployeeById(id);
     }
     @GetMapping("get_emp_by_name/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return service.getEmployeeByName(name);
     }
     @GetMapping("/get_emp_By_id_name/{id}/{name}")
    public Employee getEmployeeIdName(@PathVariable Long id,@PathVariable String name){
        return service.getEmployeeByIdName(id,name);
     }


     }





