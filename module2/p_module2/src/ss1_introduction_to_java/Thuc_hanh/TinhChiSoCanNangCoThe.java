package ss1_introduction_to_java.Thuc_hanh;

import java.util.Scanner;

public class TinhChiSoCanNangCoThe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double weight,height,bmi;
        System.out.print("Your weight (in kilogam)");
        weight=scanner.nextDouble();
        System.out.print("Your height (in meter)");
        height=scanner.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");
        if(bmi<18){
            System.out.printf("%-20s%s",bmi,"UnderWeight");
        }else if(bmi<25.0){
            System.out.printf("%-20s%s",bmi,"Normal");
        }else  if(bmi<30.0){
            System.out.printf("%-20s%s",bmi,"OverWeight");
        }else {
            System.out.printf("%-20s%s",bmi,"Obese");
        }
    }
}
