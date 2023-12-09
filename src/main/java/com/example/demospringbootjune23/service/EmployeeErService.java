package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.EmployeeEr;
import com.example.demospringbootjune23.repository.EmployeeErRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeErService {

    @Autowired
    EmployeeErRepository repository;
    public String add(EmployeeEr doctor){
        repository.save(doctor);
        return" Successfully add in db";
    }

    public List<EmployeeEr> getAllEmpEr() {
        return repository.findAll();
    }

    public String updateName(String name, Long id){

        EmployeeEr employeeEr = repository.getById(id);
        employeeEr.setEmpName(name);
        repository.save(employeeEr);
        return "successfully update the name as"+name;
    }
    public String removeById(@PathVariable Long id){
        repository.deleteById(id);
        return "Successfully delete the DB";
    }

    //custom method
    public Optional<EmployeeEr> getEmployeeErById(Long id){

        return repository.findById(id);
    }
    public EmployeeEr getEmployeeErByName(@PathVariable String name){
        return repository.findByEmpName(name);

    }
    public EmployeeEr getEmployeeErByIdName (Long id,  String name){
        return repository.findByIdAndEmpName(id,name);
    }
}
