package day8;

interface Addition

{
    public int add  (int a, int b);

}
public class JavaEightLambda
{
    public static void main(String[] args)
    {
        /* for single statement no need { and return keyword
       Addition obj = (a ,b) -> a+b;
       System.out.println(obj.add(3,4));*/
//for  multiple statements creating object
     Addition obj = (a , b) ->
     {
         System.out.println("hello: "+a);
         System.out.println("welcome: "+b);
         return a+b;
     } ;
        System.out.println(obj.add(30,40));

    }
}



