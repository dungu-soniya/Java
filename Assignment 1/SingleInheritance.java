class Student {
    void study() {
        System.out.println("Student is studying");
    }
}

public class SingleInheritance extends Student {
    void play() {
        System.out.println("Student is playing");
    }

    public static void main(String[] args) {
        SingleInheritance s = new SingleInheritance();
        s.study();
        s.play();
    }
}
