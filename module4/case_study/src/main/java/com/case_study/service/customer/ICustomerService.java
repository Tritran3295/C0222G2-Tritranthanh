package com.case_study.service.customer;

import com.case_study.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> selectAll(String searchName,Pageable pageable);

    void save(Customer customer);

    Customer findById(int id);

    void update(Customer customer);

    void delete(int id);
}
