import java.util.ArrayDeque;

public class ArrayDequeExample {
    public static void main(String[] args) {

        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(10);
        deque.addLast(20);
        deque.addFirst(5);
        deque.addLast(30);

        System.out.println(deque);
        System.out.println("First: " + deque.peekFirst());
        System.out.println("Last: " + deque.peekLast());

        deque.removeFirst();
        deque.removeLast();
        System.out.println("After removal: " + deque);
    }
}
