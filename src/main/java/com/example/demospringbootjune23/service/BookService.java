package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.Book;
import com.example.demospringbootjune23.model.Student;
import com.example.demospringbootjune23.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    public String addAllAvailableBook(Book book)
    {
        bookRepository.save(book);
        return "Book added successfully";
    }

    public List<Book> getAllBook(){
        return bookRepository.findAll();

    }
    public String updateBook(String status,String studentName,Long id)
    {
        Book book=bookRepository.getById(id);
        book.setStatus(status);
        book.setStudentName(studentName);
  bookRepository.save(book);

        return "updated successful";
    }

    public String removeById( Long id){
   bookRepository.deleteById(id);
        return "Deleted successful";

    }


    public Optional<Book> getAllBookById(Long id){
        return bookRepository.findById(id);    }

    public List<Book> getAllBookByStatus(String status){
        return bookRepository.findByStatus(status);
    }
}
