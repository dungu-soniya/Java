interface Father
{
    void showFather();
}

interface Mother
{
    void showMother();
}

class Child implements Father, Mother
{
    public void showFather()
    {
        System.out.println("This is Father");
    }

    public void showMother()
    {
        System.out.println("This is Mother");
    }
}

public class MultipleInheritanceofInterface
{
    public static void main(String[] args)
    {
        Child c = new Child();

        c.showFather();
        c.showMother();
    }
}
