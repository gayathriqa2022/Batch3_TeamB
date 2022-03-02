package day13;

public class MultiTest {
    public static void main(String[] args) {  //if we want threadind in paralal way we should give 'start'predefined method instead of 'run'predefined method
        // this is called multithreading

        for (int i = 1; i <= 3; i++) {
            MultiThreading multiThreading = new MultiThreading();
            multiThreading.start();

        /*MultiThreading multiThreading1 = new MultiThreading();
        multiThreading1.start();*/
            //instead of creating more objects we use 'for loop ' for incresing number of multithreading
        }

    }
}