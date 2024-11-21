package week7;

public abstract class Animal {
    private int age;
  
    public Animal() {
  
    }
  
    public Animal(int age) {
      this.age = age;
    }
  
    public int getAge() {
      return this.age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    public static void main(String[] args) {
      // ! 1. Constructor can be used for object creation
      // Animal a1 = new Animal(3); // cannot be "new" after "abstract"
      // ! 2. Parent class Constructor can be used by child class
      Bird b1 = new Bird(3); // super(3)
      b1.setAge(3);
  
      // ! Abstract Class 
      // 1. Cannot be "new"
      // 2. Share the common attribute (private attribute, public method)
      // 3. parent constructor can be used by child class
      // 4. parent object instance method can be accessed by the child object
      // 5. Define abstract methods (without implementation)
    }
  }
