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
        if(gender == 'm' || gender == 'M')
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
        System.out.println("\nYou are " + visitor + "th visitor.");
        System.out.println("--------------------------------------");
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

        guest g1 = new guest("Dsdgs Gsg Sg G Rg Wr G Rg Erg" , 'm');

        guest g2 = new guest("Apple Sdsf Sdfsdf Sdfsdfse Sdfsefd", 'f');

        guest g3 = new guest("Awdcncno Swrvenru Dcibcrou Fcdwecn Gjkcwckw",'m');

        guest g4 = new guest("Qsdcnkc", 'f');
    }
}
