package com.blog.bai_tap.service;

import com.blog.bai_tap.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);
}
