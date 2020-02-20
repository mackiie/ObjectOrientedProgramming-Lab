package dot.questionmark;

import java.util.Scanner;

interface test
{
    int square();
}

class arithmetic implements test
{
    int value;

    arithmetic(int x)
    {
        value = x;
    }

    public int square()
    {
        return (value*value);
    }
}

class TOtestint
{
    public int answer(int x)
    {
        arithmetic a_obj = new arithmetic(x);
        return a_obj.square();
    }
}

public class Main
{

    public static void main(String[] args)
    {
        Scanner scan_obj = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int input = scan_obj.nextInt();
        int output;
        TOtestint object = new TOtestint();
        output=object.answer(input);
        System.out.println("Square of the entered number is : " + output);
    }
}
