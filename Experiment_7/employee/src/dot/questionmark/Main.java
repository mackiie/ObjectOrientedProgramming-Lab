package dot.questionmark;

import java.util.Scanner;

class name extends Exception
{
    boolean x;
    name(String str)
    {
        int i;
        char c;
        x=false;
        for(i=0;i<str.length();i++)
        {
            c=str.charAt(i);
            if(c>=48&&c<=57)
            {
                x=true;
                break;
            }
        }
    }
    public String toString()
    {
        return "NAME EXCEPTION!";
    }
}

class age extends Exception
{
    boolean x;
    age(int a)
    {
        x=a>50;
    }
    public String toString()
    {
        return "AGE EXCEPTION!";
    }
}

class employee
{
    String nam;
    int ag;
    employee(String n,int a)
    {
        nam=n;
        ag=a;
        System.out.println("Object created");
        System.out.println("____________________________");
        System.out.println("Name:"+nam);
        System.out.println("Age:"+ag);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        String name;
        int age;
        employee em;
        name n;
        age a;
        Scanner sc = new Scanner(System.in);
        try
        {
            System.out.println("Enter name of an employee");
            name=sc.nextLine();
            n=new name(name);
            if(n.x)
            {
                throw n;
            }
            System.out.println("Enter age of an employee");
            age=sc.nextInt();
            a=new age(age);
            if(a.x)
            {
                throw a;
            }
            em=new employee(name,age);
        }
        catch(name e)
        {
            System.out.println(e);
        }
        catch(age f)
        {
            System.out.println(f);
        }
    }
}
