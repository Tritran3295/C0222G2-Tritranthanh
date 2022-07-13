package service.facility;

import model.facility.Facility;
import model.facilityType.FacilityType;
import model.rentType.RentType;

import java.util.List;

public interface IFacilityService {
    List<Facility> selectAllFacility();

    List<RentType> selectAllRentType();

    List<FacilityType> selectAllFacilityType();

    void add(Facility facility);
}
