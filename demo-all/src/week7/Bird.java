package week7;

public class Bird extends Animal{
    // private int age;
  private String name;

  // implicitly empty constructor
  public Bird() {
    // super(); // call the parent constructor
  }

  public Bird(int age) {
    super(age);
  }

  public Bird(int age, String name) {
    // this.age = age;
     super(age); // call the parent constructor
//    super();
    // ! super() go first
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    // 1. constructor
    // call parent constructor to create Animal object,
    // and then associate the Bird object with the Animal Object
    Bird b1 = new Bird(13, "Sally");
    System.out.println(b1.getAge()); // 13

    // 2. setter
    b1.setAge(10);
    // b1.age; // ERROR, because age is PRIVATE attribute in parent class

    System.out.println(b1.getAge()); // 10

    new Bird();
  }
}