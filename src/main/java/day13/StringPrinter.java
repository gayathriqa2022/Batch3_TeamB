package day13;

public class StringPrinter {
    String print;
    // to initialize variable create a constructor
    StringPrinter(String print)
    {
        this.print = print;
        System.out.println(print);
    }
    public Integer method(Integer a)
    {

        System.out.println(a);
        return a;
    }

    public static void main(String[] args) {
        StringPrinter obj = new StringPrinter("gayathri");

        obj.method(24);
    }

}
