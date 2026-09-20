class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

class EngineeringStudent extends Student {
    void coding() {
        System.out.println("Engineering student is coding");
    }
}

public class HierarchicalInheritance extends Student {
    void drawing() {
        System.out.println("Student is drawing");
    }

    public static void main(String[] args) {
        EngineeringStudent e = new EngineeringStudent();
        HierarchicalInheritance s = new HierarchicalInheritance();

        e.study();
        e.coding();

        s.study();
        s.drawing();
    }
}
