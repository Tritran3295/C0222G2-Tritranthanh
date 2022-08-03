package com.case_study.service.facility;

import com.case_study.model.facility.RentType;
import com.case_study.repository.facility.IRentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentTypeServiceImpl implements IRentTypeService{
    @Autowired
    private IRentTypeRepository rentTypeRepository;

    @Override
    public List<RentType> selectAll() {
        return rentTypeRepository.findAll();
    }
}
