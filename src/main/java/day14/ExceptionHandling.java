package day14;

public class ExceptionHandling {
    public static void main(String[] args) {
        String val = "1hello";
        try {
        //when exception happen try block doesn't execute,but catch block will execute
            //when i want to convert "hello" to integer this is the format
            int no = Integer.parseInt(val);
            System.out.println(no);
            System.out.println("try block exceuted successfully");
        } catch (NumberFormatException e) {
            System.out.println("hi please enter correct value for converting to Integer");
            System.out.println("end of code");
        }
        //when we use 'finally'block will execute either exeption hapen or not happens
        finally {
            System.out.println("This is the finally block");
        }

    }
}