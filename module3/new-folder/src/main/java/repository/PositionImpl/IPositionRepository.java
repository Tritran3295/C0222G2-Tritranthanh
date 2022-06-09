package repository.PositionImpl;

import model.Position;

import java.util.List;

public interface IPositionRepository {
    List<Position> selectAllPosition();
}
