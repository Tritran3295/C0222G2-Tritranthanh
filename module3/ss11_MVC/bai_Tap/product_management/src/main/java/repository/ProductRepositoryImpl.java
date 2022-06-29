package repository;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductRepositoryImpl implements IProductRepository {
    static List<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "Iphone Promax13", "Iphone", 13.500, "Hàng Chính hãng"));
        productList.add(new Product(2, "Iphone Promax12", "Iphone", 14.500, "Hàng Chính hãng"));
        productList.add(new Product(3, "Iphone Promax11", "Iphone", 15.500, "Hàng Chính hãng"));
        productList.add(new Product(4, "SamSung s21", "SamSung", 12.500, "Hàng Chính hãng"));
        productList.add(new Product(5, "SamSung s22", "SamSung", 11.500, "Hàng Chính hãng"));
    }

    public List<Product> selectAllProduct() {
        return productList;
    }


    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> temp = new ArrayList<>();
        for (Product product : productList) {
            if (product.getName().contains(name)) {
                temp.add(product);
            }
        }
        return temp;
    }

    @Override
    public Product findById(int id) {
        for (Product product: productList) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null ;
    }

    @Override
    public void update(Product product) {
        for (Product p: productList) {
            if (p.getId() == product.getId()) {
                p.setId(product.getId());
                p.setName(product.getName());
                p.setManufactor(product.getManufactor());
                p.setPrice(product.getPrice());
                p.setDetailProduct(product.getDetailProduct());
                break;
            }
        }
    }

    @Override
    public void delete(int id) {
        productList.remove(id);
    }

}
