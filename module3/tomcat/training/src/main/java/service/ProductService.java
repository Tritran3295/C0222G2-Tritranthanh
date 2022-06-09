package service;

import model.model.Product;
import repository.IProductRepository;
import repository.ProductRepository;

import java.sql.SQLException;

public class ProductService implements IProductService{
    private IProductRepository iProductRepository = new ProductRepository();

    @Override
    public void createProduct(Product product) throws SQLException {
        iProductRepository.createProduct(product);
    }
}
