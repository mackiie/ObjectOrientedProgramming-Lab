package dot.questionmark;

import java.util.Scanner;

public class Main
{

    static int check_repeated(String str)
    {
        char[] string_converted = str.toCharArray();
        char[] repeated_element;
        int repeated=0;

        for(int i=0; i<str.length(); i++)
        {
            int count = 0;
            for(int j=i+1; j<str.length(); j++)
            {
                if(string_converted[i] != string_converted[j])
                {
                    count++;
                    //System.out.println(count+ "**");
                }
            }
            //System.out.println(str.length()-i-1 + "++");
            if(count == str.length()-i-1)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int index = check_repeated(str);

        if(index >= 0)
        {
            System.out.println("Index : " + index + " Element : " + str.toCharArray()[index]);
        }
        else
        {
            System.out.println("No repeated element");
        }

//        System.out.println("First non repeated character of a string");
    }
}
