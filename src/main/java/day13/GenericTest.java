package day13;

public class GenericTest {
    public static void main(String[] args) {
        GenericClass<Integer> obj = new GenericClass<>(40);
        obj.printvalue();

        GenericClass<String> obj1 = new GenericClass<>("gayathri");
        obj1.printvalue();

        GenericClass<Double> obj2 = new GenericClass<>(55.012);
        obj2.printvalue();

        GenericClass<Boolean> obj3 = new GenericClass<>(true);
        obj3.printvalue();


    }
}
