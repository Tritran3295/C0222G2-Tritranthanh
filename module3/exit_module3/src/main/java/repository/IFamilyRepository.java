package repository;

import model.FamilyManagement;
import model.MaHoKhau;

import java.util.List;

public interface IFamilyRepository {
    List<FamilyManagement> selectAllFamily();

    List<MaHoKhau> selectAllMaHoKhau();

    FamilyManagement findByStt(int stt);

    void update(FamilyManagement familyManagement);
}
