package Bai2.BaiTap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        int number =0;
        while (number<100){
            boolean check = true;
            if(number<2){
                check = false;
            }
            for (int i = 2; i <= Math.sqrt(number) ; i++) {
                if(number % i==0){
                    check= false;
                }i++;
            }if(check){
                System.out.println(number);
            }number++;
        }
    }
}
