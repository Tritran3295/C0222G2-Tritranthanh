package com.example.exambackend.repository;

import com.example.exambackend.model.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IMedicalRecordRepository extends JpaRepository<MedicalRecord,Integer> {
    @Query(value = "select * from medical_record where name like :searchName",nativeQuery = true,
    countQuery = "select count(*) from (select * from medical_record where name like :searchName) temp_table")
    Page<MedicalRecord> findAllMedicalRecord(Pageable pageable, @Param("searchName") String searchName);
@Query(value = "insert into")
    MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);
}
