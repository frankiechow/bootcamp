package week5;

public class Catest {
    public static void main(String[] args) {
        String s = "hello"; // create a String object
        String s2 = new String("hello"); // create a String object
        String s3 = String.valueOf("hello"); // create a String object
        System.out.println(s3.charAt(0)); // h
    
        Cat c = new Cat(); // create a cat object
        c.setName("Frankie");
        System.out.println(c.getName()); // Frankie
        Cat c2 = new Cat(); // create a cat object
        c2.setName("Ching");
        System.out.println(c2.getName());
    
      }
}
