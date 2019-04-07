package com.springdemo.learning.demospringboot.controller;


import com.springdemo.learning.demospringboot.service.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")

public class BookController {
    @Autowired
    private BookRepository bookrepo = null;

    @RequestMapping("/books")
    public String getRepo() {
        return bookrepo.getBookList();
    }

}
