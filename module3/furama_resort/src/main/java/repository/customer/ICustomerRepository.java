package repository.customer;

import model.customer.customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> selectAllCustomer();

    void add(Customer customer);

    Customer findById(int idCustomer);

    void update(Customer customer);

    void deleteCustomer(int idCustomer);

    List<Customer> findByName(String nameCustomer,String address);
}
