package repository;

import model.model.Product;

import java.sql.SQLException;
import java.util.List;

public interface IProductRepository {
    List<Product> selectAllProducts();
    void createProduct (Product product) throws SQLException;


}
