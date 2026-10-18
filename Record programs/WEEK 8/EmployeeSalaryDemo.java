
package recordprograms;

import java.util.Scanner;

// Interface
interface Employee {
    void showSalary();
}

// Regular Employee class
class RegularEmployee implements Employee {

    int basicPay = 25000;
    int hra = 15000;
    int ta = 5000;

    @Override
    public void showSalary() {
        int total = basicPay + hra + ta;

        System.out.println("Employee Type: Regular");
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: " + hra);
        System.out.println("TA: " + ta);
        System.out.println("Total Salary: " + total);
    }
}

// Contract Employee class
class ContractEmployee implements Employee {

    int basicPay = 12000;
    int ta = 3000;

    @Override
    public void showSalary() {
        int total = basicPay + ta;

        System.out.println("Employee Type: Contract");
        System.out.println("Salary Details:");
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("HRA: 0");
        System.out.println("TA: " + ta);
        System.out.println("Total Salary: " + total);
    }
}

// Main class
public class EmployeeSalaryDemo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        String id = sc.nextLine().trim();

        Employee emp;

        if (id.toUpperCase().startsWith("R")) {
            emp = new RegularEmployee();
            emp.showSalary();
        }
        else if (id.toUpperCase().startsWith("C")) {
            emp = new ContractEmployee();
            emp.showSalary();
        }
        else {
            System.out.println("Invalid Employee ID!");
        }

        sc.close();
    }
}
