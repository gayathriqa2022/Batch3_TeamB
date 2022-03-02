package day3;

public class RetrivePrivateDataGetterSetterClass
{
    public static void main(String[] args) {
        GetterAndSetter obj = new GetterAndSetter();
        obj.setA(25);
        obj.setB("Hello");
        obj.setC(true);
        System.out.println(obj.getA());
        System.out.println(obj.getB());
        System.out.println(obj.getC());
    }
}
