package repository.EmployeeImpl;

import model.Employee.Employee;
import repository.ConnectionDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    private ConnectionDB connectionDB = new ConnectionDB();
    private static String SELECT_ALL_EMPLOYEE ="select * from employee";
    private static String INSERT_INTO_EMPLOYEE ="insert into employee( employee_name,employee_birthday,employee_id_card,employee_salary"+
            ",employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id)value(?,?,?,?,?,?,?,?,?,?,?)";

    private static String INSERT_INTOEMPLOYEE1 =
            "insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id)value(?,?,?,?,?,?,?,?,?,?)";
    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE)){
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                Integer idEmployee = resultSet.getInt("employee_id");
                String nameEmployee = resultSet.getString("employee_name");
                String dayOfBirth = resultSet.getString("employee_birthday");
                String idCardEmployee = resultSet.getString("employee_id_card");
                Double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                Integer idPosition = Integer.valueOf(resultSet.getString("position_id"));
                Integer idDegreeEducation = Integer.valueOf(resultSet.getString("education_degree_id"));
                Integer idDivision = Integer.valueOf(resultSet.getString("division_id"));
                employeeList.add(new Employee(idEmployee,nameEmployee,dayOfBirth,idCardEmployee,salary,phone,email,
                        address,idPosition,idDegreeEducation,idDivision));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  employeeList;
    }

    @Override
    public void createEmployee(Employee employee) {
        try(Connection connection = connectionDB.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTOEMPLOYEE1);){
            preparedStatement.setString(1,employee.getNameEmployee());
            preparedStatement.setString(2,employee.getDayOfBirth());
            preparedStatement.setString(3,employee.getIdCardEmployee());
            preparedStatement.setDouble(4,employee.getSalary());
            preparedStatement.setString(5,employee.getPhone());
            preparedStatement.setString(6,employee.getEmail());
            preparedStatement.setString(7,employee.getAddress());
            preparedStatement.setInt(8,employee.getIdPosition());
            preparedStatement.setInt(9,employee.getIdDegreeEducation());
            preparedStatement.setInt(10,employee.getIdDivision());
            preparedStatement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
