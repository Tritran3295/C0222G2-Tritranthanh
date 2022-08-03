package com.case_study.service.facility;

import com.case_study.model.facility.Facility;
import com.case_study.repository.facility.IFacilityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class FacilityServiceImpl implements IFacilityService {
    @Autowired
    private IFacilityRepository facilityRepository;

    @Override
    public Page<Facility> selectAll(String searchName, Pageable pageable) {
        return facilityRepository.selectALl("%" + searchName + "%", pageable);
    }

    @Override
    public void save(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public Facility findById(int id) {
        return facilityRepository.findById(id).orElse(null);
    }

    @Override
    public void update(Facility facility) {
        facilityRepository.save(facility);
    }

    @Override
    public void delete(int id) {
        facilityRepository.deleteFacility(id);
    }
}
