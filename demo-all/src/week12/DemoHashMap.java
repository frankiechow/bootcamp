package week12;

import java.util.HashMap;
import java.util.Map;

public class DemoHashMap {
    public static void main(String[] args) {
        // underlying structure of hashmap: array + linked list

    HashMap<String, String> hm1 = new HashMap<>();
    hm1.put("1", "vincent"); // put one entry into the hashmap
    hm1.put("2", "lucas"); // put one entry into the hashmap
    hm1.put("3", "steven"); // put one entry into the hashmap
    System.out.println(hm1.size()); // 3 entires in total

    // <String, String>
    // <key, value>, key cannot be repeated.
    hm1.put("2", "lydia"); // override the entry (because they have same key)
    System.out.println(hm1.get("2")); // lydia
    System.out.println(hm1.size()); // 3 entires in total
    System.out.println(hm1.get("10")); // null

    // loop
    for (Map.Entry<String, String> entry : hm1.entrySet()) {
      System.out.println(entry.getKey() + " " + entry.getValue());
    }
    // 1 vincent
    // 2 lydia
    // 3 steven

    for (String key : hm1.keySet()) {
      System.out.println(key);
    }

    for (String value : hm1.values()) {
      System.out.println(value);
    }

    hm1.remove("2");
    System.out.println(hm1); // {1=vincent, 3=steven}
  }
}
