class Account {
    String accountNumber, accountHolderName, accountType;
    double balance;

    Account(String n, String h, double b, String t) {
        accountNumber = n;
        accountHolderName = h;
        balance = b;
        accountType = t;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: Rs." + amount);
    }

    boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }
        System.out.println("Insufficient balance");
        return false;
    }

    void transfer(Account a, double amount) {
        if (withdraw(amount)) a.deposit(amount);
    }

    void displayAccountDetails() {
        System.out.println(accountNumber + " " + accountHolderName + " " + balance + " " + accountType);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(String n, String h, double b, double r) {
        super(n, h, b, "Savings");
        interestRate = r;
    }

    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(String n, String h, double b, double o) {
        super(n, h, b, "Current");
        overdraftLimit = o;
    }

    @Override
    boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: Rs." + amount);
            return true;
        }
        System.out.println("Overdraft limit exceeded");
        return false;
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount("SA101", "Soniya", 10000, 5);
        CurrentAccount c = new CurrentAccount("CA201", "Priya", 15000, 5000);

        System.out.println("Savings Account:");
        s.displayAccountDetails();
        s.deposit(2000);
        s.withdraw(1000);
        System.out.println("Interest: Rs." + s.calculateInterest());

        System.out.println("\nCurrent Account:");
        c.displayAccountDetails();
        c.deposit(3000);
        c.withdraw(18000);

        System.out.println("\nTransfer:");
        s.transfer(c, 2000);

        System.out.println("\nFinal Details:");
        s.displayAccountDetails();
        c.displayAccountDetails();
    }
}
