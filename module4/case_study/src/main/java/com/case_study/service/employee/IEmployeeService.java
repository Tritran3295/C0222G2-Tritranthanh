package com.case_study.service.employee;

import com.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmployeeService {

    Page<Employee> selectAll(String searchName, Pageable pageable);

    void save(Employee employee);

    Employee findById(int id);

    void update(Employee employee);

    void delete(int id);
}
