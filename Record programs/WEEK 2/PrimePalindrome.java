package palindromeprog;

import java.util.Scanner;

class PrimeCheck {

    static boolean isPrime(int n) {

        if (n <= 1)
            return false;

        for (int i = 2; i <= n / 2; i++) {

            if (n % i == 0)
                return false;
        }

        return true;
    }

    static boolean isPalindrome(int n) {

        int original = n;
        int reverse = 0;

        while (n > 0) {

            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        return original == reverse;
    }
}

public class PrimePalindrome {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int number = sc.nextInt();

        boolean prime = PrimeCheck.isPrime(number);
        boolean palindrome = PrimeCheck.isPalindrome(number);

        if (prime && palindrome) {

            System.out.println(number +
                    " is PRIME AND PALINDROME");

        } else if (prime) {

            System.out.println(number +
                    " is PRIME BUT NOT PALINDROME");

        } else if (palindrome) {

            System.out.println(number +
                    " is NOT PRIME BUT PALINDROME");

        } else {

            System.out.println(number +
                    " is NEITHER PRIME NOR PALINDROME");
        }

        sc.close();
    }
}
