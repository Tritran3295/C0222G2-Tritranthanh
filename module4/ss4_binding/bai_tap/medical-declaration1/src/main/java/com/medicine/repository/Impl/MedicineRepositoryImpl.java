package com.medicine.repository.Impl;

import com.medicine.model.MedicineDeclare;
import com.medicine.repository.IMedicineRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicineRepositoryImpl implements IMedicineRepository {
    private static List<MedicineDeclare> medicineDeclareList = new ArrayList<>();
    static {
        MedicineDeclare medicineDeclare1 = new MedicineDeclare(1,"TRI","4324","312","123","123","4324","312","123","123","123","123");
        medicineDeclareList.add(medicineDeclare1);
    }
    @Override
    public void save(MedicineDeclare medicineDeclare) {
        medicineDeclareList.add(medicineDeclare);
    }

    @Override
    public List<MedicineDeclare> selectAll() {
        return medicineDeclareList;
    }
}
