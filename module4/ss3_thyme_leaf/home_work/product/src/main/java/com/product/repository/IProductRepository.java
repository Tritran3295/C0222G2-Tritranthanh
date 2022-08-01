package com.product.repository;

import com.product.model.Product;

import java.util.List;

public interface IProductRepository {
    List<Product> selectAll();

    void save(Product product);

    Product findById(int id);

    void updateProduct(Product product);

    void delete(int id);

    List<Product> findByName(String nameProduct);
}
