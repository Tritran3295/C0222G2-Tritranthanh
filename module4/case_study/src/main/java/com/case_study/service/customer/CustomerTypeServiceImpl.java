package com.case_study.service.customer;

import com.case_study.model.customer.CustomerType;
import com.case_study.repository.customer.ICustomerTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerTypeServiceImpl implements ICustomerTypeService {
    @Autowired
    private ICustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerType> selectAll() {
        return customerTypeRepository.findAll();
    }
}
