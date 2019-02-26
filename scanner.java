// Scanner stores file data as string, int, short, float, double, and long.

import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;

class scanner
{
    public static void main(String[] args) 
    {
        try {
            ArrayList<Integer> list = new ArrayList<Integer>();
            System.out.print("Enter the file name with extension: ");
            Scanner input = new Scanner(System.in);
            File file = new File(input.nextLine());
            input = new Scanner(file);

            while (input.hasNextLine()) 
            {
                String line = input.nextLine();
                list.add(Integer.parseInt(line));

                System.out.println(line);
            }

            for (Integer number : list)
            {
                System.out.print(number + " ");
            }
            
            input.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }
    }
}