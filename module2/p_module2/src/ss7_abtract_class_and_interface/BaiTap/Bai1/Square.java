package ss7_abtract_class_and_interface.BaiTap.Bai1;

import ss7_abtract_class_and_interface.BaiTap.Bai1.Shape;

public class Square extends Shape {
    private double a =5.0;
    public Square(){};
    public Square(double a){
        this.a=a;
    }public Square(double a,String color,boolean filled){
        super(color,filled);
        this.a=a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
    public double getArea(){
        return a*a;
    }
    public double getPerimeter(){
        return 4*a;
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public void resize(double persen) {
        a += persen;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");;
    }
}
