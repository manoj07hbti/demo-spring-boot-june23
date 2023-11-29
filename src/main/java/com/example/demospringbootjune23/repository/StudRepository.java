package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudRepository extends JpaRepository<Student,Long> {
}
