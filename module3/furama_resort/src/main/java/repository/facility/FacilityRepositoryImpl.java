package repository.facility;

import model.facility.Facility;
import model.facilityType.FacilityType;
import model.rentType.RentType;
import repository.connectDB.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FacilityRepositoryImpl implements IFacilityRepository{
    private ConnectionDB connectionDB = new ConnectionDB();
    private String SELECT_FACILITY ="select * from service";
    private String SELECT_RENT_TYPE = "select * from rent_type";
    private String SELECT_FACILITY_TYPE = "select * from service_type";
    private String INSERT_FACILITY = "insert into service(service_name,service_area,service_cost,service_max_people,standard_room, " +
            "description_other_convenience,pool_area,number_of_floors,service_free,rent_type_id,service_type_id) value" +
            "(?,?,?,?,?,?,?,?,?,?,?)";
    @Override
    public List<Facility> selectAllFacility() {
        List<Facility> facilityList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(SELECT_FACILITY);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int idFacility = resultSet.getInt("service_id");
                String nameFacility = resultSet.getString("service_name");
                int area = resultSet.getInt("service_area");
                Double cost = resultSet.getDouble("service_cost");
                int maxPeople = resultSet.getInt("service_max_people");
                String roomStandard = resultSet.getString("standard_room");
                String descriptionOther = resultSet.getString("description_other_convenience");
                Double areaPool = resultSet.getDouble("pool_area");
                int numberFloor = resultSet.getInt("number_of_floors");
                int idRentType = resultSet.getInt("rent_type_id");
                int idTypeService = resultSet.getInt("service_type_id");
                int status = resultSet.getInt("status");
                String facilityFree = resultSet.getString("service_free");
                Facility facility = new Facility(idFacility,nameFacility,area,cost,maxPeople,idRentType,idTypeService,
                        roomStandard,descriptionOther,areaPool,numberFloor,facilityFree,status);
                facilityList.add(facility);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return facilityList;
    }


    @Override
    public List<RentType> selectAllRentType() {
        List<RentType> rentTypeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(SELECT_RENT_TYPE);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int idRentType = resultSet.getInt("rent_type_id");
                String nameRentType = resultSet.getString("rent_type_name");
                int status = resultSet.getInt("status");
                RentType rentType = new RentType(idRentType,nameRentType,status);
                rentTypeList.add(rentType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rentTypeList;
    }

    @Override
    public List<FacilityType> selectAllFacilityType() {
        List<FacilityType> facilityTypeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
            try {
                PreparedStatement pr = connection.prepareStatement(SELECT_FACILITY_TYPE);
                ResultSet resultSet = pr.executeQuery();
                while (resultSet.next()){
                    int idFacilityType = resultSet.getInt("service_type_id");
                    String nameFacilityType = resultSet.getString("service_type_name");
                    int status = resultSet.getInt("status");
                    FacilityType facilityType = new FacilityType(idFacilityType,nameFacilityType,status);
                    facilityTypeList.add(facilityType);
                }
            } catch (SQLException e) {
                e.printStackTrace();
        }
        return facilityTypeList;
    }

    @Override
    public void add(Facility facility) {
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(INSERT_FACILITY);
            pr.setString(1,facility.getNameFacility());
            pr.setInt(2,facility.getArea());
            pr.setDouble(3,facility.getCost());
            pr.setInt(4,facility.getMaxPeople());
            pr.setInt(5,facility.getIdRentType());
            pr.setInt(6,facility.getIdFacilityType());
            pr.setString(7,facility.getStandardRoom());
            pr.setString(8,facility.getDescriptionOtherConvenience());
            pr.setDouble(9,facility.getPoolArea());
            pr.setInt(10,facility.getNumberFloor());
            pr.setString(11,facility.getFacilityFree());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
