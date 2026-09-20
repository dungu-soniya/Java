public class ThrowsDemo {

    static void check() throws Exception {
        throw new Exception("Exception occurred");
    }

    public static void main(String[] args) {
        try {
            check();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
