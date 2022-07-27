package com.book.service.Impl;

import com.book.repository.IOderRepository;
import com.book.service.IOderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OderServiceImpl implements IOderService {
    @Autowired
    private IOderRepository oderRepository;
}
