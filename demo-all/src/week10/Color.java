package week10;

public enum Color {
    RED('R'), //
    YELLOW('Y'), //
    BLACK('B'), //
    ;
  
    // ! Usually we use final for enum
    private final char value;
  
    // enum has constructor
    // ! For enum, you should use "private" for constructor (For JVM)
    private Color(char value) {
      this.value = value;
    }
  
    public char getValue() {
      return this.value;
    }
  
    // public void setValue(char value) {
    //   this.value = value;
    // }
  
    // ! Everytime you press the "Run" button:
    // 1. Load the classes to the memory
    // - For enum, JVM will help create an unique object(s) before executing the main
    // method
    // - In memory, there are only 3 color objects. RED, YELLOW and BLACK
  
    public static void main(String[] args) {
      String red1 = "RED";
      String red2 = "red";
      String red3 = "Red";
      String red4 = new String("RED");
      System.out.println(red1.equals(red3)); // false
      System.out.println(red1.equals(red4)); // true, because Override Object.equals()
      System.out.println(red1 == red4); // false
      // String.class extends Object.class
      // ! What if String.class did not Override eqauls()? -> Object.equals()
  
      // Never to create enum object by yourself
      // new Color()
      Color red10 = Color.RED;
      Color red11 = Color.RED;
      System.out.println(red10 == red11); // true
  
      // ! We always use "==" to compare enum value
      if (red11 == Color.BLACK) {
        System.out.println("its black.");
      } else {
        System.out.println("its not black.");
      }
  
      // ! Normally we don't use equals() for enum
      if (red11.equals(Color.RED)) {
        System.out.println("Its Red"); // print
      }
  
      System.out.println(red11.getValue()); // R
      System.out.println(Color.YELLOW.getValue()); // Y
  
      
      // Color.BLACK.setValue('A');
      // System.out.println(Color.BLACK.getValue()); // A
  
    }
  }