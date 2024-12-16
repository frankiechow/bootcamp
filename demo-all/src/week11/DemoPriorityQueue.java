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

        // RED -> WHITE -> BLUE
        Queue<Ball> bq = new PriorityQueue<>(new OrderByColor());
        bq.add(new Ball(Color.BLUE, 3.2));
        bq.add(new Ball(Color.RED, 7.6));
        bq.add(new Ball(Color.WHITE, 3.9));
        bq.add(new Ball(Color.RED, 1.2));
        System.out.println(bq.poll());
        System.out.println(bq.poll());
        System.out.println(bq.poll());
        System.out.println(bq.poll());

    }
}
