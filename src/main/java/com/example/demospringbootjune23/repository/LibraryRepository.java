package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface LibraryRepository extends JpaRepository<Book, Long> {


    public Optional<Book> findById(Long id);


    public List<Book> findByStatus(String status);// SELECT * FROM EMPLOYEE WHERE NAME = ?



}
