package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Boeing;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PlaneRepository extends JpaRepository<Boeing, Long> {

    public Optional<Boeing> findById(Long id);


}
