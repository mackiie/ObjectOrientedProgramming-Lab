package dot.questionmark;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        int num[];
        num = new int[3];

        Scanner s = new Scanner(System.in);

        for(int i=0;i<3;i++)
        {
            System.out.print("Enter number " + (i+1) + " : ");
            num[i] = s.nextInt();
        }

        System.out.println("Possible combinations are : ");

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                for(int k=0;k<3;k++)
                {
                    if(num[i] != num[j] && num[j] != num[k] && num[i] != num[k])
                    {
                        System.out.println((num[i]) + "" + num[j] + "" + num[k]);
                    }
                }
            }
        }

    }
}
