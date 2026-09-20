class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class Exception9 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }
    }
}
