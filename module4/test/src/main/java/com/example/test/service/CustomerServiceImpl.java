package com.example.test.service;

import com.example.test.model.Customer;
import com.example.test.repo.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService{
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public Page<Customer> selectAll(String searchName, Pageable pageable) {
        return customerRepository.selectAll("%" + searchName + "%",pageable);
    }
}
