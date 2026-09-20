public class Exception4 {
    public static void main(String[] args) {
        try {
            Object obj = "Hello";
            Integer number = (Integer) obj;
            System.out.println(number);
        } catch (ClassCastException e) {
            System.out.println("Invalid type casting");
        }
    }
}
