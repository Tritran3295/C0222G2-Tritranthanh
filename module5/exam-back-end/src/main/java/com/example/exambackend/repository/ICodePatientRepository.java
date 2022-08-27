package com.example.exambackend.repository;

import com.example.exambackend.model.CodePatient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICodePatientRepository extends JpaRepository<CodePatient,Integer> {
    @Query(value = "select * from code_patient",nativeQuery = true,
    countQuery = "select count(*) from (select * from code_patient), tempt_table")
    List<CodePatient> selectAll();
}
