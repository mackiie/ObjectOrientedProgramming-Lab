package p2;
public class calc
{
    public void display()
    {
        System.out.println("Package:P2");
        System.out.println("class calc");
        System.out.println("Functions:Add,Sub,Mul,Div");
    }
    public void add(double a,double b)
    {
        System.out.println("Sum : "+(a+b));
    }
    public void sub(double a,double b)

    {
        System.out.println("Difference : "+(a-b));
    }
    public void mul(double a,double b)
    {
        System.out.println("Product : "+(a*b));
    }
    public void div(double a,double b)
    {
        System.out.println("Division : "+(a/b));
    }
}