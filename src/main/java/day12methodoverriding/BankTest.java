package day12methodoverriding;
//create class and overrided all banks from parent Bank class
public class BankTest
{
    public static void main(String[] args) {
        BOFA obj = new BOFA();
        System.out.println(obj.rateofintrest());

        Chase obj1 = new Chase();
        System.out.println(obj1.rateofintrest());

        WellsFargo obj2 = new WellsFargo();
        System.out.println(obj2.rateofintrest());
    }

}
