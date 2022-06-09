package repository.PositionImpl;

import model.Customer.CustomerType;
import model.Position;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PositionRepositoryImpl implements IPositionRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SELECT_ALL_POSITION = "select * from position";

    @Override
    public List<Position> selectAllPosition() {
        List<Position> positionList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_POSITION)){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idPosition = resultSet.getInt(1);
                String namePosition = resultSet.getString(2);
                Position position = new Position(idPosition,namePosition);
                positionList.add(position);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return positionList;

    }
}
