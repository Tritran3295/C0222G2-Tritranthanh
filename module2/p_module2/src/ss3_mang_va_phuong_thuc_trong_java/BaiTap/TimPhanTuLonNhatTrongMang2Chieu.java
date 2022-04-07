package ss3_mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the row of array: ");
        int a = scanner.nextInt();
        System.out.print("Enter the col of array: ");
        int b = scanner.nextInt();
        int[][] arr= new int[a][b];
        for (int i = 0; i < arr.length; i++) {
            for (int j=0;j<arr[i].length;j++){
                arr[i][j]=(int)(Math.random()*99);
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();

        }
        int max=arr[0][0];
        for (int i = 0; i < a; i++) {
            for(int j = 0;j<b;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }

        }
        System.out.println("The largest value in array is : " + max);
    }
}
