package service.CustomerService;

import model.Customer.CustomerType;
import repository.CustomerImpl.CustomerTypeRepositoryImpl;
import repository.CustomerImpl.ICustomerTypeRepository;

import java.util.List;

public class CustomerTypeServiceImpl implements ICustomerTypeService {
    private ICustomerTypeRepository iCustomerTypeRepository = new CustomerTypeRepositoryImpl();

    @Override
    public List<CustomerType> selectAllCustomerType() {
     List<CustomerType> customerTypeList = iCustomerTypeRepository.selectAllCustomerType();
    return customerTypeList;
    }

}
