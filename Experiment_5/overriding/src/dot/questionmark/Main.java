package dot.questionmark;

import java.util.Scanner;

interface course
{
    void division(int a);
    void modules(int b);
}

class student implements course
{
    String name;
    int div,mod;
    void name(String n)
    {
        name=n;
    }
    public void division(int a)
    {
        div=a;
    }
    public void modules(int b)
    {
        mod=b;
    }
    void display()

    {
        System.out.println("Name :"+name);
        System.out.println("Division :"+div);
        System.out.println("Modules :"+mod);
    }
}

public class Main
{

    public static void main(String[] args)
    {
        Scanner st = new Scanner(System.in);
        student s = new student();
        System.out.println("Enter name of the student");
        s.name(st.nextLine());
        System.out.println("Enter division");
        s.division(st.nextInt());
        System.out.println("Enter module");
        s.modules(st.nextInt());
        System.out.println("______________________________________");
        System.out.println("Details entered");
        System.out.println("______________________________________");
        s.display();
    }
}
