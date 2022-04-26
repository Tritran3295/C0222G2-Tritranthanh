package ss18_string_regex.BaiTap;

import javafx.scene.transform.Scale;

import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidateNumberPhone {
    private static final String PHONE_REGEX = "^^[0-9]{2}\\-[0-9]{10}$$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Nhập số điện thoại : ");
            String sdt = scanner.nextLine();
            if(!sdt.matches(PHONE_REGEX)){
                System.out.println("Số nhập vào không đúng");
            }else {
                System.out.println("true");
            }
        }
    }

}
