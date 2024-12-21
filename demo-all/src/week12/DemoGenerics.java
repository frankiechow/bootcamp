package week12;

import java.util.ArrayList;
import java.util.List;

import week12.zoo.Tiger;
import week6.Array;

public class DemoGenerics {
    public static void main(String[] args) {
        // Before Java 1.5
    List strings2 = new ArrayList();
    strings2.add("abc");
    strings2.add(13);
    strings2.add(new Tiger());

    Object obj = strings2.get(0);
    String s = (String) obj;
    System.out.println(s.charAt(2)); // c

    // After Java 1.5 -> List<T> (Generics)
    List<String> strings = new ArrayList<>();
    // strings.add(13);
    // strings.add(new Tiger())

    List<Tiger> tigers = new ArrayList<>();
  }
}
