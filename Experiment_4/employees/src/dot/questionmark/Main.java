package dot.questionmark;

class employee
{
    String name;
    int emp_id;
    int salary;

    employee(String n, int e, int s)
    {
        name = n;
        emp_id = e;
        salary = s;
    }

    void print()
    {
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }

    void increase(int percent)
    {
        salary += salary*percent/100;
    }
}

class manager extends employee
{
    String department;

    manager(String name, int e, int s, String d)
    {
        super(name, e, s);
        department = d;
    }

    void show()
    {
        super.print();
        System.out.println("Department : " + department);
    }
}

public class Main
{

    public static void main(String[] args)
    {
        employee e = new employee("ABC",54174, 50000);
        e.print();
        manager m = new manager("XYZ",11111,100000,"reception");
        m.show();
    }
}
