package com.example.demospringbootjune23.service;


import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.EmployeeAssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeAssignmentService {

    @Autowired
    EmployeeAssignmentRepository repository;

    public String add(Employee employee) {

        repository.save(employee);// INSERT INTO TABLE

        return "Successfully added to DataBase";

    }

    public Optional<Employee> getEmployeeById(Long id) {
        return repository.findById(id);// SELECT * FROM TABLE WHERE ID=?

    }

    //READ
    public List<Employee> getAllEmployeeDataBase() {
        return repository.findAll();//SELECT * FROM TABLE-NAME
    }

    public List<Employee> getAllEmployeeDataBaseNative() {
        return repository.getAllEmpNative();//SELECT * FROM TABLE-NAME
    }

    public Employee getEmployeeByName(String name) {

        return repository.findByEmpName(name);
    }

    public Employee getEmployeeByIdAndCity(Long id, String city) {

        return repository.findByIdAndCity(id, city);
    }

    public Employee getEmployeeByNameAndCity(String name, String city) {

        return repository.findByEmpNameAndCity(name, city);
    }

    public Employee getEmployeeByNameNative(String name) {

        return repository.getEmpNameNative(name);
    }

    public Employee getEmployeeByNameDeptNative(String name, String dept) {

        return repository.getEmpNameDeptNative(name, dept);
    }


    public String removeById(Long id) {
        repository.deleteById(id);//DELETE FROM TABLE WHERE ID=?
        return "Successfully Deleted from DataBase";
    }

}
