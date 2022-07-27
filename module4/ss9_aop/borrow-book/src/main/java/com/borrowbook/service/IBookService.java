package com.borrowbook.service;

import com.borrowbook.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBookService {

    Page<Book> selectAll(String searchName, Pageable pageable);

    void save(Book book);

    Book findById(int id);


    void borrowBook(Integer integer);
}
