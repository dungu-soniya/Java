import java.util.ArrayDeque;

public class ArrayDeque {
    public static void main(String[] args) {

        ArrayDeque<String> dq = new ArrayDeque<>();

        dq.add("Apple");
        dq.add("Banana");
        dq.add("Mango");

        System.out.println("ArrayDeque: " + dq);

        dq.addFirst("Orange");
        dq.addLast("Grapes");

        System.out.println("After adding: " + dq);

        dq.removeFirst();
        dq.removeLast();

        System.out.println("After removing: " + dq);
        System.out.println("First element: " + dq.peekFirst());
        System.out.println("Last element: " + dq.peekLast());
    }
}
