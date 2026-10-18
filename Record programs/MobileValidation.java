
package recordprograms;

import java.util.Scanner;

class InvalidLengthException extends Exception
{
    InvalidLengthException(String msg)
    {
        super(msg);
    }
}

public class MobileValidation
{
    static void checkMobile(String number)
            throws InvalidLengthException
    {
        if (!number.matches("\\d+"))
            throw new NumberFormatException("Digits only.");

        if (number.length() < 10)
            throw new InvalidLengthException("Number is too short.");

        if (number.length() > 10)
            throw new ArrayIndexOutOfBoundsException("Number is too long.");

        System.out.println("Valid mobile number.");
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mobile number: ");
        String number = sc.nextLine();

        try
        {
            checkMobile(number);
        }
        catch (InvalidLengthException |
               NumberFormatException |
               ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
