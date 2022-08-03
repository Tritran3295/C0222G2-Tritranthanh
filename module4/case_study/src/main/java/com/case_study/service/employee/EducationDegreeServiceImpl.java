package com.case_study.service.employee;

import com.case_study.model.employee.EducationDegree;
import com.case_study.repository.employee.IEducationDegreeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationDegreeServiceImpl implements IEducationDegreeService{
    @Autowired
    private IEducationDegreeRepository educationDegreeRepository;

    @Override
    public List<EducationDegree> selectAll() {
        return educationDegreeRepository.findAll();
    }
}
