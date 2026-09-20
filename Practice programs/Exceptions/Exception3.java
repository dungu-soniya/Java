public class Exception3 {
    public static void main(String[] args) {
        try {
            Thread.sleep(-1000);
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid argument");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted");
        }
    }
}
