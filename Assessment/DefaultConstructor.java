class Student {
    String name;
    int age;

    // Default Constructor
    Student() {
        name = "Soniya";
        age = 18;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();
    }
}
