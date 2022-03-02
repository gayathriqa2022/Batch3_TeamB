package day12methodoverriding;

public class Child extends Parent
{
    public void behavior()
    {
        System.out.println("child behavior");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.behavior();
    }

}
