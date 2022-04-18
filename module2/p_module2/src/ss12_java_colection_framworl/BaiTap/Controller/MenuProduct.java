package ss12_java_colection_framworl.BaiTap.Controller;

import java.util.Scanner;

public class MenuProduct {
    private static Scanner scanner = new Scanner(System.in);
    public void display(){
        while (true){
            System.out.println("Chào mừng bạn đến với app quản lý sản phẩm ");
            System.out.println("Mời bạn chọn chức năng : ");
            System.out.println("1.Thêm mới sản phẩm  \n " +
                    "2.Hiển thị sản phẩm \n" +
                    "3.Xoá sản phẩm \n" +
                    "4.Sửa \n" +
                    "5.Tìm kiếm sản phẩm \n" +
                    "6.Sắp xếp \n" +
                    "7.Thoát ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                   add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    edit();
                    break;
                case 5:
                    search();
                    break;
                case 7:
                    System.exit(0);


            }
        }
    }

    private void search() {
    }

    private void edit() {
    }

    private void delete() {
    }

    private void add() {
    }
}
