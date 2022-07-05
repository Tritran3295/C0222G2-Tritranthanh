package repository.customerType;

import model.customer.customerType.CustomerType;

import java.util.List;

public interface ICustomerTypeRepository {
    List<CustomerType> selectAllCustomerType();
}
