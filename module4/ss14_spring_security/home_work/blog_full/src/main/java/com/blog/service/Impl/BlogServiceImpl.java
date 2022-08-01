package com.blog.service.Impl;

import com.blog.model.Blog;
import com.blog.repository.IBlogRepository;
import com.blog.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;


    @Override
    public Page<Blog> findAll(String searchName, Pageable pageable) {
        return blogRepository.findAll("%" + searchName + "%", pageable);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> selectAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional<Blog> FindBlogById(int id) {
        return blogRepository.findById(id);
    }

    @Override
    public Blog saveBlog(Blog blog) {
        return blogRepository.save(blog);
    }

    @Override
    public void remove(int id) {
        blogRepository.delete(findById(id));
    }

}
