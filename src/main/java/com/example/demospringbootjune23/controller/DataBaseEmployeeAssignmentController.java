package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.EmployeeAssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DataBaseEmployeeAssignmentController {

    @Autowired
    EmployeeAssignmentService service;


    //CREATE
    @PostMapping("/add_dataBase_assignment_emp")
    public String add(@RequestBody Employee employee)  {
        return service.add(employee);
    }





    @GetMapping("/get_all_dataBase_emp_assignment")
    public List<Employee> getAllEmployeeDataBase() {

        return service.getAllEmployeeDataBase();
    }




    @GetMapping("/get_all_dataBase_emp_assignment_native")
    public List<Employee> getAllEmpNative() {

        return service.getAllEmployeeDataBaseNative();
    }


    @GetMapping("/get_emp_by_name_native/{name}")
    public Employee getEmployeeNameNative(@PathVariable String name) {

        return service.getEmployeeByNameNative(name);
    }




    @GetMapping("/get_emp_by_name_dept_native/{name}/{dept}")
    public Employee getEmployeeNameDeptNative(@PathVariable String name, @PathVariable String dept) {

        return service.getEmployeeByNameDeptNative(name, dept);
    }



    @GetMapping("/get_emp_By_id_assignment/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id) {

        return service.getEmployeeById(id);
    }





    @GetMapping("/get_emp_By_name_assignment/{name}")
    public Employee getEmployeeByName(@PathVariable String name) {

        return service.getEmployeeByName(name);
    }




    @GetMapping("/get_emp_By_id_city_assignment/{id}/{city}")
    public Employee getEmployeeByIdAndCity(@PathVariable Long id, @PathVariable String city) {

        return service.getEmployeeByIdAndCity(id, city);
    }





    @GetMapping("/get_emp_By_name_city_assignment/{name}/{city}")
    public Employee getEmployeeByAndNameCity(@PathVariable String name, @PathVariable String city) {

        return service.getEmployeeByNameAndCity(name, city);
    }


    @DeleteMapping("/remove_dataBase_emp_assignment/{id}")
    public String delete(@PathVariable Long id) {

        return service.removeById(id);
    }

}
