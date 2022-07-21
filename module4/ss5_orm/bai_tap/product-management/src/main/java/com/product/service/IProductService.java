package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAll();

    void save(Product product);

    Product findById(int id);

    void edit(Product product);


    void delete(int id);

    List<Product> findByName(String search);
}
