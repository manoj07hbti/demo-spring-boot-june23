package com.example.demospringbootjune23.repositroy;

import com.example.demospringbootjune23.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentReositroy extends JpaRepository<Student, Long> {


}


