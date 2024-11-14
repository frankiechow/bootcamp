package week7;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle {
    private double radius; // non-static & non-final -> instance varable
    private String label;

    public static final double PI = 3.141592653589793;

    // belongs to class, but 
    private static String color = "RED";
    private static int count = 0;
    private final int number = 10;

    // empty constructor -> no parameters
    public Circle(){
        this.radius = 10.0;
        this.label = color + "_" + ++count; // RED1, RED2, RED3
    }
    public Circle(double radius){
        this.radius = radius;
        this.label = color + "_" + ++count;
    }
    public static void setColor(String newColor){
        color = newColor;
    }
    public double getRadius() {
        return this.radius;
      }
    
      public void setRadius(double radius) {
        this.radius = radius;
      }

      public String getLable() {
        return this.label;
      }

    public double area() {
        return BigDecimal.valueOf(this.radius) //
            .multiply(BigDecimal.valueOf(this.radius)) //
            .multiply(BigDecimal.valueOf(Math.PI)) //
            .setScale(2, RoundingMode.UP).doubleValue();
      }

    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.setRadius(3.5);
        System.out.println(c1.getRadius());
        System.out.println(c1.area()); // 38.48451000647496 ~ 38.49
        System.out.println(c1.getLable()); // RED_1

        Circle.setColor("GREEN");
        Circle c4 = new Circle();
        System.out.println(c4);
        
    }
}
