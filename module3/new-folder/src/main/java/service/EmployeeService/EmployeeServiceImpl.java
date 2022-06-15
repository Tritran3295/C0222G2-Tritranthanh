package service.EmployeeService;

import model.Employee.Employee;
import repository.EmployeeImpl.EmployeeRepositoryImpl;
import repository.EmployeeImpl.IEmployeeRepository;

import java.util.List;

public class EmployeeServiceImpl implements IEmployeeService {
    private IEmployeeRepository iEmployeeRepository = new EmployeeRepositoryImpl();
    @Override
    public List<Employee> selectAllEmployee() {
        return iEmployeeRepository.selectAllEmployee();
    }

    @Override
    public void add(Employee employee) {
        iEmployeeRepository.createEmployee(employee);
    }

    @Override
    public void update(Employee employee) {
        iEmployeeRepository.update(employee);
    }

    @Override
    public Employee getEmployeeById(Integer idEmployee) {
        return iEmployeeRepository.searchEmployeeById(idEmployee);
    }

    @Override
    public List<Employee> searchByName(String nameEmployee) {
        return iEmployeeRepository.searchByName(nameEmployee);
    }

    @Override
    public boolean deleteEmployee(Integer idEmployee) {
        boolean rowDelete;
        rowDelete = iEmployeeRepository.deleteEmployee(idEmployee);
        return rowDelete;
    }


}
