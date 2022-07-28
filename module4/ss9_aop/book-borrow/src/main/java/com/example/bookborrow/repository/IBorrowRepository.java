package com.example.bookborrow.repository;

import com.example.bookborrow.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowRepository extends JpaRepository<Borrow,Integer> {
    @Modifying
    @Query(value = "insert into borrow (id,code_book)value(:id,:code)",nativeQuery = true)
    void saveBorrow(@Param("code") int code,@Param("id") Integer id);
}
