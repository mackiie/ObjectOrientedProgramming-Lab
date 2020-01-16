package com.company;

public class Main
{

    public static void main(String[] args)
    {
      //Program to calculate maximum of three numbers using Command Line Arguments
        if((Integer.parseInt(args[0]) > Integer.parseInt(args[1])) && (Integer.parseInt(args[0]) > Integer.parseInt(args[2])))
        {
          //Conditions to check first argument
            System.out.println(args[0]);
        }
        else if(Integer.parseInt(args[1]) > Integer.parseInt(args[2]))
        {
          //Condition to check second argument
            System.out.println(args[1]);
        }
        else
        {
          //Condition to check third argument
            System.out.println(args[2]);
        }
    }
}
