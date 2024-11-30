package week9.Interface;

public class Dog extends Animal {
    // private int age;
    private String name;
  
    // implicitly empty constructor
    public Dog() {
      // super(); // call the parent constructor
    }
  
    public Dog(int age) {
      super(age);
    }
  
    public Dog(int age, String name) {
      // this.age = age;
      super(age); // call the parent constructor
      // super();
      // ! super() go first
      this.name = name;
    }
  
    public void barking() {
      System.out.println("I am barking ...");
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public String getName() {
      return this.name;
    }
  
    @Override
    public String toString() {
      return "Dog[" //
          + "age=" + super.getAge() //
          + ",name=" + this.name //
          + "]";
    }
  
    public static void main(String[] args) {
      // 1. constructor
      // call parent constructor to create Animal object,
      // and then associate the Dog object with the Animal Object
      Dog d1 = new Dog(13, "Sally");
      System.out.println(d1.getAge()); // 13
  
      // 2. setter
      d1.setAge(10);
      // d1.age; // ERROR, because age is PRIVATE attribute in parent class
  
      System.out.println(d1.getAge()); // 10
  
      // new Dog();
  
  
      Dog d2 = new Dog(18, "Tommy");
      d2.setAge(17);
      Dog d3 = d1;
      d3.setAge(18);
      System.out.println(d3); // sally 18
      System.out.println(d1); // sally 18
  
      // ! We just have dog objects here and 1 dog array object and 2 object references
      Dog[] dogs1 = new Dog[] {new Dog(1, "abc"), new Dog(9, "def")};
      Dog[] dogs2 = dogs1;
  
      dogs2[1].setName("Vincent");
      System.out.println(dogs2[1].getName()); // Vincent
      System.out.println(dogs1[1].getName()); // Vincent
    }
  }