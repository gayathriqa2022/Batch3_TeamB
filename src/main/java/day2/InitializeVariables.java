package day2;

public class InitializeVariables
{   //instance variable - hard coding
    int a;
    String b;
    boolean c;
    double d;
   // creating constructor
    InitializeVariables(int x, String y, boolean z,double q)
    { // this used for reference of current instance variables
        this .a =x;
        this .b =y;
        this .c =z;
        this .d =q;
    }

    public static void main(String[] args) {
        InitializeVariables obj = new InitializeVariables(10,"welcome",true,5.04);
        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);
        System.out.println(obj.d);
    }


    }


