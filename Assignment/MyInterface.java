package javacore;

interface Calculator {
    void add();
}
// interface 
class MyInterface implements Calculator {

    public void add() {
        int a = 15;
        int b = 25;
        System.out.println("Addition: " + (a + b));
    }

    public static void main(String[] args) {
        MyInterface obj = new MyInterface();
        obj.add();
    }
}
