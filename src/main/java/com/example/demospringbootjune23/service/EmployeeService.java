package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
  @Autowired
  EmployeeRepository repository;
    public String addEmp(Employee employee)
    {
        repository.save(employee);
        return "Successfully added to db";
    }
    public List<Employee> getAllEmp()
    {
      return repository.findAll();
    }
    public String removeById(Long id){
       repository.deleteById(id);
       return "record deleted successfully";
    }
    public Optional<Employee> getEmployee(Long id){

return repository.findById(id);
    }


    public Employee getEmpByName(String name){
        return repository.findByEmpName(name);
    }
    public Employee getEmpByCity(String city){
        return repository.findByCity(city);
    }
    public Employee getEmpByNameAndCity(String name,String city){
        return repository.findByEmpNameAndCity(name,city);
    }
    public String updateEmp(String name,Long id){
        //find name yu want t update by id
        Employee employee= repository.getById(id);
        //update name save back db
        employee.setEmpName(name);
        repository.save(employee);
        return "Updated successfully";

    }
}
