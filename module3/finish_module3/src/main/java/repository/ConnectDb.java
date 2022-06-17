package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/management_infomartion_build";
    private String jdbcUserName = "root";
    private String jdbcPassword = "laodien123";


    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl, jdbcUserName,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }return connection;
    }
}