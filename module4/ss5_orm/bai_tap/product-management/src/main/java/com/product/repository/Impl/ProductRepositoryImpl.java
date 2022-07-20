package com.product.repository.Impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import com.product.repository.connection.ConnectionUtil;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.sql.Connection;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    @Override
    public List<Product> selectAll() {
        TypedQuery<Product> query = ConnectionUtil.entityManager.createQuery("select p from Product p",Product.class);
        return query.getResultList();
    }
}
