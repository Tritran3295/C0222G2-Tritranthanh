package repository.EmployeeImpl;

import model.Employee.Employee;

import java.util.List;

public interface IEmployeeRepository {


    List<Employee> selectAllEmployee();

    void createEmployee(Employee employee);

    void update(Employee employee);

    Employee searchEmployeeById(Integer idEmployee);

    List<Employee> searchByName(String nameEmployee);

    boolean deleteEmployee(Integer idEmployee);
}
