package week11;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(1);
        pq.add(67);
        pq.add(87);
        for(Integer integer : pq){
            System.out.println(integer); // 1, 87, 67, 100
        }
        System.out.println(pq.poll()); // 1
        System.out.println(pq.poll()); // 67
        System.out.println(pq); // 87, 100

    }
}
