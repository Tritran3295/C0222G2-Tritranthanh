package Bai1.Bai_tap;

import java.util.Scanner;

public class ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd =23.000;
        double usd;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tiền cần đổi: ");
        usd  = scanner.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("Số tiền của bạn là :" + quydoi);



    }
}
