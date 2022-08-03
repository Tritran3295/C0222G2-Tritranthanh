package com.case_study.repository.facility;

import com.case_study.model.facility.Facility;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface IFacilityRepository extends JpaRepository<Facility, Integer> {
    @Query(value = "select * from facility where name_facility like :searchName", nativeQuery = true,
            countQuery = "select count(*) from (select * from facility where name_facility like :searchName) temp_table")
    Page<Facility> selectALl(String searchName, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update facility set status = 1 where facility.id = :id", nativeQuery = true)
    void deleteFacility(int id);
}
