package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.DOCTOR_TABLE;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DOCTOR_TABLE,Long> {
}
