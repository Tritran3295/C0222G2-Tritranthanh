package com.example.exam.service.Impl;

import com.example.exam.model.OptionNews;
import com.example.exam.repository.IOptionNewsRepository;
import com.example.exam.service.IOptionNewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionNewsServiceImpl implements IOptionNewsService {
    @Autowired
    private IOptionNewsRepository optionNewsRepository;

    @Override
    public List<OptionNews> selectAll() {
        return optionNewsRepository.findAll();
    }
}
