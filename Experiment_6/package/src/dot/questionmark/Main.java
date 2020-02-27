package dot.questionmark;

import java.util.Scanner;

import p1.*;
import p2.*;

public class Main {

    public static void main(String[] args)
    {
        int a,b;
        System.out.println("Testing Package p1");
        System.out.println("_________________________________");
        p1.K.visit();
        System.out.println("_________________________________");
        System.out.println("Tested!");
        System.out.println("_________________________________");
        System.out.println("\nTesting Package p2");

        System.out.println("_________________________________");
        Scanner sc = new Scanner(System.in);
        p2.calc c = new p2.calc();
        c.display();
        System.out.println("_________________________________");
        System.out.println("Enter value of a");
        a=sc.nextInt();
        System.out.println("Enter value of b");
        b=sc.nextInt();
        System.out.println("_________________________________");
        c.add(a,b);
        c.sub(a,b);
        c.mul(a,b);
        c.div(a,b);
        System.out.println("_________________________________");
        System.out.println("Tested!");
    }
}
