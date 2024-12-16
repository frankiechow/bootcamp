package week12;

import java.util.ArrayList;
import java.util.List;

import week6.Array;

public class DemoGenerics {
    public static void main(String[] args) {
        // Java 1.5 -> List<T> (Generics)
        List<String> strings = new ArrayList<>();
        // string.add(13);
        //before Java 1.5
        List strings2 = new ArrayList<>();
        strings2.add("strings2");
        Object obj = strings2.get(0);
        String s = (String) obj;
        System.out.println(s.charAt(2));

    }
}
