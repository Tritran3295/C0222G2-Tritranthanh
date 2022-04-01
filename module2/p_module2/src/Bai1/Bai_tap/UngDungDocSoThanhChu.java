package Bai1.Bai_tap;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number need read");
        int number = scanner.nextInt();
        if (number >= 0 && number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                case 1:
                    System.out.println("One");
                case 2:
                    System.out.println("Two");
                case 3:
                    System.out.println("Three");
                case 4:
                    System.out.println("Four");
                case 5:
                    System.out.println("Five");
                case 6:
                    System.out.println("Six");
                case 7:
                    System.out.println("Seven");
                case 8:
                    System.out.println("Eight");
                case 9:
                    System.out.println("Nine");
//                case 10:
//                    System.out.println("Ten");
            }
        }else if (number <= 20 && number > 10){
            
        }
    }
}