package dot.questionmark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int n,d,x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numerator");
        n=sc.nextInt();
        System.out.println("Enter denominator");

        d=sc.nextInt();
        try
        {
            System.out.print("\nAnswer : ");
            x=n/d;
            System.out.print(x);
        }
        catch (ArithmeticException e)
        {
            System.out.print("Infinite (DivideByZeroException)");
        }
    }
}
