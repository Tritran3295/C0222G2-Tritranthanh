package repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BaseProductRepository {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/miumiushop";
    private String jdbcProductName = "root";
    private String jdbcPassword = "laodien123";

    protected Connection getConnection(){
        Connection connection = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(jdbcUrl,jdbcProductName,jdbcPassword);
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }return connection;
    }
}
