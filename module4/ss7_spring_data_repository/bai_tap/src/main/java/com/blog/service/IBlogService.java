package com.blog.service;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IBlogService {
    Page<Blog> findAll(String searchName, Pageable pageable);

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);


}
