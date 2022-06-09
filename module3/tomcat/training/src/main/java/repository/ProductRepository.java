package repository;

import model.model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductRepository implements IProductRepository {
    private BaseProductRepository baseProductRepository = new BaseProductRepository();
    private String SHOW_ALL_PRODUCT = "select * from san_pham;";
    private String CREATE_PRODUCT = "insert into san_pham(ten_san_pham,chi_tiet_san_pham,ngay_san_xuat,hang_san_xuat,nuoc_san_xuat)" +
            "value(?,?,?,?,?)";

    @Override
    public List<Product> selectAllProducts() {
        List<Product> productList = new ArrayList<>();
        try(Connection connection = baseProductRepository.getConnection();
            PreparedStatement preparedStatement =connection.prepareStatement(SHOW_ALL_PRODUCT);) {
            System.out.println(preparedStatement);
            ResultSet resultSet =preparedStatement.executeQuery();
            while(resultSet.next()){
                Integer stt = resultSet.getInt("stt");
                String nameProduct = resultSet.getString("ten_san_pham");
                String detailProduct = resultSet.getString("chi_tiet_san_pham");
                String dateOfManufacture = resultSet.getString("ngay_san_xuat");
                String manufacturer = resultSet.getString("hang_san_xuat");
                String countryProduct = resultSet.getString("nuoc_san_xuat");
                productList.add(new Product(stt,nameProduct,detailProduct,dateOfManufacture,manufacturer,countryProduct));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return productList;
    }

    @Override
    public void createProduct(Product product) throws SQLException {

    }


}
