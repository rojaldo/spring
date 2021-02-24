package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
public class Transaction {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="book_id")
    private Long bookId;

    @Column(name="user_id")
    private Long userId;

    @Column(name="book_storage_id")
    private Long bookStorageId;


    // avoid this "No default constructor for entity"
    public Transaction() {
    }
    public Transaction(Long id, Long bookId, Long userId, Long bookStorageId) {
        this.id = id;
        this.bookId = bookId;
        this.userId = userId;
        this.bookStorageId = bookStorageId;
    }

    public Transaction(Long bookId, Long userId, Long bookStorageId) {
        this.bookId = bookId;
        this.userId = userId;
        this.bookStorageId = bookStorageId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }

    public Long getBookStorageId() {
        return bookStorageId;
    }

    public void setBookStorageId(Long bookStorageId) {
        this.bookStorageId = bookStorageId;
    }


    @Override
    public String toString() {
        return "Transaction{" +
                "id=" + id +
                ", Book ID='" + bookId + '\'' +
                ", USer ID='" + userId + '\'' +
                ", Book Storage ID ID='" + bookStorageId + '\'' +
                '}';
    }

}
