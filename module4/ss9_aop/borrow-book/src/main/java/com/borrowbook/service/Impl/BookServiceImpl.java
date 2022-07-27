package com.borrowbook.service.Impl;

import com.borrowbook.model.Book;
import com.borrowbook.repository.IBookRepository;
import com.borrowbook.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepository;
    @Override
    public Page<Book> selectAll(String searchName, Pageable pageable) {
        return bookRepository.findAll("%" + searchName + "%",pageable);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void borrowBook(Integer integer) {
        
    }

}
