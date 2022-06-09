package repository.EducationDegreeImpl;

import model.DegreeEducation;
import model.Division;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EducationDegreeImpl implements IEducationDegreeRepository{

    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SELECT_ALL_DEGREE_EDUCATION = "select * from education_degree";

    @Override
    public List<DegreeEducation> selectAllDegreeEducation() {
        List<DegreeEducation> degreeEducationList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_DEGREE_EDUCATION)){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idDegreeEducation = resultSet.getInt(1);
                String nameDegreeEducation = resultSet.getString(2);
                DegreeEducation degreeEducation = new DegreeEducation(idDegreeEducation,nameDegreeEducation);
                degreeEducationList.add(degreeEducation);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return degreeEducationList;

    }

}
