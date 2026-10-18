
import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        dq.addFirst(10);
        dq.addLast(20);
        dq.addFirst(5);
        dq.addLast(30);

        System.out.println("Deque: " + dq);
        System.out.println("First Element: " + dq.peekFirst());
        System.out.println("Last Element: " + dq.peekLast());

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After Removal: " + dq);
    }
}
