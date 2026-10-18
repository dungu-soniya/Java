
import java.util.Hashtable;

public class HashtableDemo {
    public static void main(String[] args) {
        Hashtable<Integer, String> table = new Hashtable<>();

        table.put(101, "Soniya");
        table.put(102, "Ravi");
        table.put(103, "Priya");

        System.out.println("Hashtable: " + table);
        System.out.println("Value for key 101: " + table.get(101));

        table.remove(102);

        System.out.println("After removal: " + table);
        System.out.println("Size: " + table.size());
    }
}
