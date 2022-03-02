package day4;

public class AccessModifiers {
    //Instance veriables
    public int a = 10;
    private int b = 20;
    int c = 30;
    protected int d = 40;

    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);


        }



}



