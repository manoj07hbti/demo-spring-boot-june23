package com.example.demospringbootjune23.repository;

import com.example.demospringbootjune23.model.NoteBook;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface NoteBookRepository extends JpaRepository<NoteBook, Long> {


}
