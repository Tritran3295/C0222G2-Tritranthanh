package ss6_ke_thua.BaiTap.PointAndMoveavlePoint;

import ss6_ke_thua.BaiTap.LopPoint2DandPoint3D.Point3D;

public class Point {
    private float x = 5.0f;
    private float y = 6.0f;

    public Point() {
    }
    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }public void setXY(float x,float y){
        this.x=x;
        this.y=y;
    }public float[] getXY(){
        float[]arr=new float[2];
        arr[0]=x;
        arr[1]=y;
        return arr;
    }

    @Override
    public String toString() {
        return "Point" +
                "x=" + x +
                ", y=" + y +
                "";
    }
}
