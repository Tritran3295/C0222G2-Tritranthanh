package repository.RentBuilding;

import model.RentBuilding;

import java.util.List;

public interface IRentBuildingRepository {
    void createRentBuilding(RentBuilding rentBuilding);

    List<RentBuilding> selectAllRentBuilding();
}
