package service;

import model.Product;
import repository.ProductRepositoryImpl;

import java.util.List;

public class ProductServiceImpl implements IProductService{
    private ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    public List<Product> selectAllProduct() {
        return productRepository.selectAllProduct();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }


    @Override
    public List<Product> findByName(String name) {
        return productRepository.findByName(name);
    }

    @Override
    public Product findById(int id) {

        return productRepository.findById(id);
    }

    @Override
    public void update(Product product) {
        productRepository.update(product);
    }

    @Override
    public void delete(int id) {
         productRepository.delete(id);
    }


}
