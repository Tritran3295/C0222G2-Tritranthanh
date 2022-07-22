package com.blog.service.Impl;

import com.blog.model.Category;
import com.blog.repository.ICategoryRepository;
import com.blog.service.ICategoryService;
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

    @Override
    public void delete(int id) {
        categoryRepository.deleteById(id);
    }
}
