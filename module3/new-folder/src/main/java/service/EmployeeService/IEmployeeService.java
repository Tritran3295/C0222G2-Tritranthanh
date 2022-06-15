package service.EmployeeService;

import model.Employee.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> selectAllEmployee();


    void add(Employee employee);

    void update(Employee employee);


    Employee getEmployeeById(Integer idEmployee);

    List<Employee> searchByName(String nameEmployee);

    boolean deleteEmployee(Integer idEmployee);
}
