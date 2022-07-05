package repository.customer;

import model.customer.customer.Customer;
import repository.connectDB.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository{
    private ConnectionDB connectionDB = new ConnectionDB();
    private String SELECT_ALL_CUSTOMER = "select * from customer;";
    private String INSERT_CUSTOMER = "insert into customer(customer_name,customer_birthday,customer_gender, " +
            "customer_id_card,customer_phone,customer_email,customer_address,customer_type_id) " +
            "value(?,?,?,?,?,?,?,?)";
    private String FIND_BY_ID = "select * from customer where customer_id = ?";
    private String UPDATE_CUSTOMER = "update customer set customer_name = ?,customer_birthday = ?,customer_gender = ?, " +
            "customer_id_card = ?,customer_phone = ?,customer_email = ?,customer_address = ?,customer_type_id = ?, " +
            "status = ? where customer_id = ?";
    private String DELETE_CUSTOMER = " update customer set status = 1 where customer_id = ?";
    private String SEARCH_BY_NAME = "select * from customer where customer_name like ?";

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer>customerList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_CUSTOMER);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int idCustomer = resultSet.getInt("customer_id");
                String nameCustomer = resultSet.getString("customer_name");
                String dayOfBirth = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phoneNumber = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int idCustomerType = resultSet.getInt("customer_type_id");
                int status = resultSet.getInt("status");
                Customer customer = new Customer(idCustomer,nameCustomer,dayOfBirth,gender,idCard,phoneNumber,email,
                        address,idCustomerType,status);
                customerList.add(customer);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void add(Customer customer) {
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(INSERT_CUSTOMER);
            pr.setString(1,customer.getNameCustomer());
            pr.setString(2,customer.getDayOfBirth());
            pr.setInt(3,customer.getGender());
            pr.setString(4,customer.getIdCard());
            pr.setString(5,customer.getPhoneNumber());
            pr.setString(6,customer.getEmail());
            pr.setString(7,customer.getAddress());
            pr.setInt(8,customer.getIdCustomerType());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Customer findById(int idCustomer) {
        Customer customer = new Customer();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(FIND_BY_ID);
            pr.setInt(1,idCustomer);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phoneNumber = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int idCustomerType = resultSet.getInt("customer_type_id");
                customer = new Customer(id,name,dateOfBirth,gender,idCard,phoneNumber,email,address,idCustomerType);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return customer;
    }

    @Override
    public void update(Customer customer) {
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(UPDATE_CUSTOMER);
            pr.setString(1,customer.getNameCustomer());
            pr.setString(2,customer.getDayOfBirth());
            pr.setInt(3,customer.getGender());
            pr.setString(4,customer.getIdCard());
            pr.setString(5,customer.getPhoneNumber());
            pr.setString(6,customer.getEmail());
            pr.setString(7,customer.getAddress());
            pr.setInt(8,customer.getIdCustomerType());
            pr.setInt(9,customer.getStatus());
            pr.setInt(10,customer.getIdCustomer());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public void deleteCustomer(int idCustomer) {
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(DELETE_CUSTOMER);
            pr.setInt(1,idCustomer);
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByName(String nameCustomer) {
        List<Customer> customerList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr =connection.prepareStatement(SEARCH_BY_NAME);
            pr.setString(1,"%" + nameCustomer + "%");
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("customer_id");
                String name = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_birthday");
                int gender = resultSet.getInt("customer_gender");
                String idCard = resultSet.getString("customer_id_card");
                String phoneNumber = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                int idCustomerType = resultSet.getInt("customer_type_id");
                int status = resultSet.getInt("status");
                Customer customer = new Customer(id,name,dateOfBirth,gender,idCard,phoneNumber,email,address,idCustomerType,status);
                customerList.add(customer);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

}
