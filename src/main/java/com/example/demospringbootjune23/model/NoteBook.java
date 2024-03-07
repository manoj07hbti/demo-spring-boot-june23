package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class NoteBook {

    @Id
    @GeneratedValue
    Long id;

    public String noteBookName;

    public String noteBookWriter;

    public String Status;

    public NoteBook() {
    }

    public NoteBook(Long id, String noteBookName, String noteBookWriter, String status) {
        this.id = id;
        this.noteBookName = noteBookName;
        this.noteBookWriter = noteBookWriter;
        Status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNoteBookName() {
        return noteBookName;
    }

    public void setNoteBookName(String noteBookName) {
        this.noteBookName = noteBookName;
    }

    public String getNoteBookWriter() {
        return noteBookWriter;
    }

    public void setNoteBookWriter(String noteBookWriter) {
        this.noteBookWriter = noteBookWriter;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }
}
