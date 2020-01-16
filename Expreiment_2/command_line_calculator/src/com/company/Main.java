package com.company;

public class Main {

    public static void main(String[] args)
    {
        if(args[1].contentEquals("+"))
        {
            System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[2]));
        }
        else if(args[1].contentEquals("-"))
        {
            System.out.println(Integer.parseInt(args[0]) - Integer.parseInt(args[2]));
        }
        else if(args[1].contentEquals("*"))
        {
            System.out.println(Integer.parseInt(args[0]) * Integer.parseInt(args[2]));
        }
        else if(args[1].contentEquals("/"))
        {
            System.out.println(Integer.parseInt(args[0]) / Integer.parseInt(args[2]));
        }
        else if(args[1].contentEquals("%"))
        {
            System.out.println(Integer.parseInt(args[0]) % Integer.parseInt(args[2]));
        }
        else
        {
            System.out.println("Operator not defined.");
        }
    }
}
