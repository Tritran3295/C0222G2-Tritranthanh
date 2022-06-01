package service;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements IProductService{
    static List<Product> products = new ArrayList<>();
    static {
        products.add(new Product(1,"Shampoo",64500,"domestic goods","Clear"));
        products.add(new Product(2,"Shampoo",66500,"imported goods","Sunsilk"));
        products.add(new Product(3,"Shampoo",65500,"domestic goods","x-men"));

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
        for(Product product : products){
            if(product.getIdProduct()== idProduct){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int idProduct, Product product) {
        products.set(idProduct,product);

    }

    @Override
    public void delete(int idProduct) {
        products.remove(idProduct);

    }
}
