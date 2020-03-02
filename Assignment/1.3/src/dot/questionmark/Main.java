package dot.questionmark;

import java.util.Scanner;

class publication
{
    protected String title;
    protected float price;

    publication()
    {
        title = "";
        price = 0;
    }

    publication(String title, float price)
    {
        this.title = title;
        this.price = price;
    }
}

class sales extends publication
{
    double month1Sale;
    double month2Sale;
    double month3Sale;

    public sales(String title, float price)
    {
        super(title,price);
    }

    void getSales()
    {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter month-1 sale : ");
        month1Sale = s1.nextDouble();
        System.out.print("Enter month-2 sale : ");
        month2Sale = s1.nextDouble();
        System.out.print("Enter month-3 sale : ");
        month3Sale = s1.nextDouble();
    }

    void displaySales()
    {
        System.out.println("Sales of month 1 : " + month1Sale);
        System.out.println("Sales of month 2 : " + month2Sale);
        System.out.println("Sales of month 3 : " + month3Sale);
    }
}

class book extends sales
{
    int pageCount;

    book(String title, float price, int pageCount)
    {
        super(title,price);
        this.pageCount = pageCount;
    }

    void display()
    {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("PageCount : " + pageCount);
    }
}

class tape extends sales
{
    float playingTime;

    tape(String title, float price, float playingTime )
    {
        super(title,price);
        this.playingTime  = playingTime ;
    }

    void display()
    {
        System.out.println("Title : " + title);
        System.out.println("Price : " + price);
        System.out.println("Playing Time (in minutes) : " + playingTime );
    }
}

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Book Data");
        book b1 = new book("Object Oriented Programming", 500, 250);
        b1.display();
        b1.getSales();
        b1.displaySales();
        System.out.println("--------------------------------------------------------------");
        System.out.println("Tape Data");
        tape t1 = new tape("Programming", 300, (float) 120.5);
        t1.display();
        t1.getSales();
        t1.displaySales();
    }
}
