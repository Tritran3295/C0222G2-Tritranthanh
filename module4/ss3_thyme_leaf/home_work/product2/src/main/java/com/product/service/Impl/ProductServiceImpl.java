package com.product.service.Impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import com.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;

    @Override
    public List<Product> selectAll() {
        return productRepository.selectAll();
    }

    @Override
    public List<Product> findByName(String searchValue) {
        return productRepository.findByName(searchValue);
    }


}
