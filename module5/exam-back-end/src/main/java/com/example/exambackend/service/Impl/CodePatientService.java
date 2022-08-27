package com.example.exambackend.service.Impl;

import com.example.exambackend.model.CodePatient;
import com.example.exambackend.repository.ICodePatientRepository;
import com.example.exambackend.service.ICodePatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CodePatientService implements ICodePatientService {
    @Autowired
    private ICodePatientRepository codePatientRepository;
    @Override
    public List<CodePatient> findAll() {
        return codePatientRepository.selectAll();
    }
}
