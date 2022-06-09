package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {

    private String jdbcUrl = "jdbc:mysql://localhost:3306/db_all_case_study_module3";
    private String jdbcCustomerName = "root";
    private String jdbcPassword = "laodien123";

    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl,jdbcCustomerName,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }return connection;
    }

}
