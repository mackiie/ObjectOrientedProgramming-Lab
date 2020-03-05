package dot.questionmark;

class collision extends Exception
{
    boolean check(int a, int b, int da, int db)
    {
        if((a==b) && (da!=db))
        {
            return true;
        }
        return false;
    }

    public String toString()
    {
        return "Vehicles will collide!";
    }
}

public class Main
{
    public static void main(String[] args)
    {
        int a,b,da,db;
        a=(int)(Math.random()*2);
        b=(int)(Math.random()*2);
        da=(int)(Math.random()*2);
        db=(int)(Math.random()*2);
        Main ob = new Main();
        collision c = new collision();
        ob.display(a,b,da,db);
        try
        {
            if(c.check(a,b,da,db))
            {
                throw c;
            }
            System.out.println("Vehicles will not collide");
        }
        catch(collision e)
        {
            System.out.println("Vehicles will collide");
        }
    }

    void display(int a,int b,int da,int db)
    {
        String ra,rb;
        ra=" ";
        rb=" ";
        if(a==0&&b==0)
        {
            ra=placeCar(da)+placeCar(db);
        }
        else if(a==1&&b==1)
        {
            rb=placeCar(da)+placeCar(db);
        }
        else
        {
            ra=placeCar(da);
            rb=placeCar(db);
        }
        System.out.println("car 1:"+placeCar(da));
        System.out.println("car 2:"+placeCar(db));
        System.out.println("_____________________________________");
        System.out.println("\t\t"+ra+"\t\t");
        System.out.println("  __  __  __  __  __  __  __  __  __");
        System.out.println("\t\t"+rb+"\t\t");
        System.out.println("_____________________________________");
    }

    String placeCar(int x)
    {
        return (x==0)?"<--":"-->";
    }
}