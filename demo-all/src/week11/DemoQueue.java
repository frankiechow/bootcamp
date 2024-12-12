package week11;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import week6.Array;

public class DemoQueue {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();
        q1.add("Frankie");
        q1.add("Ching");
        q1.add("Elmo");
        String head = q1.poll(); // similar to removeFirst
        System.out.println(head); // Frankie
        System.out.println(q1.size()); // 2

        q1.add("Anthony");

        //while
        while(!q1.isEmpty()){
            head = q1.poll();
            System.out.println(head);
        }
        System.out.println(q1.poll()); // null

        q1.add("abc");
        q1.add("def");
        q1.add("ijk");
        while(q1.size() != 0){
            head = q1.poll();
            System.out.println("before size: " + head); 
            q1.add("hello");
            if(q1.size() == 3){
                break;
            }
            System.out.println("after size:" + head);
        }
        System.out.println(q1.size()); // 3

        // for-each loop: we cannot modify the elements inside the list/queue/set...
        // for(String str : q1){
        //     q1.add("ac");
        // }
        System.out.println(q1.peek()); // def

        List<String> ss = new ArrayList<>();
        ss.add("abc");
        ss.add("ijk");
        for(String s : ss){
            // ss.set(1, "Frankie"); // abc, Frankie
            ss.remove("abc");
            System.out.println("hello " + s);
        }
        System.out.println(ss); // ijk

        Deque<String> dq1 = new LinkedList<>();
        dq1.add("aaa");
        dq1.add("bbb");
        dq1.add("ccc");
        System.out.println(dq1.pollFirst()); // aaa
        System.out.println(dq1.pollLast()); // ccc
        dq1.addFirst("xxx");
        dq1.addLast("zzz");
        System.out.println(dq1); // [xxx, bbb, zzz]
        System.out.println(dq1.peekFirst()); // xxx
        System.out.println(dq1.peekLast()); // zzz
        System.out.println(dq1.pop()); // xxx
        System.out.println(dq1); // [bbb, zzz]
        dq1.push("mmm");
        System.out.println(dq1); // [mmm, bbb, zzz]

        // ArrayDeque
        Deque<Double> doubles = new ArrayDeque<>();
        doubles.add(10.3);
        doubles.addFirst(11.1);
        doubles.add(12.7);
        System.out.println(doubles); // [11.1, 10.3, 12.7]
        System.out.println(doubles.pollLast()); // 12.7

    }
}
