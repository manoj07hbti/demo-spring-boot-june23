package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class DBController {
@Autowired
EmployeeService service;

@PostMapping("/add_emp_db")
    public String add(@RequestBody Employee employee){
        return service.addEmp(employee);
    }

@GetMapping("/get_db_emp")
public List<Employee> getAllEmp(){
    return service.getAllEmp();
}
@DeleteMapping("remove_db_emp")
    public String deleteById(@RequestParam Long id){
    return service.removeById(id);
}
@PutMapping("update_db_emp")
        public String updateEmp(@RequestParam String name,@RequestParam Long id)
{
    return service.updateEmp(name, id);
}

}