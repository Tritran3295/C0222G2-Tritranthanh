package repository.CustomerImpl;

import model.Customer.Customer;

import java.util.List;

public interface ICustomerRepository {
    void createCustomer (Customer customer);
    List<Customer> selectAllCustomer();
    boolean deleteCustomer(int idCustomer);


    void update(Customer customer);

    Customer searchById(Integer idCustomer);

    List<Customer> searchByName(String nameCustomer);
}
