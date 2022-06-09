package service;

import model.CustomerType;
import repository.CustomerRepositoryImpl;
import repository.CustomerTypeRepositoryImpl;

import java.sql.SQLException;
import java.util.List;

public class CustomerTypeService {
    CustomerTypeRepositoryImpl customerTypeRepository = new CustomerTypeRepositoryImpl();


    public CustomerType selectCustomerType(int id){
        return customerTypeRepository.selectCustomerType(id);
    }
    public List<CustomerType> selectAllCustomerType() throws SQLException {
        return customerTypeRepository.selectAllCustomerType();
    }
}
