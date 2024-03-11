package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface XLSRepository extends JpaRepository<File, Long> {
}
