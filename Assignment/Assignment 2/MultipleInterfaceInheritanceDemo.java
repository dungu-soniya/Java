interface A
{
    void methodA();
}

interface B
{
    void methodB();
}

interface C extends A, B
{
    void methodC();
}

class Example implements C
{
    public void methodA()
    {
        System.out.println("Method A");
    }

    public void methodB()
    {
        System.out.println("Method B");
    }

    public void methodC()
    {
        System.out.println("Method C");
    }
}

public class MultipleInterfaceInheritanceDemo
{
    public static void main(String[] args)
    {
        Example obj = new Example();

        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
