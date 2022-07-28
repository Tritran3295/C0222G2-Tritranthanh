package com.example.bookborrow.service;

import com.example.bookborrow.model.Borrow;

import java.util.List;

public interface IBorrowService {
    List<Borrow> selectAll();

    void saveBorrow(int code, Integer id);
}
