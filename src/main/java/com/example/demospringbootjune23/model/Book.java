package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "BOOK_LIBRARY_SYSTEM")
public class Book {
    @Id
            @GeneratedValue
    Long id;
    String name;
    String subject;
    String writer;
    Long pages;
    Long prize;
    String status;
    String studentName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Long getPages() {
        return pages;
    }

    public void setPages(Long pages) {
        this.pages = pages;
    }

    public Long getPrize() {
        return prize;
    }

    public void setPrize(Long prize) {
        this.prize = prize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Book(String name, String subject, String writer, Long pages, Long prize, String status, String studentName) {
        this.name = name;
        this.subject = subject;
        this.writer = writer;
        this.pages = pages;
        this.prize = prize;
        this.status = status;
        this.studentName = studentName;
    }

    public Book() {
    }
}
