package ss15_xu_li_ngoai_le_va_debug.BaiTap.illegalTriangleException;

import java.util.Scanner;

public class MainTriangle {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập cạnh a: ");
            double a = scanner.nextDouble();
            System.out.println("Nhập cạnh b: ");
            double b = scanner.nextDouble();
            System.out.println("Nhập cạnh c: ");
            double c = scanner.nextDouble();
            try {
                Triangle.triAngle(a, b, c);
            } catch (Exception e) {
                e.printStackTrace();
            }


    }
    public static class Triangle{
    public static void triAngle(double a,double b,double c)  throws Exception{
        if(a < 0 || b<0 || c<0){
            throw new Exception("Số nhập vào không được nhỏ hơn 0");

        }else if( a+b < c || a +c <b || b +c <a){
            System.out.println("Tổng 2 cạnh nhập vào phải lớn hơn cạnh còn lại : ");
        }else {
            System.out.println("Là Tam giác vuông ");
        }
    }
}}
