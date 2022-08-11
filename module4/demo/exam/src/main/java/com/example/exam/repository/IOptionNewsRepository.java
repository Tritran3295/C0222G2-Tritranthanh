package com.example.exam.repository;

import com.example.exam.model.OptionNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface IOptionNewsRepository extends JpaRepository<OptionNews,Integer> {
}
