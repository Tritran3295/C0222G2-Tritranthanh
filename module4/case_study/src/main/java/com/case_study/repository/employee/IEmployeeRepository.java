package com.case_study.repository.employee;

import com.case_study.model.customer.Customer;
import com.case_study.model.employee.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface IEmployeeRepository extends JpaRepository<Employee,Integer> {
    @Query(value = " select * from employee where nam_employee like :searchName ", nativeQuery = true,
            countQuery = " select count(*) from (select * from employee where nam_employee like :searchName ) temp_table ")
    Page<Employee>selectAll(@Param("searchName") String searchName, Pageable pageable);

    @Modifying
    @Transactional
    @Query(value = "update employee set status = 1 where employee.id = :id ",nativeQuery = true)
    void deleteEmployee(int id);
}
