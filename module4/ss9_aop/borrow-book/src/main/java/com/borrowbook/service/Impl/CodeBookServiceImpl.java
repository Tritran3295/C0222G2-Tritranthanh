package com.borrowbook.service.Impl;

import com.borrowbook.model.Oder;
import com.borrowbook.repository.ICodeBookRepository;
import com.borrowbook.service.ICodeBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeBookServiceImpl implements ICodeBookService {
    @Autowired
    private ICodeBookRepository codeBookRepository;
    @Override
    public List<Oder> selectAll() {
        return codeBookRepository.findAll();
    }
}
