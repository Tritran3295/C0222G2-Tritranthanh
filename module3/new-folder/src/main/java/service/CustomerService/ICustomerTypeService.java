package service.CustomerService;

import model.Customer.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> selectAllCustomerType();

}
