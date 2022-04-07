package ss3_mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the length of arr:");
        int size = scanner.nextInt();
        int [] array = new int[size];
        for (int i = 0; i < size ; i++) {
            array[i]=(int)(Math.random()*99);
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println("Enter X");
        int X = scanner.nextInt();
        System.out.println("Enter the index to insert: ");
        int index=scanner.nextInt();
        if(index <= -1 && index >= array.length-1){
            System.out.println("Can't insert to array ");
        }else {
            for (int i = array.length-1; i >index ; i--) {
                array[i]=array[i-1];
            }array[index]=X;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            
        }


    }
}
