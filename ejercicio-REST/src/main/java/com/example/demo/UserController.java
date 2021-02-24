package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;

import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    @Autowired
    private UserRepository repository;

    // Find
    @GetMapping("/api/v1/users")
    List<User> findAll() {
        return repository.findAll();
    }

    // Save
    @PostMapping("/api/v1/users")
    // return 201 instead of 200
    @ResponseStatus(HttpStatus.CREATED)
    User newBook(@RequestBody User newBook) {
        return repository.save(newBook);
    }

    // Find
    @GetMapping("/api/v1/users/{id}")
    User findOne(@PathVariable Long id) {
        return repository.findById(id).orElseThrow(() -> new BookNotFoundException(id));
    }

    @DeleteMapping("/api/v1/users/{id}")
    void deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
