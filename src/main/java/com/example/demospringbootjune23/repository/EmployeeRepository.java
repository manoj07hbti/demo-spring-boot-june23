package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.Model2.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    public Optional<Employee> findById(Long id);

    public Employee findByName(String name);

    public Employee findByIdAndName(Long id,String name);



}
