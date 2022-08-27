package com.example.exambackend.service.Impl;

import com.example.exambackend.model.MedicalRecord;
import com.example.exambackend.repository.ICodeMedicalRecordRepository;
import com.example.exambackend.repository.ICodePatientRepository;
import com.example.exambackend.repository.IMedicalRecordRepository;
import com.example.exambackend.service.IMedicalRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class MedicalRecordService implements IMedicalRecordService {
    @Autowired
    private IMedicalRecordRepository medicalRecordRepository;

    @Autowired
    private ICodePatientRepository codePatientRepository;

    @Autowired
    private ICodeMedicalRecordRepository codeMedicalRecordRepository;
    @Override

    public Page<MedicalRecord> findAllMedicalRecord(Pageable pageable, String searchName) {
        return medicalRecordRepository.findAllMedicalRecord(pageable, "%" + searchName + "%");
    }

    @Override
    public MedicalRecord save(MedicalRecord medicalRecord) {
        return medicalRecordRepository.saveMedicalRecord(medicalRecord);
    }

    @Override
    public MedicalRecord findById(Integer id) {
        return medicalRecordRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        medicalRecordRepository.deleteById(id);
    }
}
