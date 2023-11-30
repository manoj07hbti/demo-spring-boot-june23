package com.example.demospringbootjune23.service;


import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;


    public String add(Employee employee) {

        repository.save(employee);// INSERT INTO TABLE


        return "Successfully saved to DataBase";

    }

    public List<Employee> getAllEmployeeDataBase() {
        return repository.findAll();//SELECT * FROM TABLE-NAME
    }

    public String removeById(Long id) {
        repository.deleteById(id);//DELETE FROM TABLE WHERE ID=?
        return "Successfully Deleted from DataBase";
    }

    public String updateName(String name, Long id) {

        // step 1: Find the Record which you want to update

        Employee employee = repository.getById(id);// find record by id SELECT * FROM TABLE WHERE ID=?

        //step 2: Update the name and save back to DataBase
        employee.setEmpName(name);
        repository.save(employee);
        return "Successfully Updated Name as " + name;
    }

}