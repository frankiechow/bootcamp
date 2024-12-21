package week11;

import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.add(100);
        pq.add(1);
        pq.add(89);
        pq.add(10);
        // System.out.println(pq); // [1, 10, 89, 100]
        for (Integer integer : pq) {
          System.out.println(integer);
        }
        System.out.println(pq.poll()); // 1
        System.out.println(pq.poll()); // 10
        System.out.println(pq.poll()); // 89
        System.out.println(pq.poll()); // 100
    
        // RED -> WHITE -> BLUE
        Queue<Ball> bq = new PriorityQueue<>(new OrderByColor());
        bq.add(new Ball(Color.BLUE, 3.2));
        bq.add(new Ball(Color.RED, 7.6));
        bq.add(new Ball(Color.WHITE, 3.9));
        bq.add(new Ball(Color.RED, 1.2));
        System.out.println(bq.poll()); // Ball[color=RED,size=1.2]
        System.out.println(bq.poll()); // Ball[color=RED,size=7.6]
        System.out.println(bq.poll()); // Ball[color=WHITE,size=3.9]
        System.out.println(bq.poll()); // Ball[color=BLUE,size=3.2]
    
      }
    }
