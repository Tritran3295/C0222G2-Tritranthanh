package service;

import model.Customer;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{
    CustomerServiceImpl customerService = new CustomerServiceImpl();

    @Override
    public List<Customer> selectAllCustomer() {
        return customerService.selectAllCustomer();
    }
}
