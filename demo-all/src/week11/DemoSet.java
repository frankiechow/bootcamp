package week11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DemoSet {
    public static void main(String[] args) {
        Collection<String> strings = new ArrayList<>();
        strings.add("abc");
        strings.add("def");
        strings.add("abc");
        strings.remove("def");
        System.out.println(strings.size()); // 2

        Set<String> s1 = new HashSet<>();
        s1.add("abc");
        s1.add("abc");
        System.out.println(s1.size()); // 1, Set avoid duplicated

        if(s1.add("abc")){
            System.out.println("add success");
        }else{
            System.out.println("add fail");
        }

        if(s1.add("ijk")){
            System.out.println("add success");
        }else{
            System.out.println("add fail");
        }
    }
}
