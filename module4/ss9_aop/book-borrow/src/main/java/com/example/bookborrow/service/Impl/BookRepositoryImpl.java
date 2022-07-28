package com.example.bookborrow.service.Impl;

import com.example.bookborrow.model.Book;
import com.example.bookborrow.repository.IBookRepository;
import com.example.bookborrow.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookRepositoryImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepository;

    @Override
    public List<Book> selectAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book findById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Book book) {
        bookRepository.save(book);
    }

    @Override
    public void borrow(Book book) {
        bookRepository.update(book.getId(),(book.getCount() -1));
    }
}
