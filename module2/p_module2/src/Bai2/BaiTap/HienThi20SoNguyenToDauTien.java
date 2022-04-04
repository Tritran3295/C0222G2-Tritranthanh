package Bai2.BaiTap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        int number = 0;
        int count = 0;
        while (count <= 20) {
            boolean check = true;
            if (number < 2) {
                check = false;
            }
            for (int i = 2; i <= Math.sqrt(number); i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(number);
                count++;
            }number++;
        }

    }
}