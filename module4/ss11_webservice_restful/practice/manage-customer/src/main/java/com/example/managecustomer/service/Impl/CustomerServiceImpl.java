package com.example.managecustomer.service.Impl;

import com.example.managecustomer.model.Customer;
import com.example.managecustomer.repository.ICustomerRepository;
import com.example.managecustomer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        return customerRepository.findById(id.intValue());
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }
}
