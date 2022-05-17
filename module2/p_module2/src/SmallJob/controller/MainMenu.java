package SmallJob.controller;

import SmallJob.Utils.Regex;
import SmallJob.service.Impl.OtoImpl;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MainMenu {
    Scanner scanner = new Scanner(System.in);
    OtoImpl oto =  new OtoImpl();
    public void display() {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ PHƯƠNG TIỆN GIAO THÔNG \n" +
                    "Chọn chức năng:\n" +
                    "1. Thêm mới phương tiện.\n" +
                    "2. Hiện thị phương tiện\n" +
                    "3. Xóa phương tiện\n" +
                    "4. Tìm kiếm\n" +
                    "5.Thoát");
            int choiceMain = 0;
            choiceMain = Regex.getChoice(choiceMain);
            switch (choiceMain){
                case 1:
                    addMenu();
                    break;
                case 2:
                    displayMenu();
                    break;
                case 3:
                    oto.delete();
                    break;
                case 4:
                    oto.search();
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }

    }

    private void displayMenu() {
        System.out.println("1. Hiện thị xe tải.\n" +
                "2. Hiện thị ôtô.\n" +
                "3. Hiện xe máy.");
        int choiceMenu=0;
        choiceMenu = Regex.getChoice(choiceMenu);

        switch (choiceMenu){
            case 1:
                displayXeTai();
                break;
            case 2:
                oto.display();
                break;
            case 3:
                displayXeMay();
                break;
        }
    }

    private void displayXeMay() {
    }



    private void displayXeTai() {
    }

    private void addMenu() {
        System.out.println("1. Thêm xe tải,\n" +
                "2. Thêm ôtô,\n" +
                "3. Thêm xe máy.");
        int choicePhuongTien = 0;
        choicePhuongTien=Regex.getChoice(choicePhuongTien);
        switch (choicePhuongTien){
            case 1:
                addXeTai();
                break;
            case 2:
                oto.add();
                break;
            case 3:
                addXeMay();
                break;
        }

    }

    private void addXeMay() {
    }

    private void addXeTai() {
    }



}
