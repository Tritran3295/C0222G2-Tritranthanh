package ss12_java_colection_framworl.BaiTap.Service;

import ss12_java_colection_framworl.BaiTap.Model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProduct {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Product> products = new ArrayList<>();
    static {
    Product product1 = new Product(1,"Iphone",17,5000);
    Product product2 = new Product(2,"SamSung",15,3000);
    Product product3 = new Product(3,"MoTorola",10,2000);
    products.add(product1);
    products.add(product2);
    products.add(product3);

    }


    @Override
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập  id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên sản phẩm : ");
        String tenSanPham= scanner.nextLine();
        System.out.println("Nhập ngày sản xuất :");
        int ngaySanXuat=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá bán : ");
        int giaBan=Integer.parseInt(scanner.nextLine());
        Product product = new Product(id,tenSanPham,ngaySanXuat,giaBan);
        products.add(product);
    }

    @Override
    public void display() {
        System.out.println("Danh sách sản phẩm : ");
        for (Product x : products) {
            System.out.println(x);
        }

    }

    @Override
    public void delete() {

    }

    @Override
    public void search() {

    }

    @Override
    public void edit() {

    }

    @Override
    public void sort() {

    }
}
