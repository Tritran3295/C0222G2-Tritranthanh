package com.example.bookborrow.service;

import com.example.bookborrow.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> selectAll();

    Book findById(int id);

    void save(Book book);
}
