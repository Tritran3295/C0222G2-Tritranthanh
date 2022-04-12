package ss7_abtract_class_and_interface.BaiTap.Bai1;

public class Rectangle extends Shape {
    private double width = 3.0;
    private double height = 5.0;
    public Rectangle(){};
    public Rectangle(double width,double height){
        this.width=width;
        this.height=height;
    }
    public Rectangle(double width,double height,String color,boolean filled){
        super(color,filled);
        this.height=height;
        this.width=width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return height * width;
    }
    public double getPerimeter(){
        return (height + width)*2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    @Override
    public void resize(double persen) {
        width*= persen;
        height *= persen;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");;
    }
}
