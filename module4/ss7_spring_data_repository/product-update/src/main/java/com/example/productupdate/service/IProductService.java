package com.example.productupdate.service;

import com.example.productupdate.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IProductService {
    Page<Product> selectAll(String searchName, Pageable pageable);

    void save(Product product);

    Product findById(int id);

    void update(Product product);

    void delete(int id);
}
