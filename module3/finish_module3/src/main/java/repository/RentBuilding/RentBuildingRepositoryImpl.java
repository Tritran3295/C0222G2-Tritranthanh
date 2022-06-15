package repository.RentBuilding;

import model.RentBuilding;
import repository.ConnectDb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RentBuildingRepositoryImpl implements IRentBuildingRepository {
        private ConnectDb connectDb = new ConnectDb();
        private static final String SELECT_ALL_RENTBUILDING = "select * from mat_bang_cho_thue";
        private static final String INSERT_RENTBUILDING ="insert into mat_bang_cho_thue(ma_mat_bang,dien_tich,id_trang_thai, " +
                "tang,id_loai_van_phong,gia_cho_thue,ngay_bat_dau,ngay_ket_thuc)value(?,?,?,?,?,?,?,?)";


    @Override
    public void createRentBuilding(RentBuilding rentBuilding) {
        try(Connection connection = connectDb.getConnection();
            PreparedStatement pr = connection.prepareStatement(INSERT_RENTBUILDING);) {
            pr.setString(1,rentBuilding.getCodeRentBuilding());
            pr.setInt(2,rentBuilding.getStatus());
            pr.setDouble(3,rentBuilding.getSRentBuilding());
            pr.setInt(4,rentBuilding.getFloor());
            pr.setInt(5,rentBuilding.getTypeRoom());
            pr.setDouble(6,rentBuilding.getPrice());
            pr.setString(7,rentBuilding.getDayStart());
            pr.setString(8,rentBuilding.getDayEnd());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public List<RentBuilding> selectAllRentBuilding() {
        List<RentBuilding> rentBuildingList = new ArrayList<>();
        try(Connection connection = connectDb.getConnection();
            PreparedStatement pr = connection.prepareStatement("select * from mat_bang_cho_thue")){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                String codeRentBuilding = resultSet.getString("ma_mat_bang");
                Integer status = resultSet.getInt("id_trang_thai");
                Double SRentBuilding = resultSet.getDouble("dien_tich");
                Integer floor = resultSet.getInt("tang");
                Integer typeRoom = resultSet.getInt("id_loai_van_phong");
                Double price = resultSet.getDouble("gia_cho_thue");
                String dayStart = resultSet.getString("ngay_bat_dau");
                String dayEnd = resultSet.getString("ngay_ket_thuc");
                RentBuilding rentBuilding = new RentBuilding(codeRentBuilding,status,SRentBuilding,floor,
                        typeRoom,price,dayStart,dayEnd);
                rentBuildingList.add(rentBuilding);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return rentBuildingList;
    }
}
