package ss13_thuat_toan_tim_kiem.BaiTap;

import java.util.LinkedList;
import java.util.Scanner;

public class FindString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Thỉnh nhập chuỗi");
        String str = input.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i <str.length() ; i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(str.charAt(i));
            for (int j = i+1;j<str.length();j++){
                if(str.charAt(j)>list.getLast()){
                    list.add(str.charAt(j));
                }
            }if(list.size()> max.size()){
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }for(Character x:max){
            System.out.println(x);
        }

    }
}
