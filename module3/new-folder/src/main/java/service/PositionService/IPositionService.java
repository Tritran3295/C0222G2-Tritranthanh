package service.PositionService;

import model.Customer.CustomerType;
import model.Position;

import java.util.List;

public interface IPositionService {
    List<Position> selectAllPosition();
}
