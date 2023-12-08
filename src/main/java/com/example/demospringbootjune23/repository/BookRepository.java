package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {
    public Optional<Book> findById(Long id);
    public List<Book> findByStatus(String status);
}