package day9;

import java.util.function.Supplier;

public class PredefinedSupplier
{    // supplier will not accept input,but will return output(Integer,String.Boolean)
    public static void main(String[] args) {
        Supplier<String> obj = ()-> "welcome";
        Supplier<Integer> obj1 = ()-> 20;
        Supplier<Boolean> obj2 = ()-> true;
        System.out.println(obj.get());
        System.out.println(obj1.get());
        System.out.println(obj2.get());
    }
}
