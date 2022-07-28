package com.example.bookborrow.service.Impl;

import com.example.bookborrow.model.Borrow;
import com.example.bookborrow.repository.IBorrowRepository;
import com.example.bookborrow.service.IBorrowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BorrowRepositoryImpl implements IBorrowService {
    @Autowired
    private IBorrowRepository borrowRepository;

    @Override
    public List<Borrow> selectAll() {
        return borrowRepository.findAll();
    }

    @Override
    public void saveBorrow(int code, Integer id) {
        borrowRepository.saveBorrow(code,id);
    }
}
