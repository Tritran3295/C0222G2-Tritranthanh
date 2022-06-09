package repository;

import model.CustomerType;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerTypeRepositoryImpl {
    private static final String SELECT_CUSTOMER_TYPE = "select customer_type_name from customer_type where customer_type_id = ?";
    private static final String SELECT_ALL_CUSTOMER_TYPE = "select * from customer_type";
    ConnectionDB baseRepository = new ConnectionDB();

    public CustomerType selectCustomerType(int id) {
        CustomerType customerType = null;

        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_TYPE);) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String name = resultSet.getString("customer_type_name");
                customerType = new CustomerType(id, name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return customerType;
    }

    public List<CustomerType> selectAllCustomerType() throws SQLException{
        List<CustomerType> customerTypeList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER_TYPE);) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer id = resultSet.getInt("customer_type_id");
                String name = resultSet.getString("customer_type_name");
                customerTypeList.add(new CustomerType(id, name));
            }
        }
        return customerTypeList;
    }
}
