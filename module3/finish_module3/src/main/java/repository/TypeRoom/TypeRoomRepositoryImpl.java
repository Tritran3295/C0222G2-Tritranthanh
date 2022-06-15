package repository.TypeRoom;

import model.TypeRoom;
import repository.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TypeRoomRepositoryImpl implements ITypeRoomRepository{
    ConnectDb connectDb = new ConnectDb();
    private static final String SELECT_ALL_TYPEROOM = "select * from loai_van_phong";
    @Override
    public List<TypeRoom> selectAllTypeRoom() {
        List<TypeRoom> typeRoomList = new ArrayList<>();
        try(Connection connection = connectDb.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_TYPEROOM)) {
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idTypeRoom = resultSet.getInt("id_loai_van_phong");
                String nameTypeRoom = resultSet.getString("name_loai_van_phong");
                TypeRoom typeRoom = new TypeRoom(idTypeRoom,nameTypeRoom);
                typeRoomList.add(typeRoom);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return typeRoomList;
    }
}
