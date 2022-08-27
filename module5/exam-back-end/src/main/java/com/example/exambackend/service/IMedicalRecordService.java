package com.example.exambackend.service;

import com.example.exambackend.model.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IMedicalRecordService {
    Page<MedicalRecord> findAllMedicalRecord(Pageable pageable, String searchName);

    MedicalRecord save(MedicalRecord medicalRecord);

    MedicalRecord findById(Integer id);

    void delete(Integer id);

}
