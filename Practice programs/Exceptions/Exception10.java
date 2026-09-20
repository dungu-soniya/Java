public class Exception10 {
    public static void main(String[] args) {
        try {
            throw new IllegalStateException("Invalid state");
        } catch (IllegalStateException e) {
            System.out.println("Illegal state exception occurred");
        }
    }
}
