package com.example.exambackend.service;

import com.example.exambackend.model.MedicalRecord;

import java.util.List;

public interface ICodeMedicalRecordService {
    List<MedicalRecord> findAll();
}
