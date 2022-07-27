package com.example.bookborrow.repository;

import com.example.bookborrow.model.Borrow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBorrowRepository extends JpaRepository<Borrow,Integer> {
}
