package dot.questionmark;

interface A
{
    int meth1();
    int meth2();
}

class MyClass implements A
{
    int num1;
    int num2;

    MyClass(int n1, int n2)
    {
        num1 = n1;
        num2 = n2;
    }

    public int meth1()
    {
        return num1 - num2;
    }

    public int meth2()
    {
        return num1 + num2;
    }
}

public class Main
{

    public static void main(String[] args)
    {
        MyClass c = new MyClass(7,2);

        System.out.println(c.meth1());
        System.out.println(c.meth2());
    }
}
