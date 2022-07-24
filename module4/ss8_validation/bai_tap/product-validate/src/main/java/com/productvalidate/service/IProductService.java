package com.productvalidate.service;

import com.productvalidate.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAll();

    void save(Product product);
}
