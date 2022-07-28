package com.example.managecustomer.service;

import com.example.managecustomer.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    List<Customer> findAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);
}
