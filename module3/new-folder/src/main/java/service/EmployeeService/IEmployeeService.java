package service.EmployeeService;

import model.Employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> selectAllEmployee();


    void add(Employee employee);
}
