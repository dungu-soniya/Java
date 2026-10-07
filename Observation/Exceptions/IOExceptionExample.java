import java.io.*;

public class IOExceptionExample {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("abc.txt");
            f.close();
        } catch (IOException e) {
            System.out.println("Input/Output error occurred");
        }
    }
}
