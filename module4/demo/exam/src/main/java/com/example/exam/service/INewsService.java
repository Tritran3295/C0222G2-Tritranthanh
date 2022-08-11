package com.example.exam.service;

import com.example.exam.model.News;

import java.util.List;
import java.util.Optional;

public interface INewsService {
    List<News> selectAll();

    void delete(int id);


    News findById(int id);

    void save(News news);


    List<News> findByName(String searchName);
}
