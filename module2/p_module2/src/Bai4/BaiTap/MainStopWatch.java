package Bai4.BaiTap;

import java.util.Scanner;

public class MainStopWatch {
    public static void main(String[] args) {
       long start = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            System.out.println("count");
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
