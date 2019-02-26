// BufferReader stores file data as String.

import java.util.ArrayList;
import java.io.FileNotFoundException;
import java.io.*;

class bufferedReader
{
    public static void main(String[] args) 
    {
    try {
        FileReader file = new FileReader("file.txt");
        BufferedReader input = new BufferedReader(file);
        ArrayList<Integer> list = new ArrayList<Integer>();
        String temp = "";

        while ((temp = input.readLine()) != null)
        {
            if (!temp.trim().equals("a"))
            {
                list.add(new Integer(temp));
            }
        }
        
        input.close();
    
        for (Integer number : list)
        {
            System.out.print(number + " ");
        }
    } 
        catch (IOException ie) 
        {
            System.out.println(ie);
        }
    }
}