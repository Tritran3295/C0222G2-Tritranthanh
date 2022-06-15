package service.RentBuilding;

import model.RentBuilding;

import java.util.List;

public interface IRentBuildingService {
    void add(RentBuilding rentBuilding);

    List<RentBuilding> selectAllRentBuilding();
}
