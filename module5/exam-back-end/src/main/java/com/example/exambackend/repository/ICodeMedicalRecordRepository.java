package com.example.exambackend.repository;

import com.example.exambackend.model.CodeMedicalRecord;
import com.example.exambackend.model.MedicalRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICodeMedicalRecordRepository extends JpaRepository<CodeMedicalRecord,Integer> {
    @Query(value = "select * from code_medical_record",nativeQuery = true,
    countQuery = "select count(*) from (select * from code_medical_record), tempt_table")
    List<MedicalRecord> selectAll();
}
