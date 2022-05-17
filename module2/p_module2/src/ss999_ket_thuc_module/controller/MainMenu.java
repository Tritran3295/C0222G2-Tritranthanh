package ss999_ket_thuc_module.controller;

import ss999_ket_thuc_module.Utils.Regex;
import ss999_ket_thuc_module.model.HandPhone;
import ss999_ket_thuc_module.model.RealPhone;
import ss999_ket_thuc_module.service.Impl.HandPhoneImpl;
import ss999_ket_thuc_module.service.Impl.RealPhoneImpl;
import ss999_ket_thuc_module.service.Impl.ShopPhoneImpl;

import java.util.Scanner;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    RealPhoneImpl realPhone = new RealPhoneImpl();
    HandPhoneImpl handPhone = new HandPhoneImpl();
    ShopPhoneImpl shopPhone= new ShopPhoneImpl();
    public void display() {
        while (true) {
            System.out.println("Main Menu \n" +
                    "1.Real Phone\n" +
                    "2.Hand Phone\n" +
                    "0.Exit");
            System.out.println("Choice: ");
            int choiceMain = 0;
            choiceMain=Regex.getChoice(choiceMain);
            switch (choiceMain) {
                case 1:
                    choiceHandPhone();
                    break;
                case 2:
                    choiceRealPhone();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Choice again!");
                    break;
            }
        }
//        System.out.println("--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--\n"+
//                "Chọn chức năng theo số:\n"+
//                "1.Thêm mới\n"+
//                "2.Xoá\n"+
//                "3.Xem danh sách điện thoại\n"+
//                "4.Tìm kiếm\n"+
//                "5.Thoát\n"+
//                "Chọn chức năng");
//
//        int choiceMain = 0;
//        choiceMain= Regex.getChoice(choiceMain);
//        switch (choiceMain){
//            case 1:
//                add();
//                break;
//            case 2:
//                shopPhone.delete();
//                break;
//            case 3:
//                shopPhone.display();
//                break;
//            case 4:
//                shopPhone.search();
//                break;
//            case 5:
//                System.exit(0);
//
//        }
//    }}
//
//    private void search() {
//    }
//
//    private void delete() {
//    }
//    private void add(){
//        System.out.println("Enter the product you wanna add:\n"+
//                "1.Real Phone \n"+
//                "2.Hand Phone");
//        int choiceAdd = 0;
//        choiceAdd = Regex.getChoice(choiceAdd);
//        switch (choiceAdd){
//            case 1:
//                realPhone.add();
//                break;
//            case 2:
//                handPhone.add();
//                break;
//        }
//    }
//
//    private void addHandPhone() {
//    }
//
//    private void addRealPhone() {
//    }


    }

    private void choiceRealPhone() {
        while (true){
            System.out.println("Hand Phone manager: \n"+
                    "Chọn chức năng theo số:\n"+
                    "1.Thêm mới\n"+
                    "2.Xoá\n"+
                    "3.Xem danh sách điện thoại\n"+
                    "4.Tìm kiếm\n"+
                    "5.Thoát\n"+
                    "Chọn chức năng");
            int choiceReal =0;
            choiceReal=Regex.getChoice(choiceReal);
            switch (choiceReal){
                case 1:
                    realPhone.add();
                    break;
                case 2:
                    realPhone.delete();
                    break;
                case 3:
                    realPhone.display();
                case 4:
                    realPhone.search();
                default:
                    System.out.println("choice again");
                    break;

            }
        }
    }

    private void choiceHandPhone() {
        while (true){
            System.out.println("Real Phone manager: \n"+
                    "Chọn chức năng theo số:\n"+
                    "1.Thêm mới\n"+
                    "2.Xoá\n"+
                    "3.Xem danh sách điện thoại\n"+
                    "4.Tìm kiếm\n"+
                    "5.Thoát\n"+
                    "Chọn chức năng");
            int choiceHand = 0;
            choiceHand=Regex.getChoice(choiceHand);
            switch (choiceHand){
                case 1:
                    handPhone.add();
                    break;
                case 2:
                    handPhone.delete();
                    break;
                case 3:
                    handPhone.display();
                    break;
                case 4:
                    handPhone.search();
                    break;
                default:
                    System.out.println("choice again");
                    break;
            }
        }
    }
}