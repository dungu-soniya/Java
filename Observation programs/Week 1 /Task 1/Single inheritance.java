
   class Person {
    String name = "Soniya";

    void displayName() {
        System.out.println("Name: " + name);
    }
}

class Student extends Person {
    int rollNo = 101;

    void displayRollNo() {
        System.out.println("Roll Number: " + rollNo);
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {

        Student s = new Student();

        s.displayName();
        s.displayRollNo();
    }
}