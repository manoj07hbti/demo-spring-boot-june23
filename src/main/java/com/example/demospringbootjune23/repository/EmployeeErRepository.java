package com.example.demospringbootjune23.repository;


import com.example.demospringbootjune23.model.EmployeeEr;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeErRepository extends JpaRepository<EmployeeEr,Long> {
    public Optional<EmployeeEr> findById(Long id);
    public EmployeeEr findByEmpName(String name);

   public EmployeeEr findByIdAndEmpName (Long id, String name);
}
