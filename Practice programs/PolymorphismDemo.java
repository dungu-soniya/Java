class Sum {

    
    int add(int a, int b) {
        return a + b;
    }

    
    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        Sum s = new Sum();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
    }
}
