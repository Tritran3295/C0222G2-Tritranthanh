package service.PositionService;

import model.Position;
import repository.PositionImpl.IPositionRepository;
import repository.PositionImpl.PositionRepositoryImpl;

import java.util.List;

public class PositionServiceImpl implements IPositionService{
    private IPositionRepository iPositionRepository = new PositionRepositoryImpl();
    @Override
    public List<Position> selectAllPosition() {
        List<Position> positionList = iPositionRepository.selectAllPosition();
        return positionList;
    }
}
