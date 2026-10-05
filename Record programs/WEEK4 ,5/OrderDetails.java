
package ordermanagement;

class Client {

    String name;
    String city;

    void placeOrder() {
        System.out.println(name + " placed the order.");
    }

    void collectOrder() {
        System.out.println(name + " collected the order.");
    }
}

class Purchase {

    String orderDate;
    String orderId;

    void approve() {
        System.out.println("Order approved.");
    }

    void finish() {
        System.out.println("Order completed.");
    }
}

class UrgentOrder extends Purchase {

    void send() {
        System.out.println("Urgent order sent.");
    }
}

class RegularOrder extends Purchase {

    void send() {
        System.out.println("Regular order sent.");
    }

    void accept() {
        System.out.println("Regular order accepted.");
    }
}

public class OrderDetails {

    public static void main(String[] args) {

        Client customer = new Client();
        customer.name = "Anjali";
        customer.city = "Hyderabad";

        UrgentOrder urgent = new UrgentOrder();
        urgent.orderDate = "15-08-2026";
        urgent.orderId = "U201";

        RegularOrder regular = new RegularOrder();
        regular.orderDate = "15-08-2026";
        regular.orderId = "R202";

        System.out.println("Customer: " + customer.name);
        System.out.println("City: " + customer.city);
        customer.placeOrder();

        System.out.println("\nUrgent Order");
        System.out.println("Date: " + urgent.orderDate);
        System.out.println("Order ID: " + urgent.orderId);
        urgent.approve();
        urgent.finish();
        urgent.send();

        System.out.println("\nRegular Order");
        System.out.println("Date: " + regular.orderDate);
        System.out.println("Order ID: " + regular.orderId);
        regular.approve();
        regular.finish();
        regular.send();
        regular.accept();

        customer.collectOrder();
    }
}
