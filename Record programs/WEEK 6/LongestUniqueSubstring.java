
import java.util.Scanner;

public class LongestUniqueSubstring
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++)
        {
            String temp = "";

            for (int j = i; j < str.length(); j++)
            {
                char ch = str.charAt(j);

                if (temp.contains(String.valueOf(ch)))
                    break;

                temp = temp + ch;
            }

            if (temp.length() > result.length())
                result = temp;
        }

        System.out.println("Longest unique substring: " + result);
        System.out.println("Substring length: " + result.length());

        sc.close();
    }
}
