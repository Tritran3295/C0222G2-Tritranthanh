package com.card.addincart.service.Impl;

import com.card.addincart.model.Product;
import com.card.addincart.repository.IProductRepository;
import com.card.addincart.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements IProductService {
    @Autowired
    private IProductRepository productRepository;
    @Override
    public Iterable<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(Math.toIntExact(id));
    }

}
