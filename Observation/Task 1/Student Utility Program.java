package observation;
import java.util.Scanner;

class StudentUtility {
    void studentDetails(Scanner sc) {
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int rollNo = sc.nextInt();

        System.out.print("Enter Marks in 3 Subjects: ");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        int total = m1 + m2 + m3;
        double percentage = total / 3.0;

        System.out.println("\n--- Student Details ---");
        System.out.println("Name       : " + name);
        System.out.println("Roll No    : " + rollNo);
        System.out.println("Total Marks: " + total);
        System.out.printf("Percentage : %.2f%%\n", percentage);
    }

    void evenOdd(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n % 2 == 0)
            System.out.println(n + " is Even");
        else
            System.out.println(n + " is Odd");
    }

    void largest(Scanner sc) {
        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = a;

        if (b > large)
            large = b;

        if (c > large)
            large = c;

        System.out.println("Largest Number = " + large);
    }

    void grade(Scanner sc) {
        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();

        if (percentage >= 90)
            System.out.println("Grade: A");
        else if (percentage >= 80)
            System.out.println("Grade: B");
        else if (percentage >= 70)
            System.out.println("Grade: C");
        else if (percentage >= 60)
            System.out.println("Grade: D");
        else if (percentage >= 40)
            System.out.println("Grade: E");
        else
            System.out.println("Grade: F - Fail");
    }

    void dayName(Scanner sc) {
        System.out.print("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Day");
        }
    }

    void multiplicationTable(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    void printNumbers(Scanner sc) {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        System.out.println("Numbers from 1 to " + n + ":");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
    }
    void naturalSum(Scanner sc) {
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum = " + sum);
    }
    void fibonacci(Scanner sc) {
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;

        System.out.println("Fibonacci Series:");
        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            int c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    void factorial(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial = " + fact);
    }
    void prime(Scanner sc) {
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        boolean isPrime = true;
        if (n <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        if (isPrime)
            System.out.println(n + " is Prime");
        else
            System.out.println(n + " is Not Prime");
    }
    void maximum(Scanner sc) {
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b)
            System.out.println("Maximum = " + a);
        else
            System.out.println("Maximum = " + b);
    }
    void circleArea(Scanner sc) {
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        double area = Math.PI * r * r;

        System.out.println("Area of Circle = " + area);
    }
}
public class StudentUtilitySystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentUtility obj = new StudentUtility();

        int choice;

        do {
            System.out.println("\n===== STUDENT UTILITY SYSTEM =====");
            System.out.println("1. Student Details");
            System.out.println("2. Even or Odd");
            System.out.println("3. Largest of Three Numbers");
            System.out.println("4. Grade Calculator");
            System.out.println("5. Day Name");
            System.out.println("6. Multiplication Table");
            System.out.println("7. Print Numbers");
            System.out.println("8. Sum of Natural Numbers");
            System.out.println("9. Fibonacci Series");
            System.out.println("10. Factorial");
            System.out.println("11. Prime Number");
            System.out.println("12. Maximum of Two Numbers");
            System.out.println("13. Area of Circle");
            System.out.println("14. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    obj.studentDetails(sc);
                    break;

                case 2:
                    obj.evenOdd(sc);
                    break;

                case 3:
                    obj.largest(sc);
                    break;

                case 4:
                    obj.grade(sc);
                    break;

                case 5:
                    obj.dayName(sc);
                    break;

                case 6:
                    obj.multiplicationTable(sc);
                    break;

                case 7:
                    obj.printNumbers(sc);
                    break;

                case 8:
                    obj.naturalSum(sc);
                    break;

                case 9:
                    obj.fibonacci(sc);
                    break;

                case 10:
                    obj.factorial(sc);
                    break;

                case 11:
                    obj.prime(sc);
                    break;

                case 12:
                    obj.maximum(sc);
                    break;

                case 13:
                    obj.circleArea(sc);
                    break;

                case 14:
                    System.out.println("Thank you for using Student Utility System!");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 14);

        sc.close();
    }
}
