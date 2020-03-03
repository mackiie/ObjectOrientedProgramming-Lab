package dot.questionmark;

import javax.swing.JOptionPane;

class myCustomException extends Exception
{
    public myCustomException(String s)
    {
        super(s);
    }
}

class Rectangle
{
    private double length;
    private double width;
    private double x1, x2, x3, x4;
    private double y1, y2, y3, y4;

    Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }

    Rectangle(double length, double width)
    {
        try
        {
            if(length>0.0 && length<20.0 && width>0.0 && width<20.0)
            {
                this.length = length;
                this.width = width;
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Select a smaller length and width.");
                throw new myCustomException("Select a smaller length and width.");
            }
        }
        catch (myCustomException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    Rectangle(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        try
        {
            if(x1>0.0 && x1<20.0 && y1>0.0 && y1<20.0)
            {
                this.x1 = x1;
                this.y1 = y1;
            }
            else if(x2>0.0 && x2<20.0 && y2>0.0 && y2<20.0)
            {
                this.x2 = x2;
                this.y2 = y2;
            }
            else if(x3>0.0 && x3<20.0 && y3>0.0 && y3<20.0)
            {
                this.x3 = x3;
                this.y3 = y3;
            }
            else if(x4>0.0 && x4<20.0 && y4>0.0 && y4<20.0)
            {
                this.x4 = x4;
                this.y4 = y4;
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Selected coordinated can't be accepted.");
                throw new myCustomException("Selected coordinated can't be accepted.");
            }
        }
        catch (myCustomException exception)
        {
            System.out.println(exception.getMessage());
        }
    }

    double getLength()
    {
        return length;
    }

    double getWidth()
    {
        return width;
    }

    void setLength(double length)
    {
        this.length = length;
    }

    void setWidth(double width)
    {
        this.width = width;
    }

    boolean verifyRectangle()
    {
        double slope12 = (y2-y1)/(x2-x1);
        System.out.println(slope12);
        double slope34 = (y3-y4)/(x3-x4);
        System.out.println(slope34);
        double slope14 = (y4-y1)/(x4-x1);
        System.out.println(slope14);
        double slope23 = (y3-y2)/(x3-x2);
        System.out.println(slope14);
        if( (slope12 == slope34) && (slope14 == slope23) )
        {
            System.out.println(slope12);
            System.out.println(slope14);
            System.out.println("Parellelogram");
            if( slope12 == (1/slope14))
            {
                return true;
            }
            return false;
        }
        return false;
    }

    void setCoordinates(double x1, double y1, double x2, double y2, double x3, double y3, double x4, double y4)
    {
        if(this.verifyRectangle())
        {
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
            this.x4 = x4;
            this.y4 = y4;
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Selected coordinated can't be accepted.");
        }
    }

    double getArea()
    {
        double area;
        area = length * width;
        return  area;
    }

    double getPerimeter()
    {
        double perimeter;
        perimeter = (2*(length + width));
        return perimeter;
    }

    void displayStatistics()
    {
        System.out.println("Length : " + getLength() + " unit(s)");
        System.out.println("Width : " + getWidth() + " unit(s)");
        System.out.println("Area : " + getArea() + " square unit(s)");
        System.out.println("Perimeter : " + getPerimeter() + " unit(s)");
    }

}

public class Main
{
    public static void main(String[] args)
    {
        Rectangle myRectangle = new Rectangle(24,7);
        System.out.println("Displaying statistics of rectangle : ");
        myRectangle.displayStatistics();
        myRectangle.setLength(31);
        myRectangle.setWidth(13);
        System.out.println("");
        myRectangle.displayStatistics();

        Rectangle myRectangle2 = new Rectangle(0, -3, -4, 0, 2, 8, 6, 5);
        myRectangle2.verifyRectangle();
    }
}
