package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor,Long> {

}
