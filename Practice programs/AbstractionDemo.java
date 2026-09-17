package practice;

abstract class Vehicle {
    abstract void start();

    void stop() {
        System.out.println("Vehicle stopped");
    }
}
public class AbstractionDemo extends Vehicle {

    void start() {
        System.out.println("Vehicle started");
    }
    public static void main(String[] args) {

        AbstractionDemo v = new AbstractionDemo();
        v.start();
        v.stop();
    }
}
