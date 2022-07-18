package com.medicine.repository;

import com.medicine.model.MedicineClare;

import java.util.List;

public interface IMedicineRepository {
    List<MedicineClare> selectAll(MedicineClare medicineClare);

    void save(MedicineClare medicineClare);

    MedicineClare findById(int id);

    void update(MedicineClare medicineClare);
}
