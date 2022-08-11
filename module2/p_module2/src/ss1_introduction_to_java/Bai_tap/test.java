package ss1_introduction_to_java.Bai_tap;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int h = 7;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i || i == h)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println("");
        }
    }
}
