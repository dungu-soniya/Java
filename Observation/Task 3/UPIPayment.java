class Wallet {
    String name;
    double balance;

    void addMoney(double amount) {
        balance = balance + amount;
        System.out.println("Money added: Rs." + amount);
    }

    void makePayment(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Payment successful: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: Rs." + balance);
    }
}

public class UPIPayment {
    public static void main(String[] args) {

        Wallet w1 = new Wallet();

        w1.name = "Soniya";
        w1.balance = 2000;

        System.out.println("===== UPI PAYMENT AND DIGITAL WALLET =====");

        w1.displayBalance();

        System.out.println("\nAdding Money:");
        w1.addMoney(1000);

        System.out.println("\nMaking Payment:");
        w1.makePayment(500);

        System.out.println("\nFinal Balance:");
        w1.displayBalance();
    }
}
