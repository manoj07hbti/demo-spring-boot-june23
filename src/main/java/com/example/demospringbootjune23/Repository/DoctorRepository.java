package com.example.demospringbootjune23.Repository;

import com.example.demospringbootjune23.Model.DoctorDataBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DoctorRepository extends JpaRepository<DoctorDataBase,Long > {

}
