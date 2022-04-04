package Bai3.BaiTap;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        int [] N ={10,4,6,7,8,6,0,0,0,0};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number");
        int X = scanner.nextInt();
        boolean check = true;
        for (int i = 0; i <N.length ; i++) {
            if(X == N[i]){
                check = true;
                break;

            }
        }if(check){
            for (int i = X; i <N.length -1 ; i++) {
                N[i]=N[i+1];
            }
        }
        N[N.length-1]=0;
        System.out.println("New N:");
        for (int i = 0; i <N.length ; i++) {
            System.out.print(N[i]+"\t");
        }


    }
}