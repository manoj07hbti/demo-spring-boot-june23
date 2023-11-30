package com.example.demospringbootjune23.Repository;

import com.example.demospringbootjune23.Model.Student_Table_BD;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student_Table_BD,Long> {
}
