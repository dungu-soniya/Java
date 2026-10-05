import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        System.out.println(fruits);
        fruits.addFirst("Orange");
        fruits.addLast("Grapes");
        System.out.println(fruits);
        fruits.remove("Banana");
        System.out.println(fruits);
    }
}
