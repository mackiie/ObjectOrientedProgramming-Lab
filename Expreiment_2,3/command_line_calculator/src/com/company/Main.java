package com.company;

public class Main {
  // Arguments passed : 2 + 3

    public static void main(String[] args)
    {
        if(args[1].contentEquals("+"))
        {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
            // Adding two numbers
        }
        else if(args[1].contentEquals("-"))
        {
            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
            // Subtracting two numbers
        }
        else if(args[1].contentEquals("*"))
        {
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
            // Multiplying two numbers
        }
        else if(args[1].contentEquals("/"))
        {
            System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
            // Deviding two numbers
        }
        else if(args[1].contentEquals("%"))
        {
            System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
            // Modulus of two numbers
        }
        else
        {
            System.out.println("Operator not defined.");
        }
    }
}
