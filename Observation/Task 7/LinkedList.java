import java.util.LinkedList;

public class LinkedList {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Apple");
        list.add("Banana");
        list.add("Mango");

        System.out.println("LinkedList: " + list);

        list.addFirst("Orange");
        list.addLast("Grapes");

        System.out.println("After adding: " + list);

        list.removeFirst();
        list.removeLast();

        System.out.println("After removing: " + list);
    }
}
