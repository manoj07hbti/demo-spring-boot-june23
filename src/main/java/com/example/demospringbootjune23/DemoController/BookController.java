package com.example.demospringbootjune23.DemoController;

import com.example.demospringbootjune23.Model.Book_DB;
import com.example.demospringbootjune23.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class BookController {
    @Autowired
    BookService service;
    @PostMapping("/book_add_db")
    public String add(@RequestBody Book_DB book){
        return service.add(book);

    }
    @GetMapping("/get_all_book_db")
    public List<Book_DB> getAllBook(){
        return service.getAllBook();
    }
    @DeleteMapping("/delete_book_db/{id}")
    public String deleteBook(@PathVariable Long id){
        return service.deleteBook(id);
    }
    @PutMapping("/updated_book_db")
    public String updated(@RequestParam String name,@RequestParam Long id){
        return service.updated(name, id);
    }
    @GetMapping("/book_all_details/{id}")
    public Optional<Book_DB> getAllBookById(@PathVariable Long id){
        return service.getAllBookById(id);
    }
    @GetMapping("/book_book status/{status}")
    public List<Book_DB> getAllBookByStatus(@PathVariable String  status){
        return service.getAllBookByStatus(status);
    }

}
