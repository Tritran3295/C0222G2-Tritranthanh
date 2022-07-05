package service.employee;

import model.employee.division.Division;
import model.employee.educationDegree.EducationDegree;
import model.employee.employee.Employee;
import model.employee.position.Position;
import model.employee.user.User;
import repository.employee.Impl.EmployeeRepositoryImpl;
import repository.employee.Interface.IEmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService{
    private IEmployeeRepository employeeRepository = new EmployeeRepositoryImpl();

    @Override
    public List<Position> selectAllPosition() {
        return employeeRepository.selectAllPosition();
    }

    @Override
    public List<EducationDegree> selectAllEducationDegree() {
        return employeeRepository.selectAllEducationDegree();
    }

    @Override
    public List<Division> selectAllDivision() {
        return employeeRepository.selectAllDivision();
    }

    @Override
    public List<Employee> selectAllEmployee() {
        return employeeRepository.selectAllEmployee();
    }

    @Override
    public List<User> selectAllUser() {
        return employeeRepository.selectAllUser();
    }

    @Override
    public void add(Employee employee) {
        employeeRepository.add(employee);
    }

    @Override
    public Employee findById(int idEmployee) {
        return employeeRepository.findById(idEmployee);
    }

    @Override
    public void update(Employee employee) {
        employeeRepository.update(employee);
    }

    @Override
    public void deleteEmployee(int idEmployee) {
        employeeRepository.deleteEmployee(idEmployee);
    }

    @Override
    public List<Employee> findByName(String nameEmployee) {
        return employeeRepository.findByName(nameEmployee);
    }
}
