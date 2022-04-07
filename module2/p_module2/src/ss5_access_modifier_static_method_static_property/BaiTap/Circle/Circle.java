package ss5_access_modifier_static_method_static_property.BaiTap.Circle;

public class Circle {
    private double radius =1.0;
    private String color="red";
    final double PI = 3.141593;
    public Circle(){};
    public Circle(double radius){
        this.radius= radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double getArea(){
        return radius*radius*PI;
    }

    @Override
    public String toString() {
        return "Circle: " +
                "radius=" + radius +"\n"+
                "color: " + color + '\'';
    }
}
