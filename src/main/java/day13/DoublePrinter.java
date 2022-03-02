package day13;

public class DoublePrinter {
    Double print;
    // variable print and constructor print both are same with this key represents that
    DoublePrinter(Double print){
        this.print = print;
        System.out.println(print);
    }
    public void method3()
    {
        System.out.println(print);
    }

    public static void main(String[] args) {
        DoublePrinter obj = new DoublePrinter(55.3);
        obj.method3();
    }
}
