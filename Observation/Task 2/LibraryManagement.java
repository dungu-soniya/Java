class Library {
    String bookName;
    String author;
    String studentName;

    void issueBook() {
        System.out.println(studentName + " issued " + bookName);
    }

    void returnBook() {
        System.out.println(studentName + " returned " + bookName);
    }

    void displayDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Author: " + author);
        System.out.println("Student Name: " + studentName);
    }
}

public class LibraryManagement {
    public static void main(String[] args) {

        Library l1 = new Library();

        l1.bookName = "Java Programming";
        l1.author = "James Gosling";
        l1.studentName = "Soniya";

        System.out.println("===== LIBRARY MANAGEMENT SYSTEM =====");

        l1.displayDetails();

        System.out.println("\nBook Issue:");
        l1.issueBook();

        System.out.println("\nBook Return:");
        l1.returnBook();
    }
}
