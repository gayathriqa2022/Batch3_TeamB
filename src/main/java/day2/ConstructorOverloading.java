package day2;

public class ConstructorOverloading
{
    //zero parameter constructor
    ConstructorOverloading()
    {
        System.out.println("Hello");
    }
    // one parameter constructor
    ConstructorOverloading(int a)
    {
        System.out.println(a);
    }
    // two parameter constructor
    ConstructorOverloading(int b, String c)
    {
        System.out.println(b);
        System.out.println(c);
    }
    // different datatype
    ConstructorOverloading(boolean d)
    {
        System.out.println(d);
    }

    public static void main(String[] args)
    {
        ConstructorOverloading obj = new ConstructorOverloading();
        ConstructorOverloading obj1 = new ConstructorOverloading(10);
        ConstructorOverloading obj2 = new ConstructorOverloading(20,"welcome");
        ConstructorOverloading obj3 = new ConstructorOverloading(true);
    }



}
