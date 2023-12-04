package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.Model2.Employee;
import com.example.demospringbootjune23.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public String addEmp(Employee employee){

        repository.save(employee);


        return "successfully saved to db........";
    }

    public List<Employee> getAllEmp(){
        return repository.findAll();
    }

    public String removeById(Long id){
        repository.deleteById(id);
        return "successfully deleted by data";

    }
    public String updateName(String name,Long id){

        Employee employee=repository.getById(id);
        employee.setName(name);
        repository.save(employee);
        return "successfully update name"+name;
    }
    public Employee getEmployeeById(Long id){
        return repository.findById(id).get();
    }
   public Employee getEmployeeByName(@PathVariable String name){
        return repository.findByName(name);
   }

   public Employee getEmployeeByIdName( Long id,String name){
        return repository.findByIdAndName(id,name);
   }
    

}

