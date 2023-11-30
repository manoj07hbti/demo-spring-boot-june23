package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {



    public Optional<Employee> findById(Long id);


    public Employee findByEmpName(String name);// SELECT * FROM EMPLOYEE WHERE NAME = ?


    public Employee findByIdAndEmpName(Long id, String name);
}
