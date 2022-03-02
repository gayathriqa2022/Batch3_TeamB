package day5;

public class TypeCasting
{
    public static void main(String[] args) {
        //widening type casting
        int a = 20;
        long b = a;

        // narrowing type casting
        double x = 28.01;
        int y = (int)x;

        System.out.println(a);
        System.out.println("narrowing :" + y);


    }
}
