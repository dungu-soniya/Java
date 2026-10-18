interface PaymentService {
    void pay(double amount) throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException;
    double checkBalance();
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class InvalidUPIException extends Exception {
    InvalidUPIException(String msg) {
        super(msg);
    }
}

class InvalidAmountException extends Exception {
    InvalidAmountException(String msg) {
        super(msg);
    }
}

class Wallet {
    private String userName, mobileNumber, upiId;
    private double balance;

    Wallet(String name, String mobile, String upi, double balance) {
        userName = name;
        mobileNumber = mobile;
        upiId = upi;
        this.balance = balance;
    }

    void addMoney(double amount) {
        balance += amount;
    }

    double getBalance() {
        return balance;
    }

    String getUpiId() {
        return upiId;
    }

    void deduct(double amount) {
        balance -= amount;
    }

    void displayWalletDetails() {
        System.out.println("Name: " + userName);
        System.out.println("Mobile: " + mobileNumber);
        System.out.println("UPI ID: " + upiId);
        System.out.println("Balance: Rs." + balance);
    }
}

class UPIPayment implements PaymentService {
    private Wallet wallet;

    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    public void pay(double amount) throws InvalidUPIException, InvalidAmountException, InsufficientBalanceException {
        String upi = wallet.getUpiId();

        if (!upi.contains("@") || upi.startsWith("@") || upi.endsWith("@"))
            throw new InvalidUPIException("Invalid UPI ID");

        if (amount <= 0)
            throw new InvalidAmountException("Invalid payment amount");

        if (amount > wallet.getBalance())
            throw new InsufficientBalanceException("Insufficient balance");

        wallet.deduct(amount);
        System.out.println("Payment successful: Rs." + amount);
    }

    public double checkBalance() {
        return wallet.getBalance();
    }
}

public class UPIPaymentSystem {
    public static void main(String[] args) {
        Wallet w = new Wallet("Soniya", "9876543210", "soniya@upi", 5000);
        UPIPayment p = new UPIPayment(w);

        w.addMoney(1000);
        w.displayWalletDetails();

        try {
            p.pay(2000);
        } catch (InvalidUPIException | InvalidAmountException | InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Transaction completed");
        }

        System.out.println("Final Balance: Rs." + p.checkBalance());
    }
}
