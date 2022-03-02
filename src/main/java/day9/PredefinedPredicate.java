package day9;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredefinedPredicate
{
    public static void main(String[] args) {
        // Predicate method is 'test'
        Predicate<String> obj = (a) -> a.length() >7;
        System.out.println(obj.test("gayathri"));

        BiPredicate<String,String> obj1 = (a,b) -> a .equals(b);
        System.out.println(obj1.test("pritu","Pritu"));

    }
}
