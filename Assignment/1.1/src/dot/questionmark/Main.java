package dot.questionmark;

abstract class Animal
{
    String name;
    int age;
    String animalType;

    Animal(String name, int age, String animalType)
    {
        this.name = name;
        this.age = age;
        this.animalType = animalType;
    }

    public String getName()
    {
        return name;
    }

    int getAge()
    {
        return age;
    }

    abstract void talk();
}

class Tiger extends Animal
{
    int weight;

    Tiger(String name,int age, String animalType, int weight)
    {
        super(name, age, animalType);
        this.weight = weight;
    }

    @Override
    void talk()
    {
        System.out.println("Hello, I am a " + animalType + " and my name is " + getName() + ".");
        System.out.println("I am " + getAge() + " years old.");
        System.out.println("My weight is " + weight + " kg.");
        System.out.println("-----------------------------------------------------------------------------");
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Tiger t1 = new Tiger("T1", 17, "tiger", 142);
        t1.talk();
    }
}
