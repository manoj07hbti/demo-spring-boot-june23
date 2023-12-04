package com.example.demospringbootjune23.Repository;

import com.example.demospringbootjune23.Model.Emp_DB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpRepository extends JpaRepository<Emp_DB,Long> {
    public Optional<Emp_DB> findById(Long id);


    }
