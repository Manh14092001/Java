package lap4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(5.0,"red", 2.0);
        System.out.println("Cylinder's volume: " + cylinder.getVolume());
        System.out.println("Cylinder's surface area:" + cylinder.getArena());
        System.out.println(cylinder);
    }
}