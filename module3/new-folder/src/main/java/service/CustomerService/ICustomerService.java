package service.CustomerService;

import model.Customer.Customer;

import java.util.List;

public interface ICustomerService {
    void add(Customer customer);
    List<Customer> selectAllCustomer();
    boolean deleteCustomer(int idCustomer);

    void update(Customer customer);

    Customer getCustomerById(Integer idCustomer);

    List<Customer> searchByName(String nameCustomer);
}
