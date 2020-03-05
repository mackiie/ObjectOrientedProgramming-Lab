package dot.questionmark;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        String str,c;
        char ch;
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        str=sc.nextLine();
        c=" ";
        for(i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch>=97&&ch<=122)
            {
                ch=(char)(ch-32);
            }
            c+=ch;
        }
        System.out.println("Capital string :"+c);
    }
}
