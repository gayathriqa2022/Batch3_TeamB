package day2;

public class CreateMethod {
    public void method(int a, String b, boolean c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    public static void main(String[] args) {

        CreateMethod obj = new CreateMethod();
        obj.method(20, "gayathri", true);
    }
}
