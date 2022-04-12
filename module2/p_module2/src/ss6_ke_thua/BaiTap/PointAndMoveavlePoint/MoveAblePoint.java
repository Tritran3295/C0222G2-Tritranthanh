package ss6_ke_thua.BaiTap.PointAndMoveavlePoint;

public class MoveAblePoint extends Point {
    private float xSpeed=15.7f;
    private float ySpeed=12.3f;
    public MoveAblePoint(){};

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }public void setSpeech(float xSpeed,float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }public float [] getSpeed(){
        float []arr= new float[2];
        arr[0]=xSpeed;
        arr[1]=ySpeed;
        return arr;
    }
   public MoveAblePoint move(){
        this.setX(this.getX()+ this.xSpeed);
        this.setY(this.getY()+ this.ySpeed);

        return this;
   }

    @Override
    public String toString() {
        return "MoveAblePoint" +
                "(x,y),speed=(xs,ys)" + " "+(getX()+" "+getY())+","+"speed" +"="+(xSpeed+" "+ySpeed)
                ;
    }
}
