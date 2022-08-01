package com.music.service.Impl;

import com.music.model.Category;
import com.music.repository.ICategoryRepository;
import com.music.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;
    @Override
    public List<Category> selectAll() {
        return categoryRepository.findAll();
    }
}
