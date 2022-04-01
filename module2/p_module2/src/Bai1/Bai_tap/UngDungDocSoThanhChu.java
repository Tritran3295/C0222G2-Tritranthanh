package Bai1.Bai_tap;

import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number need read : ");
        int number = scanner.nextInt();

        if (number >= 0 && number <= 10) {
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
                case 10:
                    System.out.println("Ten");
                    break;
            }
        } else if (number < 20) {
            int dv1 = number % 10; //chia lấy số dư
            switch (dv1) {
                case 1:
                    System.out.println("Eleven");
                    break;
                case 2:
                    System.out.println("Twelve");
                    break;
                case 3:
                    System.out.println("Thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }

        } else if (number > 20 && number < 100) {
            int ch1 = number / 10;
            int dv2 = number % 10;
            String str = "";
            switch (ch1) {
                case 2:
                    str = ("twenty");
                    break;
                case 3:
                    str = ("thirty");
                    break;
                case 4:
                    str = ("forty");
                    break;
                case 5:
                    str = ("fifty");
                    break;
                case 6:
                    str = ("sixty");
                    break;
                case 7:
                    str = ("seventy");
                    break;
                case 8:
                    str = ("eighty");
                    break;
                case 9:
                    str = ("ninety");
                    break;
            }
            switch (dv2) {
                case 0:
                    str += "";
                case 1:
                    str += "-one";
                    break;
                case 2:
                    str += "-two";
                    break;
                case 3:
                    str += "-three";
                    break;
                case 4:
                    str += "-four";
                    break;
                case 5:
                    str += "-five";
                    break;
                case 6:
                    str += "-six";
                    break;
                case 7:
                    str += "-seven";
                    break;
                case 8:
                    str += "-eight";
                    break;
                case 9:
                    str += "-nine";
                    break;
            }
            System.out.printf("Number after read :%s", str);
        } else {
            if (number >= 100 && number < 1000) {
                int tr = number / 100;
                int ch3 = (number / 10) % 10;
                int dv3 = number % 10;
                String str = "";
                switch (tr) {
                    case 1:
                        str = "One hundred and ";
                        break;
                    case 2:
                        str = "two hundred and ";
                        break;
                    case 3:
                        str = "Three hundred and ";
                        break;
                    case 4:
                        str = "Four hundred and ";
                        break;
                    case 5:
                        str = "Five hundred and ";
                        break;
                    case 6:
                        str = "Six hundred and ";
                        break;
                    case 7:
                        str = "Seven hundred and ";
                        break;
                    case 8:
                        str = "Eight hundred and ";
                        break;
                    case 9:
                        str = "Nine hundred and ";
                        break;
                }
                switch (ch3) {
                    case 2:
                        str += "twenty";
                        break;
                    case 3:
                        str += "thirty";
                        break;
                    case 4:
                        str += "forty";
                        break;
                    case 5:
                        str += "fifty";
                        break;
                    case 6:
                        str += "sixty";
                        break;
                    case 7:
                        str += "seventy";
                        break;
                    case 8:
                        str += "eighty";
                        break;
                    case 9:
                        str += "ninety";
                        break;
                }
                switch (dv3) {
                    case 1:
                        str += "-one";
                        break;
                    case 2:
                        str += "-two";
                        break;
                    case 3:
                        str += "-three";
                        break;
                    case 4:
                        str += "-four";
                        break;
                    case 5:
                        str += "-five";
                        break;
                    case 6:
                        str += "-six";
                        break;
                    case 7:
                        str += "-seven";
                        break;
                    case 8:
                        str += "-eight";
                        break;
                    case 9:
                        str += "-nine";
                        break;
                }
                System.out.printf("Number after read :%s", str);

            }
        }
    }
}
