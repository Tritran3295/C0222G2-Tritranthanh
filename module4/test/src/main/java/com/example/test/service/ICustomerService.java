package com.example.test.service;

import com.example.test.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ICustomerService {
    Page<Customer> selectAll(String searchName, Pageable pageable);
}
