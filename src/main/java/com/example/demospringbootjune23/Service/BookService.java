package com.example.demospringbootjune23.Service;

import com.example.demospringbootjune23.Model.Book_DB;
import com.example.demospringbootjune23.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@Service

public class BookService {
    @Autowired
    BookRepository repository;
    public String add( Book_DB book){
         repository.save(book);
         return "Successfully saved to data base..";

    }
    public List<Book_DB> getAllBook(){
        return repository.findAll();
    }
    public String deleteBook( Long id){
         repository.deleteById(id);
         return "successfully deleted to data base";

    }
    public String updated( String name,Long id){
        Book_DB book=repository.getById(id);
        book.setName(name);
        repository.save(book);
        return "successfully updated to data base" +name;
    }
    public Optional<Book_DB> getAllBookById(@PathVariable Long id){
        return repository.findById(id);
    }
    public List<Book_DB> getAllBookByStatus( String  status){
        return repository.findByStatus(status);
    }
}
