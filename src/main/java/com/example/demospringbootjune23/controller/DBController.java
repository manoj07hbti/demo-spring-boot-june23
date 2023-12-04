package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.EmployeeRepository;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@RestController
public class DBController {

    @Autowired
    EmployeeService service;

    @Autowired
    EmployeeRepository repository;
    //CREATE

    @PostMapping("/add_emp_db")
    public String add(@RequestBody Employee employee) {

        return service.add(employee);
    }

    //READ
    @GetMapping("/get_all_emp_db")
    public List<Employee> getAllEmp() {

        return service.getAllEmp();
    }

    @GetMapping("/get_all_emp_db_native")
    public List<Employee> getAllEmpNative() {

        return service.getAllEmpNative();
    }

    @GetMapping("/get_emp_by_id/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
      return   service.getEmployeeById(id);
    }

    @GetMapping("/get_emp_by_name_native/{name}")
    public Employee getEmployeeNative(@PathVariable String name){
        return   service.getEmployeeNameNative(name);
    }

    @GetMapping("/emp_by_name_dept_native/{name}/{dept}")
    public Employee getEmployeeNative(@PathVariable String name,@PathVariable String dept){
        return   service.getEmployeeNameDeptNative(name,dept);
    }

    @GetMapping("/get_emp_by_name/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return   service.getEmployeeByName(name);
    }

    @GetMapping("/get_emp_by_id_name/{id}/{name}")
    public Employee getEmployeeByIdName(@PathVariable Long id,@PathVariable String name){
        return service.getEmployeeByIdName(id,name) ;
    }

    @PutMapping("/update_emp_db")
    public String updateName(@RequestParam String name, @RequestParam Long id) {

        return service.updateName(name, id);
    }

    @DeleteMapping("/delete_emp_db/{id}")
    public String delete(@PathVariable Long id) {

        return service.removeById(id);
    }

    @DeleteMapping("/delete_emp_range/{start}/{end}")
    public String deleteByRange(@PathVariable Long start,@PathVariable Long end) {

        return repository.deleteByRange(start,end);
    }

}
