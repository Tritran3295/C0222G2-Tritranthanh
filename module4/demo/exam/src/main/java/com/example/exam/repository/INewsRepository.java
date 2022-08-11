package com.example.exam.repository;

import com.example.exam.model.News;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public interface INewsRepository extends JpaRepository<News,Integer> {
    @Modifying
    @Transactional
    @Query(value = "update news set status = 1 where news.id = :id",nativeQuery = true)
    void deleteNews(int id);

    @Query(value = "select * from news where title like :searchName",nativeQuery = true)
    List<News> findByName(String searchName);
}
