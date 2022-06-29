package service;

import model.Product;

import java.util.List;

public interface IProductService {
    void add(Product product);
    List<Product> findByName(String name);


    Product findById(int id);

    void update(Product product);


    void delete(int id);
}
