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

    void talk()
    {
        System.out.println("Name of the animal : " + name);
        System.out.println("Age of the animal : " + age);
        System.out.println("Type of the animal : " + animalType);
    }
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

class Lion extends Animal
{
    String nickName;

    Lion(String name,int age, String animalType, String nickName)
    {
        super(name, age, animalType);
        this.nickName = nickName;
    }

    @Override
    void talk()
    {
        System.out.println("Hello, I am a " + animalType + " and my name is " + getName() + ".");
        System.out.println("I am " + getAge() + " years old.");
        System.out.println("My nickname is " + nickName);
        System.out.println("-----------------------------------------------------------------------------");
    }
}

class Zoo
{
    public void addAnimal()
    {
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
