package com.medicine.repository.Impl;

import com.medicine.model.MedicineClare;
import com.medicine.repository.IMedicineRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MedicineRepositoryImpl implements IMedicineRepository {
    private static List<MedicineClare> medicineClareList = new ArrayList<>();

    static {
        MedicineClare medicineClare1 = new MedicineClare(1, "TRI", "1998", "Tàu bay", "07/08/2022", "12/08/2022", "du lịch");
        MedicineClare medicineClare2 = new MedicineClare(1, "TRI", "1998", "Ô tô", "07/08/2022", "12/08/2022", "nghĩ dưỡng");
        medicineClareList.add(medicineClare1);
        medicineClareList.add(medicineClare2);
    }

    @Override
    public List<MedicineClare> selectAll(MedicineClare medicineClare) {
        return medicineClareList;
    }

    @Override
    public void save(MedicineClare medicineClare) {
        medicineClareList.add(medicineClare);
    }

    @Override
    public MedicineClare findById(int id) {
        for (MedicineClare medicineClare1 : medicineClareList) {
            if (medicineClare1.getId() == id) {
                return medicineClare1;
            }
        }
        return null;
    }

    @Override
    public void update(MedicineClare medicineClare) {
        for (MedicineClare me : medicineClareList) {
            if (me.getId() == medicineClare.getId()) {
                me.setName(medicineClare.getName());
                me.setYearOfBirth(medicineClare.getYearOfBirth());
                me.setVehicle(medicineClare.getVehicle());
                me.setDayStart(medicineClare.getDayStart());
                me.setDayEnd(medicineClare.getDayEnd());
                me.setActivity14Day(medicineClare.getActivity14Day());
                break;
            }
        }
    }
}
