import java.util.*;

public class IllegalStateExample {
    public static void main(String[] args) {
        try {
            Iterator<Integer> it =
                Arrays.asList(10, 20).iterator();

            it.remove();
        } catch (IllegalStateException e) {
            System.out.println("Illegal state of object");
        }
    }
}
