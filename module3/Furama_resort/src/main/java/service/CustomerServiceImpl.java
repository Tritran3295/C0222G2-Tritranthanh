package service;

import model.Customer;
import repository.ConnectionDB;
import repository.CustomerRepositoryImpl;
import repository.ICustomerRepository;

import java.sql.SQLException;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImpl();

    @Override
    public void createCustomer(Customer customer) throws SQLException {
        iCustomerRepository.createCustomer(customer);
    }

    @Override
    public void add(Customer customer) {
        ConnectionDB connectionDB = new ConnectionDB();

    }
}
