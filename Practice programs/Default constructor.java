class Book {
    String title;
    double price;

    // Default constructor
    Book() {
        title = "Java Programming";
        price = 450.50;
    }
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Book Price: " + price);
    }
    public static void main(String[] args) {
        Book b1 = new Book();
        b1.display();
    }
}
