package com.example.demo.service;

import com.example.demo.model.Book;

import java.util.List;

public interface BookService {

    Book saveBook(Book book);
    void deleteBook(Long id);
    List<Book> findAllBooks();

}
