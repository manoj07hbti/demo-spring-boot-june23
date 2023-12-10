package com.example.demospringbootjune23.Repository;

import com.example.demospringbootjune23.Model.Book_DB;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book_DB,Long> {
    public Optional<Book_DB> findById(Long id);
    public List<Book_DB> findByStatus(String status);
}
