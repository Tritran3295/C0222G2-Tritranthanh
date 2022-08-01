package com.music.service;

import com.music.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> selectAll();
}
