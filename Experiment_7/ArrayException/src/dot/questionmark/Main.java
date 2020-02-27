package dot.questionmark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int i,x;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        for(i=0;i<10;i++)
        {
            arr[i]=(int)(Math.random()*100);
        }
        System.out.println("Printing array");

        for(i=0;i<10;i++)
        {
            System.out.println("("+i+") "+arr[i]);
        }
        System.out.println("Choose a index number");
        i=sc.nextInt();
        try
        {
            x=arr[i];
            System.out.println(x+" is choosen");
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Index does not exists!");
        }
    }
}
