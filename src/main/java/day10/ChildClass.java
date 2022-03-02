package day10;
//this is single inheritance,base class is parent class,derived class is child class
public class ChildClass extends ParentClass
{
    //child variable
    int b = 5;
    //calling parent constructor to the child constructor
    ChildClass()
    {
        super();
        System.out.println("This is child constructor");
    }
    //calling child method to the parent method
    public void childMethod()
    {
        super.parentMethod();
        System.out.println("This is child Method:,"+b);
        //calling parent variable to child method
        System.out.println("Parent variable:,"+super.a);
    }

    public static void main(String[] args) {
        ChildClass obj = new ChildClass();
        obj.childMethod();
    }


}
