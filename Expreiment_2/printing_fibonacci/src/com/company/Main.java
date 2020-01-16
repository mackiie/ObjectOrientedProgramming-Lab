package com.company;

public class Main
{

    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int temp;
        int iterate = 0;
        System.out.println(a);

        for(iterate = 0;iterate < 10;iterate++)
        {
            System.out.println(b);
            temp = a;
            a = b;
            b = b + temp;
        }

    }
}
