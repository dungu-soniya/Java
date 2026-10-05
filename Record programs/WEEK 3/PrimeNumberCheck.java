package numberprog;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int value = input.nextInt();

        boolean prime = checkPrime(value);
        boolean palindrome = checkPalindrome(value);

        if (prime && palindrome) {
            System.out.println(value + " is a Prime Palindrome number");
        } 
        else {
            System.out.println(value + " is not a Prime Palindrome number");
        }

        input.close();
    }

    // Method to check prime number
    static boolean checkPrime(int value) {

        if (value < 2)
            return false;

        for (int i = 2; i * i <= value; i++) {

            if (value % i == 0)
                return false;
        }

        return true;
    }

    // Method to check palindrome number
    static boolean checkPalindrome(int value) {

        int original = value;
        int reverse = 0;

        while (value != 0) {

            int digit = value % 10;
            reverse = reverse * 10 + digit;
            value = value / 10;
        }

        if (original == reverse)
            return true;
        else
            return false;
    }
}
