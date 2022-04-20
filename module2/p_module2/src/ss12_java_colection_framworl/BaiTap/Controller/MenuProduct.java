package ss12_java_colection_framworl.BaiTap.Controller;

import ss12_java_colection_framworl.BaiTap.Model.Product;
import ss12_java_colection_framworl.BaiTap.Service.ProductManager;

import java.util.Scanner;

public class MenuProduct {
    public void menuProduct() {
        ProductManager productManager = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Chào mừng bạn đến với app quản lý sản phẩm \n "+
                    "1.Thêm mới sản phẩm \n" +
                    "2.Hiển thị sản phẩm \n" +
                    "3.Xoá sản phẩm \n" +
                    "4.Sửa \n" +
                    "5.Tìm kiếm sản phẩm \n" +
                    "6.Sắp xếp \n" +
                    "7.Thoát "
                    );
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    productManager.add();
                    break;
                case 2:
                    productManager.display();
                    break;
                case 3:
                    productManager.delete();
                    break;
                case 4:
                    productManager.edit();
                    break;
                case 5:
                    productManager.search();
                    break;
                case 6:
                    productManager.sort();
                    break;
                case 7:
                    System.exit(0);
            }

        } while (true);
    }}


