package ss3_mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr1= new int[3];
        int[] arr2= new int[3];
        for (int i = 0; i <arr1.length ; i++) {
            System.out.print("Enter the element to arr1" );
            arr1[i]=scanner.nextInt();
        }
        for (int i = 0; i <arr2.length ; i++) {
            System.out.print("Enter the element to arr2");
            arr2[i]=scanner.nextInt();
        }
        int[] arr3=new int[arr1.length + arr2.length];
       int j =0;
        for (int element:arr1){
              arr3[j]=element;
            j++;
        }
        for(int element : arr2){
            arr3[j]=element;
            j++;
        }
        for (int element : arr3){
            System.out.println("arr3: "+ element);
        }
    }
}
