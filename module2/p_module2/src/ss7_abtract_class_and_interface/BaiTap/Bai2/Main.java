package ss7_abtract_class_and_interface.BaiTap.Bai2;

import ss7_abtract_class_and_interface.BaiTap.Bai1.Circle;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Rectangle;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Shape;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Square;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Square(6);
        shapes[2] = new Rectangle(5, 5);
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                System.out.println("Area of the Rectangle is:" + ((Rectangle) shape).getArea());
            }if(shape instanceof Circle){
                System.out.println("Area of the Circle is:"+ ((Circle)shape).getArea());
            }if(shape instanceof Square){
                System.out.println("Area of the Square is :"+((Square)shape).getArea());
                ((Square)shape).howToColor();
            }

        }
    }
}
