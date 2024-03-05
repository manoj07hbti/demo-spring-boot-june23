package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/add_book_data")

    public String add(@RequestBody Book book) {

        return service.add(book);

    }

    @GetMapping("/get_all_book")

    public List<Book> getAllBooks() {

        return service.getAllBooks();

    }

    @GetMapping("/get_book_by_writer/{writerName}")

    public List<Book> getBookByWriterName(@PathVariable String writerName) {

        return service.getBookByWriterName(writerName);
    }


}

