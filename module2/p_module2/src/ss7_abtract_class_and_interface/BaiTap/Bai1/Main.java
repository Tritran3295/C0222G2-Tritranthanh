package ss7_abtract_class_and_interface.BaiTap.Bai1;

public class Main {
    public static void main(String[] args) {
        int x = (int)(Math.random()*100);
        Shape[] shape = new Shape[3];
        shape[0] = new Circle(x);
         shape[1]= new Square(x);
         shape[2]=new Rectangle(x,x);
        for (Shape a: shape) {
            System.out.println(a);
        }

        shape[0].resize(Math.random()*100);
        System.out.println(shape[0]);
        shape[1].resize(Math.random()*100);
        System.out.println(shape[1]);
        shape[2].resize(Math.random()*100);
        System.out.println(shape[2]);
    }
}
