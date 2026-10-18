
package recordprograms;

import java.util.Scanner;

class RBI {
    double getRateOfInterest() {
        return 4.0;
    }
}

class SBI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.0;
    }
}

class ICICI extends RBI {
    @Override
    double getRateOfInterest() {
        return 7.5;
    }
}

class PNB extends RBI {
    @Override
    double getRateOfInterest() {
        return 6.5;
    }
}

class Customer {
    String name;
    String accountNumber;

    Customer(String name, String accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
    }

    void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class BankInterestDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter bank name: ");
        String name = sc.nextLine().trim();

        RBI bank;

        if (name.equalsIgnoreCase("RBI")) {
            bank = new RBI();
        }
        else if (name.equalsIgnoreCase("SBI")) {
            bank = new SBI();
        }
        else if (name.equalsIgnoreCase("ICICI")) {
            bank = new ICICI();
        }
        else if (name.equalsIgnoreCase("PNB")) {
            bank = new PNB();
        }
        else {
            System.out.println("Invalid bank name!");
            sc.close();
            return;
        }

        System.out.println("Bank Name: " + name.toUpperCase());
        System.out.println("Rate of Interest: "
                + bank.getRateOfInterest() + "%");

        sc.close();
    }
}
