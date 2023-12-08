package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService bookService;
    @PostMapping("/get_all_books/{name}/{subject}/{writer}/{pages}/{prize}/{status}/{studentName}")
    public String addAllAvailableBook(@PathVariable String name, @PathVariable String subject,@PathVariable String writer,@PathVariable Long pages, @PathVariable Long prize, @PathVariable String status, @PathVariable String studentName)
    {
        Book book=new Book(name,subject,writer,pages,prize,status,studentName);
        return bookService.addAllAvailableBook(book);

    }

    @GetMapping("/get_db_books")
    public List<Book> getAllBook(){
        return bookService.getAllBook();

    }
    @PutMapping("/update_db_books/{id}/{status}/{studentName}")
    public String updateBook(@PathVariable String status,@PathVariable String studentName,@PathVariable Long id)
    {
        return bookService.updateBook(status,studentName,id);
    }

    @DeleteMapping("/remove_db_book")
    public String removeById(@RequestParam Long id){
        return bookService.removeById(id);
    }
    @GetMapping("/book_details/{id}")
    public Optional<Book> getAllBookById(@PathVariable Long id){
        return bookService.getAllBookById(id);

    }
    @GetMapping("/available_book_details/{status}")
    public  List<Book> getAllAvailableBook(@PathVariable String status){
        return bookService.getAllBookByStatus(status);
    }

}
