package dot.questionmark;

class Rectangle
{
    private double length;
    private double width;

    Rectangle()
    {
        length = 1.0;
        width = 1.0;
    }

    Rectangle(double length, double width)
    {
        this.length = length;
        this.width = width;
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
        Rectangle myRectangle = new Rectangle(13,7);
        System.out.println("Displaying statistics of rectangle : ");
        myRectangle.displayStatistics();
        myRectangle.setLength(31);
        myRectangle.setWidth(13);
        myRectangle.displayStatistics();
    }
}
