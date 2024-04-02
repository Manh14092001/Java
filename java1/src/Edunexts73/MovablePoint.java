package Edunexts73;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;
    public  MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x=x;
        this.y=y;
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }
    public int getX(){
        return x;
    }
    public void setX(int X){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int Y){
        this.y=y;
    }
    public int getxSpeed(){
        return xSpeed;
    }
    public void setxSpeed(int xSpeed){
        this.xSpeed = xSpeed;
    }
    public int getySpeed(){
        return ySpeed;
    }
    public void getySpeed(int ySpeed){
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "MovablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed +'}';
    }
}
