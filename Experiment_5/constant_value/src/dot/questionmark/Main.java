package dot.questionmark;

import java.util.Scanner;

//interface with one parameter
interface area1

{
    static final float pi=3.142f;
    float compute(float x);
}

//interface with one parameter
interface area2
{
    float compute(float x,float y);
}

class circle implements area1
{
    public float compute(float x)
    {
        return (pi*x*x);
    }
}

class square implements area1
{
    public float compute(float x)
    {
        return (x*x);

    }
}

class rectangle implements area2
{
    public float compute(float x,float y)
    {
        return (x*y);
    }
}

class rightriangle implements area2
{
    public float compute(float x,float y)
    {
        return (x*y)/2;
    }
}

public class Main {

    public static void main(String[] args)
    {
        float x,y;

        int z;
        Scanner st = new Scanner(System.in);
        circle c = new circle();
        square s = new square();
        rectangle re = new rectangle();
        rightriangle rt = new rightriangle();
        System.out.println("Press '1' for calculating area of Circle");
        System.out.println("Press '2' for calculating area of Square");
        System.out.println("Press '3' for calculating area of Rectangle");
        System.out.println("Press '4' for calculating area of Right Triangle");
        System.out.println("______________________________________________");
        z=st.nextInt();
        System.out.println("______________________________________________");
        if(z==1)
        {
            System.out.println("Enter the radius of a Circle");
            x=st.nextFloat();
            System.out.println("______________________________________________");
            System.out.println("Area of Circle is : "+c.compute(x)+" unit squares");
        }
        else if(z==2)
        {

            System.out.println("Enter the side of a Square");
            x=st.nextFloat();
            System.out.println("______________________________________________");
            System.out.println("Area of Square is : "+s.compute(x)+" unit squares");
        }
        else if(z==3)
        {
            System.out.println("Enter the length of a Rectangle");
            x=st.nextFloat();
            System.out.println("Enter the breadth of a Rectangle");
            y=st.nextFloat();
            System.out.println("______________________________________________");
            System.out.println("Area of Rectangle is : "+re.compute(x,y)+" unit squares");
        }
        else if(z==4)
        {
            System.out.println("Enter the base of a Right Triangle");
            x=st.nextFloat();
            System.out.println("Enter the height of a Right Triangle");
            y=st.nextFloat();
            System.out.println("______________________________________________");
            System.out.println("Area of Right Triangle is : "+rt.compute(x,y)+" unit squares");

        }
        else
        {
            System.out.println("Invalid Option!");
        }
    }
}
