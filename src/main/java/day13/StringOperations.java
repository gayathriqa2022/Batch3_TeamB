package day13;

public class StringOperations {
    public static void main(String[] args) {
        String val = "This is batch 3 Java sessions";
       String val1 = " Automation";
        //To find the leanth of the string
        System.out.println(val.length());

        //To remove spaces of the string from begging and ending
        String removespaces = val.trim();
        //if you wan to see the difference between spaces and without spaces enter sout no spaces(val only)
        System.out.println(val);
        System.out.println(removespaces);

        //To convert to lowercase letters
        System.out.println(val.toLowerCase());
        //To convert to uppercase letters
        System.out.println(val.toUpperCase());

        //To retrieve part of string value
        String subval = val.substring(0,15);
        System.out.println(subval);
        String subval2 = val.substring(16,29);
        System.out.println(subval2);

        //To replace a string portion
        String replacing = val.replace("Java", "Kalyan");
        System.out.println(replacing);
        //To check strig contains what
        System.out.println(val.contains("Java"));

        //To check the position of batch in the string
        System.out.println(val.lastIndexOf("b"));

        //To check weather it is empty
        System.out.println(val.isEmpty());

        //To concatinate two strings
        System.out.println(val.concat(val1));

    }
}
