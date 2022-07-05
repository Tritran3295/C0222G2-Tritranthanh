package repository.employee.Impl;

import model.employee.division.Division;
import model.employee.educationDegree.EducationDegree;
import model.employee.employee.Employee;
import model.employee.position.Position;
import model.employee.user.User;
import repository.connectDB.ConnectionDB;
import repository.employee.Interface.IEmployeeRepository;

import javax.jws.soap.SOAPBinding;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepositoryImpl implements IEmployeeRepository {
    ConnectionDB connectionDB = new ConnectionDB();
    private final String SELECT_POSITION = "select * from position";
    private String SELECT_EDUCATION_DEGREE = "select * from education_degree";
    private String SELECT_DIVISION = "select * from division";
    private String SELECT_EMPLOYEE = "select * from employee";
    private String SELECT_USER = "select * from user";
    private String INSERT_EMPLOYEE = "insert into employee(employee_name,employee_birthday,employee_id_card,employee_salary, " +
            "employee_phone,employee_email,employee_address,position_id,education_degree_id,division_id) value(?,?,?,?,?,?,?,?,?,?)";
    private String FIND_BY_ID = "select * from employee where employee_id = ?";
    private String UPDATE_EMPLOYEE = "update employee set employee_name = ?,employee_birthday = ?,employee_id_card = ?, " +
            "employee_salary = ?,employee_phone = ?,employee_email = ?,employee_address = ?,position_id = ?, " +
            "education_degree_id = ?,division_id = ?,status = ? where employee_id = ?";
    private String DELETE_EMPLOYEE = "update employee set status = 1 where employee_id = ?";
    private String FIND_EMPLOYEE_BY_NAME = "select * from employee where employee_name like ?";

    @Override
    public List<Position> selectAllPosition() {
        List<Position> positionList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_POSITION);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int idPosition = resultSet.getInt("position_id");
                String namePosition = resultSet.getString("position_name");
                int status = resultSet.getInt("status");
                Position position = new Position(idPosition, namePosition, status);
                positionList.add(position);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return positionList;
    }

    @Override
    public List<EducationDegree> selectAllEducationDegree() {
        List<EducationDegree> educationDegreeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_EDUCATION_DEGREE);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int idEducationDegree = resultSet.getInt("education_degree_id");
                String nameED = resultSet.getString("education_degree_name");
                int status = resultSet.getInt("status");
                EducationDegree educationDegree = new EducationDegree(idEducationDegree, nameED, status);
                educationDegreeList.add(educationDegree);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return educationDegreeList;
    }

    @Override
    public List<Division> selectAllDivision() {
        List<Division> divisionList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_DIVISION);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int idDivision = resultSet.getInt("division_id");
                String nameDivision = resultSet.getString("division_name");
                int status = resultSet.getInt("status");
                Division division = new Division(idDivision, nameDivision, status);
                divisionList.add(division);

            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return divisionList;
    }

    @Override
    public List<Employee> selectAllEmployee() {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_EMPLOYEE);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                int idEmployee = resultSet.getInt("employee_id");
                String nameEmployee = resultSet.getString("employee_name");
                String dateOfBirth = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                Double salary = Double.valueOf(resultSet.getString("employee_salary"));
                String phoneNumber = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int idPosition = resultSet.getInt("position_id");
                int idEducationDegree = resultSet.getInt("education_degree_id");
                int idDivision = resultSet.getInt("division_id");
//                String userName = resultSet.getString("user_name");
                int status = resultSet.getInt("status");
                Employee employee = new Employee(idEmployee, nameEmployee, dateOfBirth, idCard, salary, phoneNumber,
                        email, address, idPosition, idEducationDegree, idDivision, status);
                employeeList.add(employee);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return employeeList;
    }

    @Override
    public List<User> selectAllUser() {
        List<User> userList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(SELECT_USER);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()) {
                String userName = resultSet.getString("user_name");
                String password = resultSet.getString("password");
                int status = resultSet.getInt("status");
                User user = new User(userName, password, status);
                userList.add(user);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return userList;
    }

    @Override
    public void add(Employee employee) {
        Connection connection = connectionDB.getConnection();
        try {
            PreparedStatement pr = connection.prepareStatement(INSERT_EMPLOYEE);
            pr.setString(1, employee.getNameEmployee());
            pr.setString(2, employee.getDateOfBirth());
            pr.setString(3, employee.getIdCard());
            pr.setDouble(4, employee.getSalary());
            pr.setString(5, employee.getPhoneNumber());
            pr.setString(6, employee.getEmail());
            pr.setString(7, employee.getAddress());
            pr.setInt(8, employee.getIdPosition());
            pr.setInt(9, employee.getIdEducationDegree());
            pr.setInt(10, employee.getIdDivision());
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public Employee findById(int idEmployee) {
        Employee employee = new Employee();
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(FIND_BY_ID);
            pr.setInt(1,idEmployee);
            ResultSet resultSet = pr.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt("employee_id");
                String nameEmployee = resultSet.getString("employee_name");
                String dateOfBirth = resultSet.getString("employee_birthday");
                String idCard = resultSet.getString("employee_id_card");
                Double salary = Double.valueOf(resultSet.getString("employee_salary"));
                String phoneNumber = resultSet.getString("employee_phone");
                String email = resultSet.getString("employee_email");
                String address = resultSet.getString("employee_address");
                int idPosition = resultSet.getInt("position_id");
                int idEducationDegree = resultSet.getInt("education_degree_id");
                int idDivision = resultSet.getInt("division_id");
                int status = resultSet.getInt("status");
                employee = new Employee(id,nameEmployee,dateOfBirth,idCard,salary,phoneNumber,email,address,idPosition,
                        idEducationDegree,idDivision,status);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return employee;
    }

    @Override
    public void update(Employee employee) {
        Connection connection = connectionDB.getConnection();
            try {
                PreparedStatement pr = connection.prepareStatement(UPDATE_EMPLOYEE);
                pr.setString(1, employee.getNameEmployee());
                pr.setString(2, employee.getDateOfBirth());
                pr.setString(3, employee.getIdCard());
                pr.setDouble(4, employee.getSalary());
                pr.setString(5, employee.getPhoneNumber());
                pr.setString(6, employee.getEmail());
                pr.setString(7, employee.getAddress());
                pr.setInt(8, employee.getIdPosition());
                pr.setInt(9, employee.getIdEducationDegree());
                pr.setInt(10, employee.getIdDivision());
                pr.setInt(11,employee.getStatus());
                pr.setInt(12,employee.getIdEmployee());
                pr.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
    }

    @Override
    public void deleteEmployee(int idEmployee) {
        Connection connection = connectionDB.getConnection();
        try{
            PreparedStatement pr = connection.prepareStatement(DELETE_EMPLOYEE);
            pr.setInt(1,idEmployee);
            pr.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public List<Employee> findByName(String nameEmployee) {
        List<Employee> employeeList = new ArrayList<>();
        Connection connection = connectionDB.getConnection();

            try {
                PreparedStatement pr = connection.prepareStatement(FIND_EMPLOYEE_BY_NAME);
                pr.setString(1,"%" + nameEmployee + "%");
                ResultSet resultSet = pr.executeQuery();
                while (resultSet.next()){
                    int id = resultSet.getInt("employee_id");
                    String nameEmployee1 = resultSet.getString("employee_name");
                    String dateOfBirth = resultSet.getString("employee_birthday");
                    String idCard = resultSet.getString("employee_id_card");
                    Double salary = Double.valueOf(resultSet.getString("employee_salary"));
                    String phoneNumber = resultSet.getString("employee_phone");
                    String email = resultSet.getString("employee_email");
                    String address = resultSet.getString("employee_address");
                    int idPosition = resultSet.getInt("position_id");
                    int idEducationDegree = resultSet.getInt("education_degree_id");
                    int idDivision = resultSet.getInt("division_id");
                    int status = resultSet.getInt("status");
                    Employee employee = new Employee(id,nameEmployee1,dateOfBirth,idCard,salary,phoneNumber,email,address,idPosition,
                            idEducationDegree,idDivision,status);
                    employeeList.add(employee);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        return employeeList;
    }
}