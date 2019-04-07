package com.springdemo.learning.demospringboot.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;


@Component
@Profile(value="Science")
public class ScienceBook implements BookRepository {
    @Override
    public String getBookList() {
        List<String> listOfBooks = Arrays.asList("Calculus", "Introduction to Physical Science");
        return listOfBooks.toString();
    }

}
