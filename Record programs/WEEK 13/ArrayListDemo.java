
package recordprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListDemo
{
    static String[] phone = {
        "", "", "abc", "def", "ghi",
        "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void findCombinations(String digits, int index,
                                        String word, List<String> list)
    {
        if (index == digits.length())
        {
            list.add(word);
            return;
        }

        int num = digits.charAt(index) - '0';
        String letters = phone[num];

        for (int i = 0; i < letters.length(); i++)
        {
            findCombinations(digits, index + 1,
                    word + letters.charAt(i), list);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter digits: ");
        String digits = sc.nextLine().trim();

        List<String> result = new ArrayList<>();

        if (!digits.matches("[2-9]+"))
        {
            System.out.println("Enter digits from 2 to 9 only.");
        }
        else
        {
            findCombinations(digits, 0, "", result);

            System.out.println("Combinations: " + result);
            System.out.println("Total combinations: " + result.size());
        }

        sc.close();
    }
}
