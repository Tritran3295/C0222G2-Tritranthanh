package ss6_ke_thua.BaiTap.LopPoint2DandPoint3D;

public class Point3D extends Point2D{
    protected float z =6.0f;
    public Point3D(){};
    public Point3D(float x,float y,float z){
        this.z=z;
        this.x=x;
        this.y=y;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }public void setXYZ(float x,float y,float z){
        this.z=z;
        this.x=x;
        this.y=y;
    }public float[] getXYZ(){
        float[] arr2 = new float[3];
        arr2[0]=x;
        arr2[1]=y;
        arr2[2]=z;
                return arr2;
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "(x,y,z)" +(getX()+ "" +getY()+""+getZ());
    }
}
