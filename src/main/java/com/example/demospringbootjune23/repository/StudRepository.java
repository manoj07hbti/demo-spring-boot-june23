package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface StudRepository extends JpaRepository<Student,Long> {
    public Optional<Student> findById(Long id);
    public Student findByName(String name);
    public Student findBySection(String section);
    public Student findByNameAndSection(String name,String section);

}
