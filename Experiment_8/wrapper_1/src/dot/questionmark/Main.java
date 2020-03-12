package dot.questionmark;

import javax.imageio.IIOException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main
{

    public static void main(String[] args) throws IOException
    {
        String str;
        int n,ch;
        Integer i;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter '1' for int to Integer Conversion");
        System.out.println("Enter '2' for Integer to String Conversion");
        System.out.println("Enter '3' for String to int Conversion");
        System.out.println("Enter '4' for int to String Conversion");
        System.out.println("Enter '5' for String to Integer Conversion");
        System.out.println("Enter '6' for Integer to int Conversion");
        System.out.println("_______________________________________");
        ch=Integer.parseInt(br.readLine());
        System.out.println("_______________________________________");
        if(ch==1)
        {
            System.out.println("Enter value of int variable");
            n=Integer.parseInt(br.readLine());
            i=new Integer(n);
            System.out.println("_______________________________________");
            System.out.println("Integer i = "+i);
        }
        else if(ch==2)
        {
            System.out.println("Enter the value of Integer variable");
            i=new Integer(Integer.parseInt(br.readLine()));
            str=i.toString();
            System.out.println("_______________________________________");
            System.out.println("String str = "+str);
        }
        else if(ch==3)
        {
            System.out.println("Enter the value of String variable");
            str=br.readLine();
            n=Integer.parseInt(str);
            System.out.println("_______________________________________");
            System.out.println("int n = "+n);
        }
        else if(ch==4)
        {
            System.out.println("Enter value of int variable");
            n=Integer.parseInt(br.readLine());
            str=(" "+n).trim();
            System.out.println("_______________________________________");
            System.out.println("String str = "+str);
        }
        else if(ch==5)
        {
            System.out.println("Enter value of String variable");
            str=br.readLine();
            i=new Integer(Integer.parseInt(str));
            System.out.println("_______________________________________");
            System.out.println("Integer i = "+i);
        }
        else if(ch==6)
        {
            System.out.println("Enter value of Integer variable");
            i=new Integer(Integer.parseInt(br.readLine()));
            n=(int)i;
            System.out.println("_______________________________________");
            System.out.println("int n = "+n);
        }
        else
        {
            System.out.println("Invalid choice!");
        }
    }
}
