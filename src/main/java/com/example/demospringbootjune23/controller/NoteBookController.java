package com.example.demospringbootjune23.controller;

import com.example.demospringbootjune23.model.NoteBook;
import com.example.demospringbootjune23.service.NoteBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class NoteBookController {

    @Autowired

    NoteBookService service;

    @PostMapping("/add_notebook")

    public String add(@RequestBody NoteBook noteBook) {

        return service.add(noteBook);


    }

    @GetMapping("/get_all_notebook")

    public List<NoteBook> getAllNoteBook() {

        return service.getAllNoteBook();


    }


    //  @GetMapping("/get_notebook_status/{status}")

    //ll public List<NoteBook> getNoteBookByStatus(@PathVariable String status) {

    //  return service.getNoteBookByStatus(status);


    @DeleteMapping("/remove_by_id/{id}")

    public String deleteById(@PathVariable Long id) {

        return service.deleteById(id);

    }


}
