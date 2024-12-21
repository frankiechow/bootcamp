package week11;

import java.util.Comparator;

public class OrderByColor implements Comparator<Ball> {
    // RED -> WHITE -> BLUE
    @Override
    public int compare(Ball b1, Ball b2) {
      // b1 (-1) vs b2 (1)
      if (b1.getColor() == Color.RED)
        return -1;
      if (b2.getColor() == Color.RED)
        return 1;
      if (b1.getColor() == Color.WHITE && b2.getColor() == Color.BLUE)
        return -1;
      if (b1.getColor() == Color.BLUE && b2.getColor() == Color.WHITE)
        return 1;
      return -1;
    }
  }
