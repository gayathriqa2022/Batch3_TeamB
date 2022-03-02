package day1;

public class variables{
    int a = 10;
    String b ="hello";

    static int c = 20;

    public void method()
    {
        int var1 =40;
        String var2 ="welcome";

        System.out.println(var1);
        System.out.println(var2);

    }

    public static void main(String[] args) {
        variables obj = new variables();
        System.out.println(obj .a);
        System.out.println( obj .b);
        System.out.println(c);
        obj.method();

    }
}















