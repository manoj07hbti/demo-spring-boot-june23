package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.Model2.DoctorClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorClass,Long> {
}
