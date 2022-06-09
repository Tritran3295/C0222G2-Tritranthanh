package repository.CustomerImpl;

import model.Customer.CustomerType;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements ICustomerTypeRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private static final String SELECT_CUSTOMER_TYPE = "select * from customer_type";


    @Override
    public List<CustomerType> selectAllCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_CUSTOMER_TYPE)){
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idCustomerType = resultSet.getInt(1);
                String nameCustomerType = resultSet.getString(2);
                CustomerType customerType = new CustomerType(idCustomerType,nameCustomerType);
                customerTypeList.add(customerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerTypeList;
    }
}
