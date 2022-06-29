package repository;

import model.Product;

import java.util.List;

public interface IProductRepository {
    void add(Product product);

    List<Product> findByName(String name);



    Product findById(int id);

    void update(Product product);


    void delete(int id);
}
