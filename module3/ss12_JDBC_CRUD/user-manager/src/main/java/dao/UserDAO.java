package dao;

import model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements IUserDAO {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
    private String jdbcUsername = "root";
    private String jdbcPassword = "laodien123";
    private Connection connection;
    private static final String INSERT_USERS_SQL = "INSERT INTO users(name,email,country)VALUES(?,?,?);";
    private static final String SELECT_USER_BY_ID = "select id,name,email,country from users where id =?";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String DELETE_USERS_SQL = "delete from users where id=?";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email= ?, country =? where id = ?;";
    private static final String SELECT_USER_BY_COUNTRY = "select id,name,email,country from users where country =?";
    private static final String SORT_BY_NAME = "select * from users oder by name";

    public UserDAO() {
    }

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, jdbcUsername, jdbcPassword);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void insertUser(User user) throws SQLException {
        System.out.println(INSERT_USERS_SQL);
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            printSQLException(e);
        }
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }


    @Override
    public User selectUser(int id) {
        User user = null;
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();
             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID);) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                user = new User(id, name, email, country);
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return user;
    }

    @Override
    public List<User>selectAllUsers() {
        List<User> users = new ArrayList<>();
        // Step 1: Establishing a Connection
        try (Connection connection = getConnection();

             // Step 2:Create a statement using connection object
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS);) {
            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
            ResultSet rs = preparedStatement.executeQuery();

            // Step 4: Process the ResultSet object.
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        } catch (SQLException e) {
            printSQLException(e);
        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
        boolean rowDeleted;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(DELETE_USERS_SQL);) {
            statement.setInt(1, id);
            rowDeleted = statement.executeUpdate() > 0;
        }
        return rowDeleted;
    }

    @Override
    public List<User> searchCountry(String country) throws SQLException {
        List<User> users = new ArrayList<>();
        Connection connection = this.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_COUNTRY);
        try{
            preparedStatement.setString(1,country);
            ResultSet resultSet = preparedStatement.executeQuery();
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String countryRegion = resultSet.getString("country");
                users.add(new User(id,name,email,countryRegion));
            }
        }catch (SQLException e){
            printSQLException(e);
        }return users;

    }

    @Override
    public boolean updateUser(User user) throws SQLException {
        boolean rowUpdated;
        try (Connection connection = getConnection(); PreparedStatement statement = connection.prepareStatement(UPDATE_USERS_SQL);) {
            statement.setString(1, user.getName());
            statement.setString(2, user.getEmail());
            statement.setString(3, user.getCountry());
            statement.setInt(4, user.getId());

            rowUpdated = statement.executeUpdate() > 0;
        }
        return rowUpdated;
    }

    @Override
    public List<User> sortByName(String name) {
        List<User> users = new ArrayList<>();
        Connection connection = getConnection();
        try{
            PreparedStatement preparedStatement = connection.prepareStatement(SORT_BY_NAME);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name1 = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                users.add(new User(id, name, email, country));
            }
        }
        catch (SQLException e) {
            printSQLException(e);
        }
        try {
            connection.close();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return users;
    }

    @Override
    public User getUserById(int id) {
        User user = null;
        String query = "{CALL get_user_by_id()?}";
        try(Connection connection = getConnection();
        CallableStatement callableStatement = connection.prepareCall(query);){
            callableStatement.setInt(1,id);
            ResultSet resultSet = callableStatement.executeQuery();
            while (resultSet.next()){
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id,name,email,country);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return user;
    }

    @Override
    public void insertUserStore(User user) throws SQLException {
        String query = "{CALL insert_user(?,?,?)}";
        try(Connection connection = getConnection();
            CallableStatement callableStatement = connection.prepareCall(query);
        ){
            callableStatement.setString(1,user.getName());
            callableStatement.setString(2,user.getEmail());
            callableStatement.setString(3,user.getCountry());
            System.out.println(callableStatement);
            callableStatement.executeUpdate();
        }catch (SQLException e){
            printSQLException(e);
        }

    }




//    @Override
//    public void insertCustomer(Customer customer) throws SQLException {
//
//        try (Connection connection = baseRepository.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL)) {
//            preparedStatement.setInt(1, customer.getCustomerTypeId().getCustomerTypeId());
//            preparedStatement.setString(2, customer.getCustomerName());
//            preparedStatement.setString(3, customer.getCustomerBirthday());
//            preparedStatement.setInt(4, customer.getCustomerGender());
//            preparedStatement.setString(5, customer.getCustomerIdCard());
//            preparedStatement.setString(6, customer.getCustomerPhone());
//            preparedStatement.setString(7, customer.getCustomerEmail());
//            preparedStatement.setString(8, customer.getCustomerAddress());
//            preparedStatement.setString(9, customer.getCustomerCode());
//            preparedStatement.executeUpdate();
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
//
//    @Override
//    public Customer selectCustomer(int id) {
//        Customer customer = null;
//        try (Connection connection = baseRepository.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID)) {
//            preparedStatement.setInt(1, id);
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()){
//                CustomerType customerTypeId = customerTypeService.selectCustomerType(resultSet.getInt("customer_type_id"));
//                Integer customerId = resultSet.getInt("customer_id");
//                String name = resultSet.getString("customer_name");
//                String dayOfBirth = resultSet.getString("customer_birthday");
//                Integer gender = Integer.valueOf(resultSet.getString("customer_gender"));
//                String idCard = resultSet.getString("customer_id_card");
//                String phone = resultSet.getString("customer_phone");
//                String email = resultSet.getString("customer_email");
//                String address = resultSet.getString("customer_address");
//                String cusCode = resultSet.getString("customer_code");
//                customer = new Customer(customerId,customerTypeId, name, dayOfBirth, gender, idCard, phone, email, address, cusCode);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customer;
//    }
//
//    @Override
//    public List<Customer> selectAllCustomer() {
//        List<Customer> customerList = new ArrayList<>();
//        try (Connection connection = baseRepository.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER)) {
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Integer id = resultSet.getInt("customer_id");
//                CustomerType customerTypeId = customerTypeService.selectCustomerType(resultSet.getInt("customer_type_id"));
//                String name = resultSet.getString("customer_name");
//                String dayOfBirth = resultSet.getString("customer_birthday");
//                Integer gender = Integer.valueOf(resultSet.getString("customer_gender"));
//                String idCard = resultSet.getString("customer_id_card");
//                String phone = resultSet.getString("customer_phone");
//                String email = resultSet.getString("customer_email");
//                String address = resultSet.getString("customer_address");
//                String cusCode = resultSet.getString("customer_code");
//                customerList.add(new Customer(id, customerTypeId, name, dayOfBirth, gender, idCard, phone, email, address, cusCode));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customerList;
//    }
//
//    @Override
//    public boolean deleteCustomer(int id) throws SQLException {
//        boolean check = false;
//        try(Connection connection = baseRepository.getConnection();
//            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);) {
//            preparedStatement.setInt(1, id);
//            check = preparedStatement.executeUpdate() > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return check;
//    }
//
//    @Override
//    public boolean updateCustomer(Customer customer) throws SQLException {
//        boolean check = false;
//        try (Connection connection = baseRepository.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_CUSTOMER);) {
//            preparedStatement.setInt(1, customer.getCustomerTypeId().getCustomerTypeId());
//            preparedStatement.setString(2, customer.getCustomerName());
//            preparedStatement.setString(3, customer.getCustomerBirthday());
//            preparedStatement.setInt(4, customer.getCustomerGender());
//            preparedStatement.setString(5, customer.getCustomerIdCard());
//            preparedStatement.setString(6, customer.getCustomerPhone());
//            preparedStatement.setString(7, customer.getCustomerEmail());
//            preparedStatement.setString(8, customer.getCustomerAddress());
//            preparedStatement.setString(9, customer.getCustomerCode());
//            preparedStatement.setInt(10, customer.getCustomerId());
//            check = preparedStatement.executeUpdate() > 0;
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return check;
//    }
//
//    @Override
//    public List<Customer> searchByName(String name) {
//        List<Customer> customerList = new ArrayList<>();
//        try( Connection connection = baseRepository.getConnection();
//             PreparedStatement preparedStatement = connection.prepareStatement(SEARCH_BY_NAME_CUSTOMER);) {
//            preparedStatement.setString(1, "%"+name+"%");
//            ResultSet resultSet = preparedStatement.executeQuery();
//            while (resultSet.next()) {
//                Integer id = resultSet.getInt("customer_id");
//                CustomerType customerTypeId = customerTypeService.selectCustomerType(resultSet.getInt("customer_type_id"));
//                String namee = resultSet.getString("customer_name");
//                String dayOfBirth = resultSet.getString("customer_birthday");
//                Integer gender = Integer.valueOf(resultSet.getString("customer_gender"));
//                String idCard = resultSet.getString("customer_id_card");
//                String phone = resultSet.getString("customer_phone");
//                String email = resultSet.getString("customer_email");
//                String address = resultSet.getString("customer_address");
//                String cusCode = resultSet.getString("customer_code");;
//                customerList.add(new Customer(id,customerTypeId,namee,dayOfBirth,gender,idCard,phone,email,address,cusCode));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return customerList;
//    }


}
