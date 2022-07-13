package service.customer;

import model.customer.customer.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> selectAllCustomer();

    void add(Customer customer);

    Customer findById(int idCustomer);

    void update(Customer customer);

    void deleteCustomer(int idCustomer);

    List<Customer> findByName(String nameCustomer,String address);
}
