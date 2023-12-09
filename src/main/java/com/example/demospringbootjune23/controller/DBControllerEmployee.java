package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.EmployeeEr;
import com.example.demospringbootjune23.service.EmployeeErService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class DBControllerEmployee {

    @Autowired
    EmployeeErService service;

    //create
    @PostMapping("/add_EmpEr_db")
    public String add(@RequestBody EmployeeEr employeeEr) {
        return service.add(employeeEr);
    }

    //read
    @GetMapping("/get_all_EmpEr")
    public List<EmployeeEr> getAllEmpEr(){
        return service.getAllEmpEr();
    }
    //update
    @PutMapping("/update_EmpEr_db")
    public String updateName(@RequestParam String name,@RequestParam Long id){
        return service.updateName(name, id);
    }

    //delete
    @DeleteMapping("/delete_EmpEr_db/{id}")
    public String remove(@PathVariable Long id){
        return service.removeById(id);
    }


    //This All Db custom method
    @GetMapping("/get_EmpEr_by_id/{id}")
    public Optional<EmployeeEr> getEmployeeErById(@PathVariable Long id){
        return service.getEmployeeErById(id);
    }
    @GetMapping("/get_EmpEr_by_name/{name}")
    public EmployeeEr getEmployeeErByName(@PathVariable String name){
        return service.getEmployeeErByName(name);
    }
    @GetMapping("/get_EmpEr_by_id_name/{id}/{name}")
    public EmployeeEr getEmployeeErByIdName( @PathVariable Long id, @PathVariable String name){
        return service.getEmployeeErByIdName(id,name);

    }

}
