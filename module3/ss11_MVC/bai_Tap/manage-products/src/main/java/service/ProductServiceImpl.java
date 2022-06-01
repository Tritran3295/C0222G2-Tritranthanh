package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;


public class ProductServiceImpl implements IProductService {
    private static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Dầu gội",64.500,"Hàng nội địa","Clear"));
        products.add(new Product(2,"Dầu gội",66.500,"Hàng nhập khẩu","Sunsilk"));
        products.add(new Product(3,"Dầu gội",65.500,"Hàng nội địa","x-men"));
    }

    @Override
    public List<Product> findAll() {
        return products;
    }

    @Override
    public void save(Product product) {
        products.add(product);

    }

    @Override
    public Product findById(int idProduct) {
        return products.get(idProduct);
    }

    @Override
    public void update(int idProduct, Product product) {
        products.add(product);
    }

    @Override
    public void remove(int idProduct) {
        products.remove(idProduct);
    }
}
