package week9.Interface;

public interface Swimable { // contract
  // ! Interface
  // 1. All methods are without implementation (abstract method)
  // 2. No instance variable
  // 3. No Constructor
  // 4. Can hold static variable/ methods

  // ! implicitly public static final
  int x = 10;

  void swim(); //
  
  // ! After Java 8 (2014)
  // 1. static method
  static int sum (int x, int y) {
    return x + y;
  }

  // 2. default method (with implementation)
  default void eat() {
    System.out.println("eat() method inside the interface");
  }

  // ! Assignment
  // 2 classes and at least 2 interfaces
  // attributes, getter, setter, constructor

}