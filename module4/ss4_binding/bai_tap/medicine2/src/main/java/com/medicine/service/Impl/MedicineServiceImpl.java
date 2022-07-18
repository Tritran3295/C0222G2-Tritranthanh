package com.medicine.service.Impl;

import com.medicine.model.MedicineClare;
import com.medicine.repository.IMedicineRepository;
import com.medicine.service.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicineServiceImpl implements IMedicineService {
    @Autowired
    private IMedicineRepository medicineRepository;

    @Override
    public List<MedicineClare> selectAll(MedicineClare medicineClare) {
        return medicineRepository.selectAll(medicineClare);

    }

    @Override
    public void save(MedicineClare medicineClare) {
        medicineRepository.save(medicineClare);
    }

    @Override
    public MedicineClare findById(int id) {
        return medicineRepository.findById(id);
    }

    @Override
    public void update(MedicineClare medicineClare) {
        medicineRepository.update(medicineClare);
    }
}
