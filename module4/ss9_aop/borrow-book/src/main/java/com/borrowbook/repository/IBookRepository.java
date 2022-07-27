package com.borrowbook.repository;

import com.borrowbook.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = " select * from book where name_book like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select * from book where name_book like :searchName ) temp_table ")
    Page<Book> findAll(String searchName, Pageable pageable);
}
