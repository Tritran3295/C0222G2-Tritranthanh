package service;

import model.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();

    void save(Product product);

    Product findById(int idProduct);

    void update(int idProduct, Product product);

    void delete(int idProduct);
}
