package com.example.exambackend.service.Impl;

import com.example.exambackend.model.MedicalRecord;
import com.example.exambackend.repository.ICodeMedicalRecordRepository;
import com.example.exambackend.service.ICodeMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodeMedicalRecordService implements ICodeMedicalRecordService {
    @Autowired
    private ICodeMedicalRecordRepository codeMedicalRecordRepository;
    @Override
    public List<MedicalRecord> findAll() {
        return codeMedicalRecordRepository.selectAll();
    }
}
