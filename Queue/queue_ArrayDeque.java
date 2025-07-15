import java.util.*;
public class queue_ArrayDeque {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();

        q.offer(10);
        q.offer(20);
        q.offer(30);

        System.out.println(q);
        System.out.println("Front : "+q.peek());
        System.out.println("Dequeued : "+q.poll());
        System.out.println("Queue after Dequeue : "+q);
    }
}
