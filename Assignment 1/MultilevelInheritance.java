class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

class CollegeStudent extends Student {
    void attendClass() {
        System.out.println("Student attends class");
    }
}

public class MultilevelInheritance extends CollegeStudent {
    void writeExam() {
        System.out.println("Student writes exam");
    }

    public static void main(String[] args) {
        MultilevelInheritance s = new MultilevelInheritance();
        s.study();
        s.attendClass();
        s.writeExam();
    }
}
