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


}
