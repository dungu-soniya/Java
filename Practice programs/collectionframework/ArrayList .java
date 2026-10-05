import java.util.ArrayList;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();

        names.add("Rahul");
        names.add("Priya");
        names.add("John");
        names.add("Rahul");
       
        System.out.println("List: " + names);   
        System.out.println("First element: " + names.get(0));     
        names.set(1, "Anita");
        System.out.println("After update: " + names);       
        names.remove("John");
        System.out.println("After remove: " + names);  
        System.out.println("Size: " + names.size());
        System.out.println("Contains Rahul? " + names.contains("Rahul"));
    }
}
