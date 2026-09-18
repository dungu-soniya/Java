package javacore;

interface Calculator {
    void add();
}
// interface 
class MyCalculator implements Calculator {

    public void add() {
        int a = 15;
        int b = 25;
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        MyCalculator obj = new MyCalculator();
        obj.add();
    }
}
