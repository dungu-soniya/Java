import java.util.PriorityQueue;

public class PriorityQueue {
    public static void main(String[] args) {

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        queue.add(30);
        queue.add(10);
        queue.add(20);

        System.out.println(queue);

        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
    }
}
