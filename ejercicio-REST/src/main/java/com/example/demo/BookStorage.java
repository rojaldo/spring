package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class BookStorage {

    @Id
    @GeneratedValue
    private Long id;
    private Long bookId;

    // avoid this "No default constructor for entity"
    public BookStorage() {
    }

    public BookStorage(Long id, Long bookId) {
        this.id = id;
        this.bookId = bookId;
    }

    public BookStorage(Long bookId) {
        this.bookId = bookId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    @Override
    public String toString() {
        return "BookStorage{" +
                "id=" + id +
                ", Book ID='" + bookId + '\'' +
                '}';
    }

}
