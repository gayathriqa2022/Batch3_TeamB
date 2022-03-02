package day10;

public class StaticNonStaticBlocks
{
    int a;
    static int b;
    // creating constructor
    StaticNonStaticBlocks()
    {
        System.out.println("Hi i am constructor");
    }
    //creating Non-staticblock
    {
        System.out.println("Altering non static");
        a = 5;

    }
    {
        System.out.println("Hi i am non static block");
        a = 10;
    }
    //creating static block
    static
    {
        System.out.println("Hi i am static block");
        b = 20;
    }

    public static void main(String[] args)
    {
        StaticNonStaticBlocks obj = new StaticNonStaticBlocks();
        System.out.println(obj.a);
        System.out.println(b);


    }


}
