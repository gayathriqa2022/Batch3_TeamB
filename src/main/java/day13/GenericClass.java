package day13;

public class GenericClass<T>
{
   T printer;
   GenericClass(T printer)
   {
       this.printer = printer;
   }
   public void printvalue()
   {
       System.out.println(printer);
   }
}
