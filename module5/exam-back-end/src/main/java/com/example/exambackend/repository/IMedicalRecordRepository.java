package com.example.exambackend.repository;

import com.example.exambackend.model.MedicalRecord;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface IMedicalRecordRepository extends JpaRepository<MedicalRecord, Integer> {
    @Query(value = "select * from medical_record where name like :searchName", nativeQuery = true,
            countQuery = "select count(*) from (select * from medical_record where name like :searchName) temp_table")
    Page<MedicalRecord> findAllMedicalRecord(Pageable pageable, @Param("searchName") String searchName);

    @Modifying
    @Transactional
    @Query(value = "insert into medical_record(date_in,date_out,doctor_treatment,name,reason,treatments,code_medical_record_id,code_patient_id)" +
            "values(:#{#medical_record.date_in},:#{#medical_record.date_out},:#{#medical_record.doctor_treatment},:#{#medical_record.name},:#{#medical_record.reason}," +
            ":#{#medical_record.treatments},:#{#medical_record.code_medical_record_id},:#{#medical_record.code_patient_id});", nativeQuery = true)
    MedicalRecord saveMedicalRecord(MedicalRecord medicalRecord);

    @Query(value = "select medical_record.id,medical_record.date_in,medical_record.date_out,medical_record.doctor_treatment,medical_record.name,medical_record.reason" +
            ",medical_record.treatments,medical_record.code_medical_record_id,medical_record.code_patient_id " +
            "from medical_record where medical_record.id = :id",nativeQuery = true)
    MedicalRecord findByIdMedicalRecord(@Param("id") Integer id);

    @Modifying
    @Transactional
    @Query(value = "update medical_record set date_in = :#{#medical_record.date_in},date_out = :#{#medical_record.date_out},doctor_treatment = :#{#medical_record.doctor_treatment}," +
            "`name` = :#{#medical_record.name},reason = :#{#medical_record.reason},treatments = :#{#medical_record.treatments},code_medical_record_id = :#{#medical_record.code_medical_record_id}" +
            ",code_patient_id = :#{#medical_record.code_patient_id}",nativeQuery = true)
    void editMedicalRecord(MedicalRecord medicalRecord);

}
