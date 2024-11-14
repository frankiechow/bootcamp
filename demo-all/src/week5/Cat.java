package week5;

import week6.Dog;

public class Cat {
  private String name; // Attribute
  private int age; // Attribute
  private String gen;

  // Java: Instance = Object
  // Instance Method
  public String getName(){
    return this.name;
  }
  // Instance Method
  public void setName(String x){
    this.name = x;
  }

  public int getAge(){
    return this.age;
  }
  public void setAge(int y){
    this.age = y;
  }

  public String getGen(){
    return this.gen;
  }
  public void setGen(String z){
    this.gen = z;
  }

  public static void main(String[] args) {
    String s = "hello"; // create a String object
    String s2 = new String("hello"); // create a String object
    String s3 = String.valueOf("hello"); // create a String object
    System.out.println(s3.charAt(0)); // h

    Cat c = new Cat(); // create a cat object
    c.setName("Frankie");
    System.out.println(c.getName()); // Frankie
    c.setAge(18);
    System.out.println("age: " + c.getAge()); // 18
    c.setName("lsc");
    System.out.println("rename: " + c.getName()); // lsc
    System.out.println();

    Cat c2 = new Cat(); // create a cat object
    c2.setName("Ching");
    System.out.println("name: " + c2.getName());

    c2.setAge(87);
    c2.setGen("Lady");
    System.out.println("age: " + c2.getAge());
    System.out.println("gen: " + c2.getGen());

    c2.setName(new String("487"));

    // 8 primitives are not an object (int x = 3, x is not an object)
    // 8 wrapper class are object (Integer x = 3, x is an object)
    Integer y = 3;
    y.doubleValue(); // 3.0
    y.longValue(); // 3L
    
  }
}
