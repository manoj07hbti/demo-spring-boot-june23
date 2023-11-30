package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {
}
