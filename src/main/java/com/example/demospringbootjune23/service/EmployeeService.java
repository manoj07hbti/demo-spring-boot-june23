package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository repository;

    public String add(Employee employee){

        repository.save(employee);// INSERT INTO TABLE
        return "Successfully saved to DB...";
    }
    public Optional<Employee> getEmployeeById(Long id){
        return repository.findById(id); // select * from TABLE where id=?
    }
    public Employee getEmployeeByName(@PathVariable String name){
        return repository.findByEmpName(name);
    }

    public Employee getEmployeeByIdName(Long id, String name){
        return repository.findByIdAndEmpName(id,name) ;
    }
    public List<Employee> getAllEmp(){

      return repository.findAll(); // SELECT * FROM TABLE
    }

    public String removeById(Long id){

        repository.deleteById(id);// DELETE FROM TABLE WHERE ID=

        return "Successfully deleted data from Db...";
    }

    public String updateName( String name,  Long id){
     // STEP 1 : FIND THE RECORD WHICH YOU WANT TO UPDATE
       Employee employee=repository.getById(id); // find record by id SELECT * FROM TABLE WHERE ID=63
     // STEP 2 : UPDATE THE NAME AND SAVE BACK TO DB
      employee.setEmpName(name);// changing the name
      repository.save(employee);

      return "Successfully updated name as "+name;
    }
}
