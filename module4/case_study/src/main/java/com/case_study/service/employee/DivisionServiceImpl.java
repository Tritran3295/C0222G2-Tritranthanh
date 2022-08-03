package com.case_study.service.employee;

import com.case_study.model.employee.Division;
import com.case_study.repository.employee.IDivisionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DivisionServiceImpl implements IDivisionService{
    @Autowired
    private IDivisionRepository divisionRepository;

    @Override
    public List<Division> selectAll() {
        return divisionRepository.findAll();
    }
}
