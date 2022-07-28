package com.example.bookborrow.repository;

import com.example.bookborrow.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Modifying
    @Query(value = "update book set count = :count where(id = :id)",nativeQuery = true)
    void update(Integer id, int i);
}
