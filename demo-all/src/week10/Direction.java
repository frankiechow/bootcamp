package week10;

public enum Direction {
    EAST(1), //
    SOUTH(2), //
    WEST(-1), //
    NORTH(-2), //
    ;
  
    // attribute
    private int value;
  
    private Direction(int value) {
      this.value = value;
    }
  
    public int getValue() {
      return this.value;
    }
  
    // instance method
    public boolean oppsite(Direction direction) {
      return this.value * -1 == direction.getValue();
    }
  
    public static void main(String[] args) {
      System.out.println(Direction.WEST.oppsite(Direction.EAST)); // true
      System.out.println(Direction.WEST.oppsite(Direction.NORTH)); // false
      System.out.println(Direction.NORTH.oppsite(Direction.NORTH)); // false
      System.out.println(Direction.NORTH.oppsite(Direction.SOUTH)); // true
    }
  }
