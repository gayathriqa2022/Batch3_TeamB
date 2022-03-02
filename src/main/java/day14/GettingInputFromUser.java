package day14;

import java.util.Scanner;

public class GettingInputFromUser
{
    int age;
    Scanner myobj;
    public int InitializeVariable() {
        myobj = new Scanner(System.in);
        System.out.println("please enter the age:");
        String ageString = myobj.nextLine();
        age = Integer.parseInt(ageString);
        return age;
    }

    public static void main(String[] args) {
        GettingInputFromUser obj = new GettingInputFromUser();
        System.out.println("your age is: +obj.initializeVariable");
    }



    }


