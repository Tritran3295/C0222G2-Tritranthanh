package com.blog.service;

import com.blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Optional;

public interface IBlogService {
    Page<Blog> findAll(String searchName, Pageable pageable);

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);

    void update(Blog blog);


    List<Blog> selectAll();

    Optional<Blog> FindBlogById(int id);

    Blog saveBlog(Blog blog);

    void remove(int id);

    List<Blog> findByName(String nameSearch);
}
