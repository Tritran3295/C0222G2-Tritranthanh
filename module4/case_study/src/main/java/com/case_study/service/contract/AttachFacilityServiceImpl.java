package com.case_study.service.contract;

import com.case_study.model.contact.AttachFacility;
import com.case_study.repository.contract.IAttachFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachFacilityServiceImpl implements IAttachFacilityService{
    @Autowired
    private IAttachFacilityRepository attachFacilityRepository;

    @Override
    public List<AttachFacility> selectAll() {
        return attachFacilityRepository.findAll();
    }
}
