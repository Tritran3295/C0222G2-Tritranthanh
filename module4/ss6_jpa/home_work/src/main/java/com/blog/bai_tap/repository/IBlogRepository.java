package com.blog.bai_tap.repository;

import com.blog.bai_tap.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;

@Transactional
public interface IBlogRepository  extends JpaRepository<Blog,Integer> {
}
