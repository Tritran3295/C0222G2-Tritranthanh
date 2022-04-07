package ss5_access_modifier_static_method_static_property.BaiTap.Circle;

import ss5_access_modifier_static_method_static_property.BaiTap.Circle.Circle;

import java.util.Scanner;

public class MainCircle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter radius : ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r) ;
        System.out.print( circle + "\n"+  "S = "+circle.getArea());
    }
}
