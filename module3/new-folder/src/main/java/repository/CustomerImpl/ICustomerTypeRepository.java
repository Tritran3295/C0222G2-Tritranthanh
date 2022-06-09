package repository.CustomerImpl;

import model.Customer.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> selectAllCustomerType();
}
