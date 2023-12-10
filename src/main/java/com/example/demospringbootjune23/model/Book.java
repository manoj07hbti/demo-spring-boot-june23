package com.example.demospringbootjune23.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity(name = "Library_Of_Congress_TABLE")// it will make this java class as Database Table
public class Book {
    @Id // it will make this field primary key:it will allow only unique identity
    @GeneratedValue // it will automatically provide value to id column
    Long id;


    public String bookName;

    public String writerName;

    public int bookPages;

    public String status;

    public String borrowedTo;

    public String getBorrowedFrom;

    public Book(String bookName, String writerName, int bookPages, String status, String borrowedTo, String getBorrowedFrom) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.bookPages = bookPages;
        this.status = status;
        this.borrowedTo = borrowedTo;
        this.getBorrowedFrom = getBorrowedFrom;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public int getBookPages() {
        return bookPages;
    }

    public void setBookPages(int bookPages) {
        this.bookPages = bookPages;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getBorrowedTo() {
        return borrowedTo;
    }

    public void setBorrowedTo(String borrowedTo) {
        this.borrowedTo = borrowedTo;
    }

    public String getGetBorrowedFrom() {
        return getBorrowedFrom;
    }

    public void setGetBorrowedFrom(String getBorrowedFrom) {
        this.getBorrowedFrom = getBorrowedFrom;
    }

    public Book() {
    }
}