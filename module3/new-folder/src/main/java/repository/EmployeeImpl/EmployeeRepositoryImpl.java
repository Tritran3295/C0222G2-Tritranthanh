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
    private static String SELECT_ALL_EMPLOYEE = "select * from employee";
    private static String INSERT_INTO_EMPLOYEE = "insert into employee( employee_name,employee_birthday,employee_id_card,employee_salary" +
            ",employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id)value(?,?,?,?,?,?,?,?,?,?,?)";

    private static String INSERT_INTOEMPLOYEE1 =
            "insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary,employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id)value(?,?,?,?,?,?,?,?,?,?)";
    private static String UPDATE_EMPLOYEE = "update employee set employee_name = ? ,employee_birthday = ?,employee_id_card = ?,employee_salary =?," +
            "employee_phone = ?,employee_email =?,employee_address=?,position_id = ?,education_degree_id =?,division_id =?";
    private static String SEARCH_EMPLOYEE_BY_ID = "select * from employee where employee_id = ?";
    private static String SEARCH_EMPLOYEE_BY_NAME = "select * from employee where employee_name like ?";
    private static String DELETE_EMPLOYEE = "delete from employee where employee_id = ?;";

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        try (Connection connection = connectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_EMPLOYEE)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
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
                employeeList.add(new Employee(idEmployee, nameEmployee, dayOfBirth, idCardEmployee, salary, phone, email,
                        address, idPosition, idDegreeEducation, idDivision));

            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public void createEmployee(Employee employee) {
        try (Connection connection = connectionDB.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(INSERT_INTOEMPLOYEE1);) {
            preparedStatement.setString(1, employee.getNameEmployee());
            preparedStatement.setString(2, employee.getDayOfBirth());
            preparedStatement.setString(3, employee.getIdCardEmployee());
            preparedStatement.setDouble(4, employee.getSalary());
            preparedStatement.setString(5, employee.getPhone());
            preparedStatement.setString(6, employee.getEmail());
            preparedStatement.setString(7, employee.getAddress());
            preparedStatement.setInt(8, employee.getIdPosition());
            preparedStatement.setInt(9, employee.getIdDegreeEducation());
            preparedStatement.setInt(10, employee.getIdDivision());
            preparedStatement.executeUpdate();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public void update(Employee employee) {
        try (Connection connection = connectionDB.getConnection();
             PreparedStatement pr = connection.prepareStatement("update employee set employee_name = ? ,employee_birthday = ?,employee_id_card = ?,employee_salary =?," +
                     "employee_phone = ?,employee_email =?,employee_address=?,position_id = ?,education_degree_id =?,division_id =?")) {
            pr.setString(1, employee.getNameEmployee());
            pr.setString(2, employee.getDayOfBirth());
            pr.setString(3, employee.getIdCardEmployee());
            pr.setDouble(4, employee.getSalary());
            pr.setString(5, employee.getPhone());
            pr.setString(6, employee.getEmail());
            pr.setString(7, employee.getAddress());
            pr.setInt(8, employee.getIdPosition());
            pr.setInt(9, employee.getIdDegreeEducation());
            pr.setInt(10, employee.getIdDivision());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public Employee searchEmployeeById(Integer idEmployee) {
        Employee employee = null;
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement pr = connection.prepareStatement(SEARCH_EMPLOYEE_BY_ID);){
            pr.setInt(1,idEmployee);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
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
                employee = new Employee(nameEmployee,dayOfBirth,idCardEmployee,salary,phone,email,address,idPosition,
                        idDegreeEducation,idDivision);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employee;
    }

    @Override
    public List<Employee> searchByName(String nameEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement pr = connection.prepareStatement(SEARCH_EMPLOYEE_BY_NAME)) {
            pr.setString(1,'%' + nameEmployee + '%');
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                Integer idEmployee = resultSet.getInt("employee_id");
                String nameEmployee1 = resultSet.getString("employee_name");
                String dayOfBirth = resultSet.getString("employee_birthday");
                String idCardEmployee = resultSet.getString("employee_id_card");
                Double salary = resultSet.getDouble("employee_salary");
                String phone = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                Integer idPosition = Integer.valueOf(resultSet.getString("position_id"));
                Integer idDegreeEducation = Integer.valueOf(resultSet.getString("education_degree_id"));
                Integer idDivision = Integer.valueOf(resultSet.getString("division_id"));
                employeeList.add(new Employee(idEmployee,nameEmployee1,dayOfBirth,idCardEmployee,salary,phone,email,
                        address,idPosition,idDegreeEducation,idDivision));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public boolean deleteEmployee(Integer idEmployee) {
        boolean check = false;
        try(Connection connection = connectionDB.getConnection();
        PreparedStatement pr = connection.prepareStatement(DELETE_EMPLOYEE)) {
            pr.setInt(1,idEmployee);
            check = pr.executeUpdate()>0;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return check;
    }
}
