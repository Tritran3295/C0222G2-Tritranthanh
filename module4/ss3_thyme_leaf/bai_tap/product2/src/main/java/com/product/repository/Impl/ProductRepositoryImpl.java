package com.product.repository.Impl;

import com.product.model.Product;
import com.product.repository.IProductRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepositoryImpl implements IProductRepository {
    private static List<Product> productList = new ArrayList<>();
    static {
        Product product1 = new Product(1,"Iphone 11",13.5000,"Chính hãng","Iphone");
        Product product2 = new Product(2,"Iphone 12",14.5000,"Chính hãng","Iphone");
        Product product3 = new Product(3,"Iphone 13",15.5000,"Xách tay","Iphone");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }

    @Override
    public List<Product> selectAll() {
        return productList;
    }

    @Override
    public List<Product> findByName(String searchValue) {
        List<Product> products = new ArrayList<>();
        for (Product product : productList) {
            if (product.getNameProduct().contains(searchValue)) {
                products.add(product);
            }
        } return products;
    }


}
