package repository.customerType;

import model.customer.customerType.CustomerType;
import repository.connectDB.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl implements ICustomerTypeRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private String SELECT_ALL_CUSTOMERTYPE = "select * from customer_type";

    @Override
    public List<CustomerType> selectAllCustomerType() {
        List<CustomerType> customerTypeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_CUSTOMERTYPE);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_tpye_name");
                CustomerType customerType = new CustomerType(id, name);
                customerTypeList.add(customerType);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerTypeList;
    }
}
