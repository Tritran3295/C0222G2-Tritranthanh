package repository.ServiceRepository;

import model.Position;
import model.Service;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceRepositoryImpl implements IServiceRepository{

    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SELECT_ALL_SERVICE = "select * from service";
    private static final String INSERT_INTO_SERVICE = "insert into service(service_name,service_area,service_cost, " +
            "service_max_people,standard_room,description_other_convenience,pool_area,number_of_floors,rent_type_id, " +
            "service_type_id)value(?,?,?,?,?,?,?,?,?,?)";

    @Override
    public List<Service> selectAllService() {
        List<Service> serviceList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_SERVICE)){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idService = resultSet.getInt(1);
                String nameService = resultSet.getString(2);
                Double areaService = resultSet.getDouble(3);
                Double costService = resultSet.getDouble(4);
                Integer maxPeopleService = resultSet.getInt(5);
                String standardRoom = resultSet.getString(6);
                String descriptionOtherConvenience = resultSet.getString(7);
                Double areaPool = resultSet.getDouble(8);
                Integer numberOfFloor = resultSet.getInt(9);
                Integer idTypeRent = resultSet.getInt(10);
                Integer idTypeService = resultSet.getInt(11);
                serviceList.add(new Service(idService,nameService,areaService,costService,maxPeopleService,standardRoom,
                        descriptionOtherConvenience,areaPool,numberOfFloor,idTypeRent,idTypeService));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return serviceList;

    }

    @Override
    public void createsService(Service service)  {
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement pr = connection.prepareStatement(INSERT_INTO_SERVICE)){
            pr.setString(1,service.getNameService());
            pr.setDouble(2,service.getAreaService());
            pr.setDouble(3,service.getCostService());
            pr.setInt(4,service.getMaxPeopleService());
            pr.setString(5,service.getStandardRoom());
            pr.setString(6,service.getDescriptionOtherConvenience());
            pr.setDouble(7,service.getAreaPool());
            pr.setInt(8,service.getNumberOfFloor());
            pr.setInt(9,service.getIdTypeRent());
            pr.setInt(10,service.getIdTypeService());
            pr.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
