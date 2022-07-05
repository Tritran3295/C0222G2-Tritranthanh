package repository.employee.Interface;

import model.employee.division.Division;
import model.employee.educationDegree.EducationDegree;
import model.employee.employee.Employee;
import model.employee.position.Position;
import model.employee.user.User;

import java.util.List;

public interface IEmployeeRepository {
    List<Position> selectAllPosition();

    List<EducationDegree> selectAllEducationDegree();

    List<Division> selectAllDivision();

    List<Employee> selectAllEmployee();

    List<User> selectAllUser();

    void add(Employee employee);

    Employee findById(int idEmployee);

    void update(Employee employee);

    void deleteEmployee(int idEmployee);

    List<Employee> findByName(String nameEmployee);
}
