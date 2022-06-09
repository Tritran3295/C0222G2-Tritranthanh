package repository;

import model.Customer;
import model.CustomerType;
import service.CustomerServiceImpl;
import service.CustomerTypeService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private CustomerTypeService customerTypeService = new CustomerTypeService();
    protected ConnectionDB connectionDB = new ConnectionDB();
    private String SHOW_ALL_CUSTOMER = "select * from customer;";
    private String CREATE_CUSTOMER = " insert into customer(customer_id,customer_name,customer_birthday," +
            "customer_gender,customer_id_card, customer_phone, customer_email, customer_address,customer_type_id )" +
            "value(?,?,?,?,?,?,?,?,?)";



    @Override
    public void createCustomer(Customer customer) throws SQLException {

        try (Connection connection = connectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(CREATE_CUSTOMER)) {
            preparedStatement.setInt(1,customer.getIdCustomer());
            preparedStatement.setString(2, customer.getNameCustomer());
            preparedStatement.setString(3, customer.getDateOfBirth());
            preparedStatement.setInt(4, customer.getGender());
            preparedStatement.setString(5, customer.getIdCardCustomer());
            preparedStatement.setString(6, customer.getPhone());
            preparedStatement.setString(7, customer.getEmail());
            preparedStatement.setString(8, customer.getAddress());
            preparedStatement.setString(9, customer.getIdTypeCustomer());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    @Override
    public Customer selectCustomer(int id) {
        return null;
    }



    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try (Connection connection = connectionDB.getConnection();
             PreparedStatement pr = connection.prepareStatement(SHOW_ALL_CUSTOMER)) {
            {
                ResultSet resultSet = pr.executeQuery();
                while (resultSet.next()){
                    Integer idCustomer = resultSet.getInt("customer_id");
                    String nameCustomer = resultSet.getString("customer_name");
                    String dateOfBirth = resultSet.getString("customer_birthday");
                    Integer gender = resultSet.getInt("customer_gender");
                    String idCardNumber = resultSet.getString("customer_id_card");
                    String phone = resultSet.getString("customer_phone");
                    String email = resultSet.getString("customer_email");
                    String address = resultSet.getString("customer_address");
                    CustomerType idTypeCustomer = customerTypeService.selectCustomerType(resultSet.getInt("customer_type_id"));
                    customerList.add(new Customer(idCustomer,nameCustomer,dateOfBirth,gender,idCardNumber,phone,email,address,idTypeCustomer));

                }
            }
        } catch (SQLException throwAbles) {
            throwAbles.printStackTrace();
        }

        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        return false;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        return false;
    }

    @Override
    public List<Customer> searchByName(String name) {
        return null;
    }
}
