import java.util.HashMap;

public class HashMap {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(101, "Soniya");
        map.put(102, "Reshma");
        map.put(103, "Anjali");

        System.out.println("HashMap: " + map);

        System.out.println("Student 101: " + map.get(101));

        map.remove(102);

        System.out.println("After removing: " + map);
        System.out.println("Contains key 103: " + map.containsKey(103));
    }
}
