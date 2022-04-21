package ss7_abtract_class_and_interface.BaiTap.Bai1;

import ss7_abtract_class_and_interface.BaiTap.Bai1.ResizeAble;
import ss7_abtract_class_and_interface.BaiTap.Bai2.Colorable;

public class  Shape implements ResizeAble, Colorable {
    private String color = "red";
    private boolean filled = true;
    public Shape(){};
    public Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        return "A Shape with color of" +
                 color + '\'' +
                ", filled=" + filled +
                '}';
    }

    @Override
    public void resize(double persen) {

    }

    @Override
    public void howToColor() {

    }
}
