package week11.Shape;

import java.math.BigDecimal;

public class Circle extends Shape{
    private double radius;

    @Override
    public double area(){
        return BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(this.radius) //
        .multiply(BigDecimal.valueOf(Math.PI))) //
        .doubleValue();
    }
}
