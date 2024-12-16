package week11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ball implements Comparable<Ball>{
  private Color color;
  private double size;

  public Ball(Color color, double size) {
    this.color = color;
    this.size = size;
  }

  public Color getColor() {
    return this.color;
  }

  public double getSize() {
    return this.size;
  }

  // Assignment: BLUE -> RED -> WHITE, if color is same, bigger size go first.
  @Override
  public int compareTo(Ball ball) {
    // -1 or 1
    // this (-1) vs ball (1)
    if (this.color == ball.getColor())
      return 1;
    if (this.color == Color.BLUE)
      return -1;
    if (ball.getColor() == Color.BLUE)
      return 1;
    if (this.color == Color.RED && ball.getColor() == Color.WHITE)
      return -1;
    if (ball.getColor() == Color.RED && this.color == Color.WHITE)
      return 1;
    return -1;
  }

  @Override
  public String toString() {
    return "Ball[" //
        + "color=" + this.color.name() //
        + "]";
  }

  public static void main(String[] args) {
    List<Ball> balls = new ArrayList<>();
    balls.add(new Ball(Color.WHITE, 10.3));
    balls.add(new Ball(Color.RED, 7.9));
    balls.add(new Ball(Color.BLUE, 9.9));
    balls.add(new Ball(Color.RED, 10.0));
    Collections.sort(balls);
    System.out.println(balls); // [Ball[color=BLUE], Ball[color=RED], Ball[color=RED], Ball[color=WHITE]]

    // Comparator
    Collections.sort(balls, new OrderByColor());
    System.out.println(balls);

    // Comparator
    Collections.sort(balls, new OrderBySize());
    System.out.println(balls);
    
  }

}