package com.case_study.service.facility;

import com.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IFacilityService {
    Page<Facility> selectAll(String searchName, Pageable pageable);

    void save(Facility facility);

    Facility findById(int id);

    void update(Facility facility);

    void delete(int id);

    List<Facility> getAllFacility();
}
