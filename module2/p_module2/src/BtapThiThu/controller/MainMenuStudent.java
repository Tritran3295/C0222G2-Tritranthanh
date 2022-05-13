package BtapThiThu.controller;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    public void display(){
        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –\n" +
                "Chọn chức năng theo số (để tiếp tục):\n" +
                "1. Thêm mới giảng viên hoặc học sinh\n" +
                "2. Xóa giảng viên hoặc học sinh\n" +
                "3. Xem danh sách giảng viên hoặc học sinh\n" +
                "4. Tìm kiếm giảng viên hoặc học sinh\n" +
                "5. Thoát\n" +
                "Chọn chức năng:\n");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                add();
                break;
            case 2:
                delete();
                break;
            case 3:
                display();
                break;
            case 4:
                search();
                break;
            case 5:
                System.exit(0);
                break;

        }

    }

    private void search() {
    }

    private void delete() {
    }

    private void add() {
    }
}
