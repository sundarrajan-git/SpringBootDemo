package com.springdemo.learning.demospringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Arrays;

@Component
@Profile(value="ComputerScience")
public class CSBook implements BookRepository {

    @Override
    public String getBookList() {
        List<String> listOfBooks = Arrays.asList("Introduction to Algorithms", "Operating Systems");
        return listOfBooks.toString();
    }
}
