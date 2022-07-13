package ss3_mang_va_phuong_thuc_trong_java.BaiTap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(check(str));
    }

    public static char[] check(String str){
        Set<Character> characters = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    characters.add(str.charAt(i));
                }
            }
        }
        char[] temp = new char[characters.size()];
        int i = 0;
        for (Character character: characters) {
            temp[i] = character;
            i++;
        }

        return temp;
    }
}
