package day9;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class PredefinedConsumer
{
    public static void main(String[] args) {
        Consumer<String> obj = (a)-> System.out.println(a);
        obj.accept("Hello Consumer");
        BiConsumer<String,String> obj1 = (a,b) -> System.out.println(a+b);
        obj1 .accept("pritu","uutukuru");
    }
}
