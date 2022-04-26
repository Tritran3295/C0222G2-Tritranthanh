package ss17_binary_file_serialization.BaiTap.service;

import ss17_binary_file_serialization.BaiTap.Product;
import ss17_binary_file_serialization.BaiTap.model.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl {
    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    static {
        productList.add(new Product(1,"Iphone 11 pro max","Iphone",1300));
        productList.add(new Product(1,"Iphone 12 pro max","Iphone",1350));
        productList.add(new Product(1,"Iphone 13 pro max","Iphone",1400));
        ReadAndWrite.writeToFile(productList);
    }
    public void display(){
       productList = ReadAndWrite.readToFile();
        System.out.println("List Product : ");
        for(Product product : productList){
            System.out.println(product);
        }
    }
    public void add(){
        productList = ReadAndWrite.readToFile();
        System.out.println("Enter id : ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name of product: ");
        String tenSanPham = scanner.nextLine();
        System.out.println("Enter hãng sản xuất : ");
        String hangSanXuat = scanner.nextLine();
        System.out.println("Enter the price : ");
        int price = Integer.parseInt(scanner.nextLine());
        Product products= new Product(id,tenSanPham,hangSanXuat,price);
        productList.add(products);
        ReadAndWrite.writeToFile(productList);

    }
    public void search(){
        productList = ReadAndWrite.readToFile();
        System.out.println("Enter the id wanna search: ");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        for (Product product :productList){
            if(product.getMaSanPham() == maSanPham){
                break;
            }
        }
        for (Product product : productList){
            if(product.getMaSanPham()== maSanPham){
                System.out.println(product);
                break;
            }else {
                System.out.println("The product is not exist");
            }
        }

    }
    public void delete(){
        productList = ReadAndWrite.readToFile();
        System.out.println("Enter the id you wanna remove :");
        int maSanPham = Integer.parseInt(scanner.nextLine());
        for (Product product :productList){
            if(product.getMaSanPham() == maSanPham){

            }
        }

    }

}
