package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

@RestController
public class TransactionsController {

    @Autowired
    private TransactionsRepository repository;

    // Find
    @GetMapping("/api/v1/transactions")
    List<Transaction> findAll() {
        return repository.findAll();
    }

    // Save
    @PostMapping("/api/v1/transactions")
    // return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    Transaction newTransaction(@RequestBody Transaction myTransaction) {
        return repository.save(myTransaction);
    }

    // Find
    @GetMapping("/api/v1/transactions/{id}")
    Transaction findOne(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @DeleteMapping("/api/v1/transactions/{id}")
    void deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
