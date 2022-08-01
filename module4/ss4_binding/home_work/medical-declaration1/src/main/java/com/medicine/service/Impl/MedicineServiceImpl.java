package com.medicine.service.Impl;

import com.medicine.model.MedicineDeclare;
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
    public void save(MedicineDeclare medicineDeclare) {
        medicineRepository.save(medicineDeclare);
    }

    @Override
    public List<MedicineDeclare> selectAll() {
        return medicineRepository.selectAll();
    }
}
