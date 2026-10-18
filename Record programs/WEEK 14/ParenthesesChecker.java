
package recordprograms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ParenthesesChecker
{
    public static boolean checkBrackets(String str)
    {
        Deque<Character> stack = new ArrayDeque<>();

        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[')
            {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']')
            {
                if (stack.isEmpty())
                    return false;

                char open = stack.pop();

                if (ch == ')' && open != '(')
                    return false;

                if (ch == '}' && open != '{')
                    return false;

                if (ch == ']' && open != '[')
                    return false;
            }
            else
            {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter brackets: ");
        String brackets = sc.nextLine();

        if (checkBrackets(brackets))
            System.out.println("Brackets are balanced.");
        else
            System.out.println("Brackets are not balanced.");

        sc.close();
    }
}

            
