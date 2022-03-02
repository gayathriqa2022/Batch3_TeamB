package day4;

public class ReferenceUse
{
    // zero paraeter constructor
    ReferenceUse()
    {
        System.out.println("Zero constructor");
    }
// one parameter constructor
    ReferenceUse(int a, int b)
    {
        this();
        System.out.println(a);
        System.out.println(b);
    }
    ReferenceUse(int a, int b, int c)
    {
        this(a, b);
        System.out.println(c);
    }
    ReferenceUse(int a, int b, int c, int d)
    {
        this(a, b, c);
        System.out.println(d);

    }
    ReferenceUse(int a, int b, int c, int d,int e)
    {
        this(a, b, c, d);
        System.out.println(e);
    }
    public static void main(String[] args) {

        ReferenceUse obj = new ReferenceUse(2, 3,4,5,6);

    }



}
