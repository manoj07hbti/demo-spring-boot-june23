package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    BookRepository repository;

    public String add(Book book) {

        repository.save(book);

        return "Successfully Added to Library System";

    }

    public List<Book> getAllBooks() {

        return repository.findAll();


    }

    public List<Book> getBookByWriterName(String writerName) {

        return repository.findByWriterName(writerName);

    }

}
