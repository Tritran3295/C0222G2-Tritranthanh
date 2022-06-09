package service;

import model.Customer;

import java.sql.SQLException;

public interface ICustomerService {
    void createCustomer (Customer customer) throws SQLException;


    void add(Customer customer);
}
