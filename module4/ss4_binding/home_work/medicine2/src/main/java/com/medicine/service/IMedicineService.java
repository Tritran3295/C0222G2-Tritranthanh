package com.medicine.service;

import com.medicine.model.MedicineClare;

import java.util.List;

public interface IMedicineService {

    List<MedicineClare> selectAll(MedicineClare medicineClare);

    void save(MedicineClare medicineClare);

    MedicineClare findById(int id);

    void update(MedicineClare medicineClare);
}
