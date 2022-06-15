package repository.Status;

import model.Status;
import repository.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StatusRepositoryImpl implements IStatusRepository {
    ConnectDb connectDb = new ConnectDb();
    private static final String SELECT_ALL_STATUS = "select * from trang_thai";

    @Override
    public List<Status> selectAllStatus() {
        List<Status> statusList = new ArrayList<>();
        try (Connection connection = connectDb.getConnection();
             PreparedStatement pr = connection.prepareStatement(SELECT_ALL_STATUS)) {
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                Integer idStatus = resultSet.getInt("id_trang_thai");
                String nameStatus = resultSet.getString("name_trang_thai");
                Status status = new Status(idStatus, nameStatus);
                statusList.add(status);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return statusList;
    }
}