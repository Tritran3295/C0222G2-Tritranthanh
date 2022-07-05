package repository.connectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private String jdbcURL = "jdbc:mysql://localhost:3306/db_all_case_study_module3";
    private String jdbcUsername = "root";
    private String jdbcPassword = "laodien123";

    public Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcURL, jdbcUsername,jdbcPassword);
        }catch (SQLException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return connection;
    }
}
