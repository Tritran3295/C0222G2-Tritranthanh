package com.case_study.service.facility;

import com.case_study.model.facility.Facility;
import com.case_study.model.facility.FacilityType;
import com.case_study.repository.facility.IFacilityRepository;
import com.case_study.repository.facility.IFacilityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacilityTypeServiceImpl implements IFacilityTypeService{
    @Autowired
    private IFacilityTypeRepository facilityTypeRepository;

    @Override
    public List<FacilityType> selectAll() {
        return facilityTypeRepository.findAll();
    }


}
