
import java.util.PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);
        queue.add(5);

        System.out.println("PriorityQueue: " + queue);
        System.out.println("Head element: " + queue.peek());

        System.out.println("Removing elements:");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}
