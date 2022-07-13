package service;

import model.FamilyManagement;
import model.MaHoKhau;
import repository.FamilyRepositoryImpl;
import repository.IFamilyRepository;

import java.util.List;

public class FamilyServiceImpl implements IFamilyService{
    private IFamilyRepository iFamilyRepository = new FamilyRepositoryImpl();

    @Override
    public List<FamilyManagement> selectAllFamily() {
        return iFamilyRepository.selectAllFamily();
    }

    @Override
    public List<MaHoKhau> selectAllMaHoKhau() {
        return iFamilyRepository.selectAllMaHoKhau();
    }

    @Override
    public FamilyManagement findByStt(int stt) {
        return iFamilyRepository.findByStt(stt);
    }

    @Override
    public void update(FamilyManagement familyManagement) {
        iFamilyRepository.update(familyManagement);
    }
}
