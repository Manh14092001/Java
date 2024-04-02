package Edunexts72;

public class MovablePoint implements Movable{
    private int x;
    private int y;
    public  MovablePoint(int x, int y){
        this,x=x;
        this,y=y;
    }
    public void moveUp(){
        y++;
    }
    public void moveDown(){
        y--;
    }
    public void moveLeft(){
        x++;
    }
    public void moveRight(){
        x--;
    }

    public int getX() {
        return x;
    }
    public void setX(int X){
        this.x = x;
    }
    public int getY(){
        return y;
    }
    public void setY(int Y){
        this.y = y;
    }
}
