package dot.questionmark;

class checkNumber extends Exception
{
    boolean x;

    checkNumber(String n, String a)
    {
        super(n);
        int i;
        char c;
        x = false;
        for (i = 0; i < a.length(); i++) {
            c = a.charAt(i);
            if (!(c >= 48 && c <= 57)) {
                x = true;
                break;
            }
        }
    }

    public String toString()
    {
        return "its not a number";
    }
}


public class Main
{
    public static void main(String[] args)
    {
        checkNumber ob = new checkNumber("NUM Exception!",args[0]);
        try
        {
            if(ob.x)
            {
                throw ob;
            }
            System.out.println("its a number");
        }
        catch(checkNumber e)
        {
            System.out.println(e);
        }
    }
}
