package day13;
//i am extending to predefined class thread
public class MultiThreading extends Thread {

    /*if we want to find which thread is nuning from which thread put private variable and put constructor to initialize
    variable and im concatinating from whichnumber in sout in 17line
    and finaly goto MultiTestclass and 8th line give 'i'in ()brackets
    output come ikethis '1 from thread number 3'*/
    /* private int threadnumber;
    public MultiThreading(int threadnumber)
    {
      this.threadnumber=threadnuber
      }
     */

    @Override
    public void run() {
        //print value from 1 to 5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        //    System.out.println(i+ "from thread number: "+thread number);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.fillInStackTrace());
            }


        }
    }
}