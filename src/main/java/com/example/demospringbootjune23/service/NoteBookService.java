package com.example.demospringbootjune23.service;

import com.example.demospringbootjune23.model.NoteBook;
import com.example.demospringbootjune23.repository.NoteBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NoteBookService {

    @Autowired
    NoteBookRepository repository;

    public String add(NoteBook noteBook) {

        repository.save(noteBook);

        return "Successfully added to notebook system";


    }

    public List<NoteBook> getAllNoteBook() {

        return repository.findAll();

    }


    //  public List<NoteBook> getNoteBookByStatus(String status) {

    //    return repository.findByStatus(status)


    public String deleteById(Long id) {

        repository.deleteById(id);

        return "Successfully deleted from notebook";
    }


}
