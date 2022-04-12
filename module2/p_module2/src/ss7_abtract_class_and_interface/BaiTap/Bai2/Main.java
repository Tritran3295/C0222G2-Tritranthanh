package ss7_abtract_class_and_interface.BaiTap.Bai2;

import ss7_abtract_class_and_interface.BaiTap.Bai1.Circle;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Rectangle;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Shape;
import ss7_abtract_class_and_interface.BaiTap.Bai1.Square;

public class Main {
    public static void main(String[] args) {
        Shape []shape = new Shape[3];
        shape[0]=new Circle(5,"blue",true);
        shape[1]=new Square(6,"red",true);
        shape[2]=new Rectangle(5,5,"white",true);
        for (Shape a:shape) {
            
        }

    }
}
