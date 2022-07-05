package service.customer;

import model.customer.customer.Customer;
import repository.customer.CustomerRepositoryImpl;
import repository.customer.ICustomerRepository;

import java.util.List;

public class CustomerServiceImpl implements ICustomerService{
    private ICustomerRepository customerRepository = new CustomerRepositoryImpl();

    @Override
    public List<Customer> selectAllCustomer() {
        return customerRepository.selectAllCustomer();
    }

    @Override
    public void add(Customer customer) {
        customerRepository.add(customer);
    }

    @Override
    public Customer findById(int idCustomer) {
        return customerRepository.findById(idCustomer);
    }

    @Override
    public void update(Customer customer) {
        customerRepository.update(customer);
    }

    @Override
    public void deleteCustomer(int idCustomer) {
        customerRepository.deleteCustomer(idCustomer);
    }

    @Override
    public List<Customer> findByName(String nameCustomer) {
        return customerRepository.findByName(nameCustomer);
    }
}
