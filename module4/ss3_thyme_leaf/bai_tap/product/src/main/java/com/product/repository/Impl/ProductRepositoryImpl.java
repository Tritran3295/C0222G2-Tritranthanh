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
        Product product1 = new Product(1, "Iphone 11", 13.300, "Chính hãng", "Iphone");
        Product product2 = new Product(2, "Iphone 12", 14.300, "Chính hãng", "Iphone");
        Product product3 = new Product(3, "Iphone 13", 15.300, "Xách tay", "Iphone");
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
    }


    @Override
    public List<Product> selectAll() {
        return productList;
    }

    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public Product findById(int id) {
        for (Product product : productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    @Override
    public void updateProduct(Product product) {
        for (Product product1 : productList) {
            if (product1.getId() == product.getId()) {
                product1.setNameProduct(product.getNameProduct());
                product1.setPrice(product.getPrice());
                product1.setDescribe(product.getDescribe());
                product1.setHostProduct(product.getHostProduct());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        productList.remove(findById(id));
    }

    @Override
    public List<Product> findByName(String nameProduct) {
        List<Product> listProduct = new ArrayList<>();
        for (Product product : productList) {
            if (product.getNameProduct().contains(nameProduct)) {
                listProduct.add(product);
            }
        }
        return listProduct;
    }
}
