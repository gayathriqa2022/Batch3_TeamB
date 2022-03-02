package day4;

public class ReturningValues
{
    public void notReturning()
    {
        System.out.println("Not Retuning");
    }

    public String concat(String a,String b)

    {
        return a+b;
    }

    public static void main(String[] args) {
        ReturningValues obj = new ReturningValues();
        obj.notReturning();
        String c = obj.concat("welcome","ddd");
        System.out.println(c);



    }

}
