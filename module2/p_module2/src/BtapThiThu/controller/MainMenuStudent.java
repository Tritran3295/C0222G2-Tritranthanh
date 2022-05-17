package BtapThiThu.controller;

import BtapThiThu.service.StudentImpl;

import java.util.Scanner;

public class MainMenuStudent {
    Scanner scanner = new Scanner(System.in);
    StudentImpl students = new StudentImpl();
    public void display() {
        while (true) {
            System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ SINH VIÊN –\n" +
                    "Chọn chức năng theo số (để tiếp tục):\n" +
                    "1. Thêm mới giảng viên hoặc học sinh\n" +
                    "2. Xóa giảng viên hoặc học sinh\n" +
                    "3. Xem danh sách giảng viên hoặc học sinh\n" +
                    "4. Tìm kiếm giảng viên hoặc học sinh\n" +
                    "5. Thoát\n" +
                    "Chọn chức năng:\n");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    delete();
                    break;
                case 3:
                    students.display();
                    break;
                case 4:
                    search();
                    break;
                case 5:
                    System.exit(0);
                    break;

            }

        }}

        private void search () {
        }

        private void delete () {
        }

        private void add () {
            System.out.println("Please choose you wanna add :\n" +
                    "1.Add new Student \n" +
                    "2.Add new Teacher" +
                    "3.back the main menu");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    students.add();
                    break;
                case 2:
                    addNewTeacher();
                    break;

            }
        }

        private void addNewTeacher () {
        }


}
