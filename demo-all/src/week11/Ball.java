package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
    private Color color;
    private double size;

    public Ball (Color color, double size){
        this.color = color;
        this.size = size;
    }

    public Color getColor(){
        return this.color;
    }
    public Double getSize(){
        return this.size;
    }

    @Override
    public int compareTo(Ball ball){
        // -1 or 1
        // this(-1) vs ball (1)
        if(this.color == ball.getColor())
            return 1;
        if(this.color == Color.BLUE)
            return -1;
        if(ball.getColor() == Color.BLUE)
            return 1;
        if(this.color == Color.RED && ball.getColor() == Color.GREEN)
            return -1;
        if(ball.getColor() == Color.RED && this.color == Color.GREEN)
            return 1;
        return -1;
    }

    public static void main(String[] args) {
        List<Ball> balls = new ArrayList<>();
        balls.add(new Ball(Color.GREEN));
        balls.add(new Ball(Color.RED));
        balls.add(new Ball(Color.BLUE));
        balls.add(new Ball(Color.RED));
        Collections.sort(balls);
        System.out.println(balls);
    }
}
