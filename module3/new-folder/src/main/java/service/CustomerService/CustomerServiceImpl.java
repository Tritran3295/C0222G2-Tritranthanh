package service.CustomerService;

import model.Customer.Customer;
import repository.CustomerImpl.CustomerRepositoryImpl;
import repository.CustomerImpl.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private ICustomerRepository iCustomerRepository = new CustomerRepositoryImpl();

    @Override
    public void add(Customer customer) {
         iCustomerRepository.createCustomer(customer);
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return iCustomerRepository.selectAllCustomer();
    }

    @Override
    public boolean deleteCustomer(int idCustomer) {
        boolean rowDelete;
        rowDelete = iCustomerRepository.deleteCustomer(idCustomer);
        return rowDelete;
    }

    @Override
    public void update(Customer customer) {
        iCustomerRepository.update(customer);
    }

    @Override
    public Customer getCustomerById(Integer idCustomer) {
      return iCustomerRepository.searchById(idCustomer);
    }

    @Override
    public List<Customer> searchByName(String nameCustomer) {
        return iCustomerRepository.searchByName(nameCustomer);
    }


}
