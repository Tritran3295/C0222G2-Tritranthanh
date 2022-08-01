package com.medicine.repository;

import com.medicine.model.MedicineDeclare;

import java.util.List;

public interface IMedicineRepository {
    void save(MedicineDeclare medicineDeclare);

    List<MedicineDeclare> selectAll();
}
