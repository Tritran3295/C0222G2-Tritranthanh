package service.customerType;

import model.customer.customerType.CustomerType;
import repository.connectDB.ConnectionDB;
import repository.customerType.CustomerTypeRepositoryImpl;
import repository.customerType.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService{
    private ICustomerTypeRepository customerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> selectAllCustomerType() {
        return customerTypeRepository.selectAllCustomerType();
    }
}
