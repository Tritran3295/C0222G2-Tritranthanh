package com.example.exam.service.Impl;

import com.example.exam.model.News;
import com.example.exam.repository.INewsRepository;
import com.example.exam.service.INewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements INewsService {
    @Autowired
    private INewsRepository newsRepository;

    @Override
    public List<News> selectAll() {
        return newsRepository.findAll();
    }

    @Override
    public void delete(int id) {
        newsRepository.deleteNews(id);
    }

    @Override
    public News findById(int id) {
        return newsRepository.findById(id).orElse(null);
    }

    @Override
    public void save(News news) {
        newsRepository.save(news);
    }

    @Override
    public List<News> findByName(String searchName) {
        return newsRepository.findByName("%" + searchName + "%");
    }


}
