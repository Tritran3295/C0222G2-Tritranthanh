package repository.CustomerImpl;

import model.Customer.Customer;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerRepositoryImpl implements ICustomerRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private static String INSERT_CUSTOMER_SQL="insert into customer(customer_name,customer_birthday,customer_gender" +
            ",customer_id_card,customer_phone,customer_email,customer_address,customer_type_id)value(?,?,?,?,?,?,?,?)";
    private static String SELECT_ALL_CUSTOMER ="select * from customer";
    private static String UPDATE_CUSTOMER = "update customer set customer_name = ?,customer_birthday = ? " +
            " customer_gender = ?,customer_id_card = ?,customer_phone = ?,customer_email = ?,customer_address =? " +
            " customer_type_id = ? where customer_id = ? ";
    private static final String SEARCH_CUSTOMER_BY_ID ="select * from customer where customer_id = ?";
    private static final String SEARCH_CUSTOMER_BY_NAME ="select * from customer where customer_name like ?";
    private static final String DELETE_CUSTOMER_BY_ID ="delete from customer where customer_id = ?";

    @Override
    public void createCustomer(Customer customer) {

        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(INSERT_CUSTOMER_SQL)){
            pr.setString(1,customer.getNameCustomer());
            pr.setString(2,customer.getBirthday());
            pr.setInt(3,customer.getGender());
            pr.setString(4,customer.getIdCard());
            pr.setString(5,customer.getPhone());
            pr.setString(6,customer.getEmail());
            pr.setString(7,customer.getAddress());
            pr.setInt(8,customer.getIdTypeCustomer());
            pr.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }

    }

    @Override
    public List<Customer> selectAllCustomer() {
        List<Customer> customerList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement(SELECT_ALL_CUSTOMER)) {
            ResultSet resultSet = pr.executeQuery();
            while(resultSet.next()){
                Integer idCustomer = resultSet.getInt("customer_id");
                String nameCustomer = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_birthday");
                Integer gender = resultSet.getInt("customer_gender");
                String idCardNumber = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                Integer idTypeCustomer = resultSet.getInt("customer_type_id");
                customerList.add(new Customer(idCustomer,nameCustomer,dateOfBirth,gender,idCardNumber,phone,email,address,idTypeCustomer));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customerList;
    }

    @Override
    public boolean deleteCustomer(int idCustomer) {
        boolean check = false;
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER_BY_ID);) {
            preparedStatement.setInt(1,idCustomer);
            check =preparedStatement.executeUpdate() > 0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }

    @Override
    public void update(Customer customer) {
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement pr = connection.prepareStatement("update customer set customer_name = ?,customer_birthday = ?, " +
                    " customer_gender = ?,customer_id_card = ?,customer_phone = ?,customer_email = ?,customer_address =?, " +
                    " customer_type_id = ? where customer_id = ? ")){
            pr.setString(1,customer.getNameCustomer());
            pr.setString(2,customer.getBirthday());
            pr.setInt(3,customer.getGender());
            pr.setString(4,customer.getIdCard());
            pr.setString(5,customer.getPhone());
            pr.setString(6,customer.getEmail());
            pr.setString(7,customer.getAddress());
            pr.setInt(8,customer.getIdTypeCustomer());
            pr.setInt(9,customer.getIdCustomer());
            pr.executeUpdate();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Customer searchById(Integer idCustomer) {
        Customer customer = null;
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement pr = connection.prepareStatement(" select * from customer where customer_id = ? ")){
           pr.setInt(1,idCustomer);
           ResultSet resultSet = pr.executeQuery();
           while (resultSet.next()){
               String nameCustomer = resultSet.getString("customer_name");
               String dateOfBirth = resultSet.getString("customer_birthday");
               Integer gender = resultSet.getInt("customer_gender");
               String idCardNumber = resultSet.getString("customer_id_card");
               String phone = resultSet.getString("customer_phone");
               String email = resultSet.getString("customer_email");
               String address = resultSet.getString("customer_address");
               Integer idTypeCustomer = resultSet.getInt("customer_type_id");
               customer = new Customer(nameCustomer,dateOfBirth,gender,idCardNumber,phone,email,address,idTypeCustomer);
           }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return customer;
    }

    @Override
    public List<Customer> searchByName(String nameCustomer) {
       List<Customer> customerList = new ArrayList<>();
       try(Connection connection = connectionDB.getConnection();){
           PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_CUSTOMER_BY_NAME);
            preparedStatement.setString(1,'%' + nameCustomer + '%');
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Integer idCustomer = resultSet.getInt("Customer_id");
                String nameCustomer1 = resultSet.getString("customer_name");
                String dateOfBirth = resultSet.getString("customer_birthday");
                Integer gender = resultSet.getInt("customer_gender");
                String idCardNumber = resultSet.getString("customer_id_card");
                String phone = resultSet.getString("customer_phone");
                String email = resultSet.getString("customer_email");
                String address = resultSet.getString("customer_address");
                Integer idTypeCustomer = resultSet.getInt("customer_type_id");
                customerList.add(new Customer(idCustomer, nameCustomer1, dateOfBirth, gender, idCardNumber, phone, email, address, idTypeCustomer));
            }
       } catch (Exception e) {
           e.printStackTrace();
       }
    return  customerList;
    }
}
