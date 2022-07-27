package com.borrowbook.repository;

import com.borrowbook.model.Oder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICodeBookRepository extends JpaRepository<Oder,Integer> {
}
