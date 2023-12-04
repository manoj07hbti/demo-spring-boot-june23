package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Engineer;
import com.example.demospringbootjune23.model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface TeacherRepository extends JpaRepository<Teacher , Long> {

    public Optional<Teacher> findById(Long id);

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<******************************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public Teacher findByName(String name);

    //<<<<<<<<<<<<<<<<<<<<<<<<<<<<****************************************************>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

    public Teacher findByIdAndName(Long id , String Name);

}
