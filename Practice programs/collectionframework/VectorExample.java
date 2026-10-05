import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {

        Vector<Integer> numbers = new Vector<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println(numbers);
        numbers.add(1, 15);
        System.out.println("After adding: " + numbers);
        numbers.remove(2);
        System.out.println("After removing: " + numbers);
        System.out.println("Element at index 1: " + numbers.get(1));
    }
}
