package day2;

public class MethodOverloading
{
    public void method (int a, int b)

    {
        int c = a+b;
        System.out.println(c);
    }
public void method (int x, String y)
{

    System.out.println(x);
    System.out.println(y);
}
public void method( String m, boolean n)
{

    System.out.println(m);
    System.out.println(n);

}
    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj . method(10,20);
        obj . method(10,"welcome");
        obj . method("hello",true);

    }



    }



