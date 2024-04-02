package lap4;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double radius,String color, double height) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight(){
        return  height;
    }
    public double getVolume(){
        return getArena() * height;
    }
    @Override
    public double getArena(){
        return 2 * Math.PI * getRadius() * (getRadius() + height);
    }

    @Override
    public String toString() {
        return "Cylinder[" + super.toString() + "height=" + height + "j";
    }

}
