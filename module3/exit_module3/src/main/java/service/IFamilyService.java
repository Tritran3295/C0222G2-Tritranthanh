package service;

import model.FamilyManagement;
import model.MaHoKhau;

import java.util.List;

public interface IFamilyService {
    List<FamilyManagement> selectAllFamily();

    List<MaHoKhau> selectAllMaHoKhau();

    FamilyManagement findByStt(int stt);

    void update(FamilyManagement familyManagement);
}
