class Animal {
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {
    void play();
}

class Dog extends Animal implements Pet {

    void bark() {
        System.out.println("Dog is barking");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Dog d = new Dog();
        d.eat();
        d.bark();
        d.play();

        Cat c = new Cat();
        c.eat();
        c.meow();
    }
}
