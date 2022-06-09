package repository.DivisionImpl;

import model.Customer.CustomerType;
import model.Division;
import model.Position;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DivisionRepositoryImpl implements  IDivisionRepository{
    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SELECT_ALL_DIVISION = "select * from division";

    @Override
    public List<Division> selectAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_DIVISION)){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idDivision = resultSet.getInt(1);
                String nameDivision = resultSet.getString(2);
                Division division = new Division(idDivision,nameDivision);
                divisionList.add(division);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return divisionList;

    }

}
