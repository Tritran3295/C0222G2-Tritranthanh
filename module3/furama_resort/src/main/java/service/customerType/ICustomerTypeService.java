package service.customerType;

import model.customer.customerType.CustomerType;

import java.util.List;

public interface ICustomerTypeService {
    List<CustomerType> selectAllCustomerType();
}
