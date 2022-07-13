package service.facility;

import model.facility.Facility;
import model.facilityType.FacilityType;
import model.rentType.RentType;
import repository.facility.FacilityRepositoryImpl;
import repository.facility.IFacilityRepository;

import java.util.List;

public class FacilityServiceImpl implements IFacilityService{
    private IFacilityRepository facilityRepository = new FacilityRepositoryImpl();

    @Override
    public List<Facility> selectAllFacility() {
        return facilityRepository.selectAllFacility();
    }

    @Override
    public List<RentType> selectAllRentType() {
        return facilityRepository.selectAllRentType();
    }

    @Override
    public List<FacilityType> selectAllFacilityType() {
        return facilityRepository.selectAllFacilityType();
    }

    @Override
    public void add(Facility facility) {
        facilityRepository.add(facility);
    }
}
