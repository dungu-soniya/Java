
package recordprograms;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandlingDemo
{
    public static void main(String[] args)
    {
        String sentence =
            "Peter Piper picked a peck of pickled peppers. "
            + "A peck of pickled peppers Peter Piper picked. "
            + "If Peter Piper picked a peck of pickled peppers, "
            + "where is the peck of pickled peppers Peter Piper picked?";

        try
        {
            FileWriter fw = new FileWriter("sample.txt");
            fw.write(sentence);
            fw.close();

            System.out.println("File created and data written successfully.");

            File f = new File("sample.txt");
            Scanner sc = new Scanner(f);

            String content = "";

            while (sc.hasNextLine())
            {
                content = content + sc.nextLine() + " ";
            }

            sc.close();

            content = content.toLowerCase();

            int pe = 0;
            int pi = 0;

            for (int i = 0; i < content.length() - 1; i++)
            {
                String pair = content.substring(i, i + 2);

                if (pair.equals("pe"))
                    pe++;

                else if (pair.equals("pi"))
                    pi++;
            }

            System.out.println("Count of pe: " + pe);
            System.out.println("Count of pi: " + pi);
        }
        catch (IOException e)
        {
            System.out.println("Error while handling file.");
        }
    }
}
