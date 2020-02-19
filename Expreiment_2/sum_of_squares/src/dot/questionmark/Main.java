package dot.questionmark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int numbers[];
        numbers = new int[10];

        int sum = 0;

        Scanner s = new Scanner(System.in);

        for(int i=0;i<10;i++)
        {
            numbers[i] = s.nextInt();
            System.out.println("Square of " + numbers[i] + " is : " + Math.pow(numbers[i],2));
            sum += Math.pow(numbers[i],2);
        }

        System.out.println("Sum of squares is : " + sum);


    }
}
