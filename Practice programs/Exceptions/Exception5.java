public class Exception5 {
    public static void main(String[] args) {
        try {
            String name = "Java";
            System.out.println(name.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("String index is out of bounds");
        }
    }
}
