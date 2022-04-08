package ss6_ke_thua.BaiTap.LopCircleAndCylinder;

import ss6_ke_thua.BaiTap.LopCircleAndCylinder.Circle;

public class Cylinder extends Circle {
    private double height = 7;
    public Cylinder(){};
    public Cylinder(double height){
        this.height=height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume(){
        return getRadius() * getRadius() * height * Math.PI;
    }

    @Override
    public String toString() {
        return " A Cylinder with height" +
                 height +
                "Cylinder Volume = "+getVolume();
    }
}
