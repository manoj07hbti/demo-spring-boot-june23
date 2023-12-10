package com.example.demospringbootjune23.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book_DB {
    @Id
    @GeneratedValue
    Long id;
    String name;
    String subject;
    String writer;
    int pages;
    String status;

    public Book_DB() {
    }

    public Book_DB(String name, String subject, String writer, int pages, String status) {
        this.name = name;
        this.subject = subject;
        this.writer = writer;
        this.pages = pages;
        this.status = status;
    }

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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
