package ss18_string_regex.BaiTap;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateClass {
    private static final String CLASS_REGEX = "^[CAP]+[0-9]{4}+[GHIKLM]$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập chuỗi : ");
            String str = scanner.nextLine();
            if(!str.matches(CLASS_REGEX)){
                System.out.println("chuỗi nhập không đúng định dạng");
            }else {
                System.out.println("Chuỗi đúng với định dạng");
            }
        }



    }

}

