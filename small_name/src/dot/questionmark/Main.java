package dot.questionmark;

import java.util.Scanner;

class guest
{
    static int visitor = 0;
    String name;
    char gender;

    guest(String name, char gender)
    {
        this.name = name;
        this.gender = gender;
        visitor++;
        welcome();
    }

    void welcome()
    {
        String[] words = name.split(" ");
        System.out.print("Welcome ");
        if(gender == 'm')
        {
            System.out.print("Mr. ");
        }
        else
        {
            System.out.print("Mrs. ");
        }
        for(int i=0 ; i<words.length-1; i++)
        {
            System.out.print(words[i].toCharArray()[0] + ". ");
        }
        System.out.print(words[words.length-1]);
        System.out.println(" You are " + visitor + "th visitor.");
    }

}

public class Main
{

    public static void main(String[] args)
    {
//        Scanner s = new Scanner(System.in);
//        System.out.print("Enter your name : ");
//        String name = s.nextLine();
//        System.out.print("Enter your gender : ");
//        char gender = s.next().charAt(0);

        guest g1 = new guest("dsdgs gsg sg g rg wr g rg erg" , 'm');

        guest g2 = new guest("apple sdsf sdfsdf sdfsdfse sdfsefd", 'f');
    }
}
