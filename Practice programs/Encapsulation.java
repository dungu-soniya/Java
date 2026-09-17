package practice;

class Student {
    private String name;
    private int age;

    void setName(String name) {
        this.name = name;
    }
    void setAge(int age) {
        this.age = age;
    }
    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }
}
public class EncapsulationDemo {
    public static void main(String[] args) {

        Student s = new Student();
        s.setName("Soniya");
        s.setAge(19);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
