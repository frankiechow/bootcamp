package week9.Interface;

import java.util.Objects;

public class Father extends Family implements Swimable, Walkable{
    private String name;

  public Father(String name) {
    // super();
    this.name = name;
  }

  public Father(String name, double weight, double height) {
    super(height, weight);
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public void drive() {
    System.out.println("Father is driving ...");
  }

  // ! If you write down the @Override here ...
  // 1. Compiler will help check the parent class, ensure there is same method
  // for overriden
  // 2. Readability
  @Override
  public void swim() {
    System.out.println("Father is swimming ...");
  }

  @Override
  public void walk() {
    System.out.println("Father is walking ...");
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!(obj instanceof Father))
      return false;
    Father father = (Father) obj;
    return Objects.equals(father.getName(), this.name)
        && Objects.equals(father.getHeight(), super.getHeight())
        && Objects.equals(father.getWeight(), super.getWeight());
  }

  // ! Java case-senitive on method name
  @Override
  public int hashCode() {
    return Objects.hash(this.name, super.getHeight(), super.getWeight());
  }

  public static void main(String[] args) {
    System.out.println(Swimable.x); // 10 (public static)

    // Poly
    Swimable father = new Father("Oscar");
    // ! During compile time, only swim() method is VISIBLE for father object.
    father.swim();
    // father.walk();
    Walkable father2 = new Father("Steve");
    father2.walk();
    // father2.swim();

    // Father & Walkable has relationship
    // Father & Swimable has relationship
    // ! Walkable & Swimable has NO relationship
    // Walkable father3 = father;

    // Father father4 = father; // Compiler this "father" may not be a Father
    // object
    // ! if you insist and confirm the "father" is a Father Object, and you want
    // to convert its type.
    Father father4 = (Father) father;
    father4.swim();
    father4.walk();

    Walkable father5 = father4;
    father5.walk();
    // father5.swim();

    // ! Not a good practice
    Swimable father6 = (Father) father5; 
    // 2 risks:
    // from walkable object -> Father
    // Object -> Swimable

    System.out.println(Swimable.sum(10, 2)); // 12

    Father father7 = new Father("Peter");
    father7.eat(); // eat() method inside the interface

    new Father("Kenny").eat(); // eat() method inside the interface

    // Swimable.eat() // eat method is an instance method

    // ! Swimable vs Grandfather (No relationship)
    Family father8 = (Father) father6; // 1 risk
    // father8.drive(); // drive() method is hidden

  }
}