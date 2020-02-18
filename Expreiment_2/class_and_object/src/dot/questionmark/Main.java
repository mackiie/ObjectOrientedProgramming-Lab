package dot.questionmark;

public class Main {

    int studentage;

    public Main(String name)
    {
        System.out.println("Name is : " + name);
    }

    public void setAge(int age)
    {
        studentage = age;
    }

    public int getAge()
    {
        return studentage;
    }

    public static void main(String[] args)
    {
        Main student = new Main("XYZ");
        student.setAge(20);
        int age = student.getAge();

        System.out.println("Age is : " + age);
    }
}
