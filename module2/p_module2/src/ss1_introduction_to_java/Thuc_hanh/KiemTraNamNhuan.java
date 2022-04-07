package ss1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class KiemTraNamNhuan {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int year;
        boolean isLeapYear=false;
        System.out.println("Enter a year");
        year=scanner.nextInt();
        boolean isDevisibleBy4 = year % 4 ==0;
        if(isDevisibleBy4){
            boolean isDevisibleBy100 = year % 100 ==0;
            if(isDevisibleBy100){
                boolean isDevisible400 = year % 400 ==0;
                if(isDevisible400){
                    isLeapYear = true;
                }
            }isLeapYear= true;
        }if(isLeapYear){
            System.out.printf("%d is a leap year",year);
        }else {
            System.out.printf("%d is Not a leap year",year);
        }

    }
}
