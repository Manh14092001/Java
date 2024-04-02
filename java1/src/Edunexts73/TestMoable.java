package Edunexts73;
import Edunexts72.MovablePoint;
public class TestMoable {
    public static void main(String[] args) {
        MovableCircle movecircle = new MovableCircle(1,1,1,2,2);

        System.out.println("Intinial postion: (" + movecircle.getX() + ", " + movecircle.getY() + ")");
        movecircle.moveUp();

        System.out.println("After moving up: (" + movecircle.getX() + ", " + movecircle.getY() + ")");
        movecircle.moveUp();

        System.out.println("After moving right: (" + movecircle.getX()+ ", " + movecircle.getY() + ")");
        movecircle.moveRight();
    }
}
