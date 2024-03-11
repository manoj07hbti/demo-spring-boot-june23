package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.EntityFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReadXLSandSaveDataRepository extends JpaRepository<EntityFile, Long> {
}
