package day4;

public class ReferenceUseMethod {
    public void method1()
    {
        System.out.println("No parameter");
    }
    public void method1(int a)
    {
        this.method1();
        System.out.println(a);
    }
    public void method1(int a, int b)
    {
        this.method1(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        ReferenceUseMethod obj = new ReferenceUseMethod();
        obj.method1(10,20);
    }
}
