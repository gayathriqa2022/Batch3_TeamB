package day2;

public class CreateConstructor
{
    //instance variables
    int a;
    String b;
    boolean c;
    double d;
    //creating constructor
    CreateConstructor(int x,String y,boolean z,double q)
    {
        a = x;
        b = y;
        c = z;
        d = q;
    }

    public static void main(String[] args) {
        CreateConstructor obj = new CreateConstructor(11,"Welcome",true,5.11);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }


}
