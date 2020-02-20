package dot.questionmark;

class worker
{
    String name;
    int emp_no;

    worker(String n,int e)
    {
        name = n;
        emp_no = e;
    }

    void show()
    {
        System.out.println("Name : " + name);
        System.out.println("Emp. No : " + emp_no);
    }
}

class dailyworker extends worker
{
    int rate;
    dailyworker(String n, int no, int r)
    {
        super(n,no);
        rate = r;
    }

    void show()
    {
        super.show();
        System.out.println("Rate : " + rate);
    }
}

class salary extends worker
{
    String salary;

    salary(String n, int no, String sal)
    {
        super(n,no);
        salary = sal;
    }

    void show()
    {
        super.show();
        System.out.println("Salary : " + salary);
    }
}

public class Main
{

    public static void main(String[] args)
    {
        dailyworker d = new dailyworker("ABC", 17, 54);
        salary s = new salary("XYZ",240,"Five tousands");
        d.show();
        s.show();
    }
}
