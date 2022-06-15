package service.RentBuilding;

import model.RentBuilding;
import repository.RentBuilding.IRentBuildingRepository;
import repository.RentBuilding.RentBuildingRepositoryImpl;

import java.util.List;

public class RentBuildingServiceImpl implements IRentBuildingService {
   private IRentBuildingRepository iRentBuildingRepository = new RentBuildingRepositoryImpl();

   @Override
   public void add(RentBuilding rentBuilding) {
      iRentBuildingRepository.createRentBuilding(rentBuilding);
   }

   @Override
   public List<RentBuilding> selectAllRentBuilding() {
      return iRentBuildingRepository.selectAllRentBuilding();
   }
}
