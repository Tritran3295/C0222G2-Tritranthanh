package com.product.service;

import com.product.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> selectAll();


    List<Product> findByName(String searchValue);
}
