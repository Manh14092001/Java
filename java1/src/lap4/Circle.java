package lap4;

public class Circle {
    private double radius;
    private String color;
     public Circle(double raidus, String color) {
         this.radius = raidus;
         this.color = color;
     }
     public double getRadius(){
         return radius;
     }
     public String getColor(){
         return color;
     }
     public double getArena(){
         return Math.PI * radius * radius;
     }
     public String toString(){
         return "Circle[raidus=" + radius + "color=" + color + "j";
     }
}
