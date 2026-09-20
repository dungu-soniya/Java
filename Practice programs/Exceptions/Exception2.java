import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2{
    public static void main(String[] args) {
        try {
            File file = new File("abc.txt");
            Scanner sc = new Scanner(file);
            System.out.println(sc.nextLine());
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
}
