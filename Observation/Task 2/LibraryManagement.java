class Book {
    private int bookId;
    private String bookName;
    private String author;
    private double price;

    Book() {
        bookId = 0;
        bookName = "Unknown";
        author = "Unknown";
        price = 0;
    }

    Book(int id, String name, String a, double p) {
        bookId = id;
        bookName = name;
        author = a;
        price = p;
    }

    void setBookId(int id) {
        bookId = id;
    }

    int getBookId() {
        return bookId;
    }

    void setBookName(String name) {
        bookName = name;
    }

    String getBookName() {
        return bookName;
    }

    void setAuthor(String a) {
        author = a;
    }

    String getAuthor() {
        return author;
    }

    void setPrice(double p) {
        price = p;
    }

    double getPrice() {
        return price;
    }

    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

class Person {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    Student(String n, int a) {
        super(n, a);
    }
}

class Faculty extends Person {
    Faculty(String n, int a) {
        super(n, a);
    }
}

class Area {
    double area(double side) {
        return side * side;
    }

    double area(double length, double breadth) {
        return length * breadth;
    }
}

class Vehicle {
    void display() {
        System.out.println("Vehicle");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("Car");
    }
}

class Bike extends Vehicle {
    void display() {
        System.out.println("Bike");
    }
}

public class LibraryManagement {
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "James Gosling", 500);
        b1.display();

        Student s = new Student("Soniya", 18);
        s.display();

        Faculty f = new Faculty("Priya", 35);
        f.display();

        Area a = new Area();
        System.out.println("Square Area: " + a.area(5));
        System.out.println("Rectangle Area: " + a.area(5, 4));

        Vehicle v1 = new Car();
        Vehicle v2 = new Bike();
        v1.display();
        v2.display();
    }
}
