package repository;

import connectDB.ConnectionDB;
import model.FamilyManagement;
import model.MaHoKhau;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FamilyRepositoryImpl implements IFamilyRepository{
    ConnectionDB connectionDB = new ConnectionDB();
    private String SELECT_ALL_FAMILY = "select * from family";
    private String SELECT_ALL_MA_HO_KHAU = "select * from ma_ho_khau";
    private String FIND_BY_STT ="select * from family where id = ?";
    private String UPDATE_FAMILY = "update family set id_ho_khau = ?,ten_chu_ho = ?,so_luong_thanh_vien= ?,ngay_lap_ho_khau = ?, " +
            "dia_chi = ? where id = ?";
    @Override
    public List<FamilyManagement> selectAllFamily() {
        Connection connection = connectionDB.getConnection();
        List<FamilyManagement> familyManagementList = new ArrayList<>();
        try{
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_FAMILY);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int stt = resultSet.getInt("id");
                String maHoKhau = resultSet.getString("id_ho_khau");
                String tenChuHo = resultSet.getString("ten_chu_ho");
                int soLuongThanhVien = resultSet.getInt("so_luong_thanh_vien");
                String ngayLapHoKhau = resultSet.getString("ngay_lap_ho_khau");
                String diaChiNha = resultSet.getString("dia_chi");
                FamilyManagement familyManagement = new FamilyManagement(stt,maHoKhau,tenChuHo,soLuongThanhVien,
                        ngayLapHoKhau,diaChiNha);
                familyManagementList.add(familyManagement);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return familyManagementList;
    }

    @Override
    public List<MaHoKhau> selectAllMaHoKhau() {
        Connection connection = connectionDB.getConnection();
        List<MaHoKhau> maHoKhauList = new ArrayList<>();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_MA_HO_KHAU);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int idHoKhau = resultSet.getInt("id_ho_khau");
                String maHoKhau = resultSet.getString("ten_ho_khau");
                MaHoKhau maHoKhau1 = new MaHoKhau(idHoKhau,maHoKhau);
                maHoKhauList.add(maHoKhau1);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return maHoKhauList;
    }

    @Override
    public FamilyManagement findByStt(int stt) {
        FamilyManagement familyManagement = new FamilyManagement();
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(FIND_BY_STT);
            pr.setInt(1,stt);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int stt1 = resultSet.getInt("id");
                String maHoKhau = resultSet.getString("id_ho_khau");
                String tenChuHo = resultSet.getString("ten_chu_ho");
                int soLuongThanhVien = resultSet.getInt("so_luong_thanh_vien");
                String ngayLapHoKhau = resultSet.getString("ngay_lap_ho_khau");
                String diaChiNha = resultSet.getString("dia_chi");
                familyManagement = new FamilyManagement(stt1,maHoKhau,tenChuHo,soLuongThanhVien,ngayLapHoKhau,diaChiNha);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return familyManagement;
    }

    @Override
    public void update(FamilyManagement familyManagement) {
            Connection connection = connectionDB.getConnection();
            try{
                PreparedStatement pr = connection.prepareStatement(UPDATE_FAMILY);
                pr.setString(1,familyManagement.getMaHoKhau());
                pr.setString(2,familyManagement.getTenChuHo());
                pr.setInt(3,familyManagement.getSoLuongThanhVien());
                pr.setString(4,familyManagement.getNgayLapHoKhau());
                pr.setString(5,familyManagement.getDiaChiNha());
                pr.setInt(6, familyManagement.getStt());
                pr.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
    }
}
