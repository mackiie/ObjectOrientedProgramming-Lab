package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        // Initialised values
        int temp;
        // Temporary variable
        int iterate = 0;
        System.out.println(a);
        //Printing first value

        for(iterate = 0;iterate < 10;iterate++)
        {
          //Printing further values
            System.out.println(b);
            temp = a;
            a = b;
            b = b + temp;
        }

    }
}
