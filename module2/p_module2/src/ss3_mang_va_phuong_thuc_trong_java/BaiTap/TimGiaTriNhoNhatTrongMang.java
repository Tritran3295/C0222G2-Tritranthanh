package ss3_mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] arr = {4,5,6,1,7,8,};
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]<min){
                min=arr[i];
            }


        }
        System.out.println("The smallest property value in the list is " + min);
    }
}
