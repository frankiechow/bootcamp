package week10;

import java.util.ArrayList;
import java.util.List;

public class DemoArrayList {
  public static void main(String[] args) {
    // Array
    // ! disadvantages
    // 1. Define length of array (The length is static)
    // 2. For modification, you have to locate the position of array
    String[] arr = new String[] {"hello", "abc", "def", "abc"};
    System.out.println(arr[2]); // def
    arr[1] = "bye";
    for (int i = 0; i < arr.length; i++) {
      if (arr[i].equals("abc"))
        arr[i] = "ijk";
    }

    // ArrayList
    // ! Dynamic Length
    ArrayList<String> strings = new ArrayList<String>();
    // "new ArrayList<String>()" -> create an ArrayList of String object
    // "ArrayList<String> strings" -> ArrayList of String object reference

    // After Java 1.5 (200x)
    ArrayList<String> strings2 = new ArrayList<>(); // ! ArrayList.class ->
                                                    // underlying structure ->
                                                    // array
    strings2.add("hello");
    strings2.add("abc");
    strings2.add("def");
    strings2.add("abc");
    System.out.println(strings2.size()); // 4, similar to array.length
    strings2.remove("abc");
    System.out.println(strings2.size()); // 3
    strings2.add("abc");

    ArrayList<String> toBeDeleted = new ArrayList<>();
    toBeDeleted.add("abc");
    toBeDeleted.add("hello");

    System.out.println(strings2); // [hello, def, abc, abc]
    strings2.removeAll(toBeDeleted);
    System.out.println(strings2); // [def]

    strings2.clear(); // ArrayList object still exist
    System.out.println(strings2.size()); // 0

    strings2 = null; // removed ArrayList object
    // strings2.add("ijk"); // run time error, NPE (null pointer exception)

    List<String> strings3 = new ArrayList<>();
    strings3.add("hello");
    strings3.add("abc");
    System.out.println(strings3.get(1)); // abc (array[1])
    // System.out.println(strings3.get(2));
    strings3.remove("hello"); // array
    System.out.println(strings3.get(0)); // abc

    // Integer, Boolean

    // List<Customer> customers = new ArrayList<>();
    // customers.add(new Customer());

    long before = System.currentTimeMillis();
    int x = 0;
    for (int i = 0; i < 10_000_000; i++) {
      // x++;
    }
    long after = System.currentTimeMillis();
    System.out.println(after - before); // 4 ms

  }
}