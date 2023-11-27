package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
