package com.blog.service;

import com.blog.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> selectAll();

    void delete(int id);
}
