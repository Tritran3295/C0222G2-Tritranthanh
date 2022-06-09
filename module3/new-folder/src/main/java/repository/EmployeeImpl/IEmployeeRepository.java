package repository.EmployeeImpl;

import model.Employee.Employee;

import java.util.List;

public interface IEmployeeRepository {


    List<Employee> selectAllEmployee();

    void createEmployee(Employee employee);
}
