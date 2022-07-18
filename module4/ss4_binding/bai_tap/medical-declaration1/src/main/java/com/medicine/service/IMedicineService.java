package com.medicine.service;

import com.medicine.model.MedicineDeclare;

import java.util.List;

public interface IMedicineService {
    void save(MedicineDeclare medicineDeclare);

    List<MedicineDeclare> selectAll();
}
