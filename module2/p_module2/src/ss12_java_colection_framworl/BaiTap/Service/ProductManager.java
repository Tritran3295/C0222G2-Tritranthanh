package ss12_java_colection_framworl.BaiTap.Service;

import ss12_java_colection_framworl.BaiTap.Model.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ProductManager implements IProduct {
//    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Product> products = new ArrayList<>();
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id muốn xoá");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i <products.size() ; i++) {
            if(id == products.get(i).getId()){
                products.remove(i);
            }
        }

    }

    @Override
    public void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập sản phẩm bạn muốn tìm : ");
//        boolean flag= true;
        String tenSanPham = scanner.nextLine();
        for (Product product : products) {
            if (product.getTenSanPham().contains(tenSanPham)) {
                break;
            }
        }
        for (Product product : products) {
            if (product.getTenSanPham().contains(tenSanPham)) {
                System.out.println(product);
                break;
            } else {
                System.out.println("Không tìm thấy sản phẩm muốn tìm");
            }
        }

    }

    @Override
    public void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id bạn cần sửa chửa : ");
        int id = Integer.parseInt(scanner.nextLine());
        for (Product product : products) {
            if (id == product.getId()) {
                System.out.println("Nhập id mới: ");
                int newId = Integer.parseInt(scanner.nextLine());
                product.setId(newId);
                System.out.println("Nhập tên sản phẩm mới: ");
                String newTenSanPham = scanner.nextLine();
                product.setTenSanPham(newTenSanPham);
                System.out.println("Nhập ngày sản xuất mới:");
                int newNgaySanXuat = Integer.parseInt(scanner.nextLine());
                product.setNgaySanXuat(newNgaySanXuat);
                System.out.println("Nhập giá bán muốn thay đổi: ");
                int newGiaBan = Integer.parseInt(scanner.nextLine());
                product.setGiaBan(newGiaBan);
                break;
            } else {
                System.out.println("Không tìm thấy id trong list");
            }
        }

    }

    @Override
    public void sort() {


    }
}
