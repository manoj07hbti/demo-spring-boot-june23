package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
@GetMapping("/get_db_emp_by_id/{id}")
public Optional<Employee> getEmployee(@PathVariable Long id){
    return service.getEmployee(id);
}
@GetMapping("get_db_emp_by_name/{name}")
public Employee getEmployeeByName(@PathVariable String name){
    return service.getEmpByName(name);

}
@GetMapping("get_db_emp_by_city/{city}")
public Employee getEmployeeByCity(@PathVariable String city){
    return service.getEmpByCity(city);
}
    @GetMapping("get_db_emp_by_name_city/{name}/{city}")
    public Employee getEmployeeByNameAndCity(@PathVariable String name,@PathVariable String city){
        return service.getEmpByNameAndCity(name,city);
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