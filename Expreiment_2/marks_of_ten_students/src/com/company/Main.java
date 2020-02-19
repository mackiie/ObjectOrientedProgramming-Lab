package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int marks[];
        marks = new int[10];

        Scanner s = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            System.out.print("Enter marks of student " + (i+1) + " : ");
            marks[i] = s.nextInt();
        }

        Arrays.sort(marks);

        for(int i=0;i<10;i++)
        {
            if(marks[i]>=40 && marks[i]<=50)
            {
                System.out.println("PASS");
            }
            else if (marks[i]>=51 && marks[i]<=75)
            {
                System.out.println("MERIT");
            }
            else if (marks[i]>75)
            {
                System.out.println("DISTINCTION");
            }
            else
            {
                System.out.println("not defined");
            }
        }

    }
}
