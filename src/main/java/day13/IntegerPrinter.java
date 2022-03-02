package day13;

public class IntegerPrinter
{
    Integer a;
    IntegerPrinter(Integer a)
    {
        this.a = a;
    }
    public void method()
    {
        System.out.println(a);
    }

    public static void main(String[] args) {
        IntegerPrinter obj = new IntegerPrinter(20);
        System.out.println(obj.a);
    }
}

