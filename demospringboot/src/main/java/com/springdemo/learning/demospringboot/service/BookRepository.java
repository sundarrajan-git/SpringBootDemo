package com.springdemo.learning.demospringboot.service;

import org.springframework.stereotype.Component;

@Component
public interface BookRepository {
    public String getBookList();
}
