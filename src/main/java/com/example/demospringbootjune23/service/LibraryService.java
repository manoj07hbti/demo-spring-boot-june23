package com.example.demospringbootjune23.service;


import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.model.Employee;
import com.example.demospringbootjune23.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibraryService {

    @Autowired
    LibraryRepository repository;

    //PUT
    public String add(Book book) {

        repository.save(book);// INSERT INTO TABLE

        return "Successfully added to Library System";

    }

    //GET READ
    public List<Book> getAllLibraryBooks() {
        return repository.findAll();//SELECT * FROM TABLE-NAME
    }

    //GET READ
    public Optional<Book> getBookById(Long id) {
        return repository.findById(id);// SELECT * FROM TABLE WHERE ID=?

    }

    //GET READ
    public List<Book> getBooksByStatus(String status) {
        return repository.findByStatus(status);
    }

    public String updateBookName(String bookName, String borrowedTo, String status, Long id) {

        // step 1: Find the Record which you want to update

        Book book = repository.getById(id);// find record by id SELECT * FROM TABLE WHERE ID=?

        //step 2: Update the name and save back to DataBase
        book.setBookName(bookName);
        book.setGetBorrowedFrom(borrowedTo);
        book.setStatus(status);
        repository.save(book);
        return "Successfully Updated";
    }
    public String deleteById(Long id) {
        repository.deleteById(id);//DELETE FROM TABLE WHERE ID=?
        return "Successfully Deleted from Library DataBase";
    }

}
