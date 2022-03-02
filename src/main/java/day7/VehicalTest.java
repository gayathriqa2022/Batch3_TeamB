package day7;

public class VehicalTest {
    public static void main(String[] args) {
        Vehicle obj = new BMW();
        String nameBMW = obj.vehiclename();
        System.out.println(nameBMW);

        Vehicle obj1 = new Tesla();
        String nameTesla = obj1.vehiclename();
        System.out.println(nameTesla);

    }
}
