package service;

import model.model.Product;

import java.sql.SQLException;

public interface IProductService {
    void createProduct(Product product) throws SQLException;
}
