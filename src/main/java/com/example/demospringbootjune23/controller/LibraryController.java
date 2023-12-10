package com.example.demospringbootjune23.controller;


import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LibraryController {


    @Autowired
    LibraryService service;

    @PostMapping("/add_dataBase_book")
    public String add(@RequestBody Book book) {
        return service.add(book);
    }

    @GetMapping("/get_all_books")
    public List<Book>getAllLibraryBooks(){

        return service.getAllLibraryBooks();
    }
    @GetMapping("/get_book_by_id/{id}")
    public Optional<Book> getBookById(@PathVariable Long id) {

        return service.getBookById(id);
    }
    @GetMapping("/get_books_by_status/{status}")
    public List<Book> getBooksByStatus(@PathVariable String status){
        return service.getBooksByStatus(status);
    }
    @PutMapping("/update_library_books")
    public String updateBookName(@RequestParam String bookName, @RequestParam String borrowedTo, @RequestParam String status, @RequestParam Long id) {

        return service.updateBookName(bookName, borrowedTo, status, id);

    }
    @DeleteMapping("/remove_by_id/{id}")
    public String deleteById(@PathVariable Long id) {

        return service.deleteById(id);
    }

}
