package day9;

import java.util.Locale;
import java.util.function.BiFunction;
import java.util.function.Function;

public class PredefinedFunction
{
    public static void main(String[] args) {
        Function<String,String> obj = (a)-> a.toUpperCase();
        //first String is input, second String is output
        // method for Function is' apply'
        String val = obj.apply("hello function");
        System.out.println(val);
        BiFunction<String,String,Integer> obj1 = (a,b) -> a.length()+b.length();
        //Strings are inputs, Integer is output
      int val1 =  obj1 .apply("gayathri","uutu");
        System.out.println(val1);
        // in 15thline pass wrapperclass(Integer), but 17thline datatype save as primitive datatype
    }
}
