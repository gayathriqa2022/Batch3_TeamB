package day12methodoverriding;

public class FinalKeyword {
    // if we use final keyword beore int means we cannot change'a' value
    int a = 10;

    public int method()
    {
        a = 20;
        return a;
    }

    public static void main(String[] args) {
        FinalKeyword obj = new  FinalKeyword();
        System.out.println(obj.method());
    }
}
