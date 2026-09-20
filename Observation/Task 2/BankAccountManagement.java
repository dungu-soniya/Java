class BankAccount {
    String name;
    int accountNumber;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Amount deposited: Rs." + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Amount withdrawn: Rs." + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: Rs." + balance);
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {

        BankAccount b1 = new BankAccount();

        b1.name = "Soniya";
        b1.accountNumber = 101;
        b1.balance = 5000;

        System.out.println("===== BANK ACCOUNT MANAGEMENT SYSTEM =====");

        b1.displayDetails();

        System.out.println("\nDeposit:");
        b1.deposit(2000);

        System.out.println("\nWithdraw:");
        b1.withdraw(1000);

        System.out.println("\nFinal Account Details:");
        b1.displayDetails();
    }
}
