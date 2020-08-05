import java.lang.*;
import java.io.*;
import java.io.IOException;

public class JavaTest extends Thread{
    long mpTime;
    long mdTime;
    String a = "";

    /*
     * Method to get the time
     */
    public static long getCurrentTime() {
        return System.nanoTime();
    }

    /*
     * Input: size for string, needs to be a big number
     * Input should be fixed from reading python file function
     * Create multiprocessing in java should be very slow
     */
    public void mpHandler(long dataSize){
        long t;
        t = getCurrentTime();
        ProcessBuilder pb1 = new ProcessBuilder();
        pb1.command("java "+ dataSize);
        ProcessBuilder pb2 = new ProcessBuilder();
        pb2.command("java "+ dataSize);
        mpTime = getCurrentTime() - t;
    }


    public void mdHandler(long dataSize){
        long t;
        thread mt = new thread();
        mt.start();
        String a = "";
        for (int i = 0; i < args[0]; i ++){
            a = a + " ";  
        }
        t = test.getCurrentTime();
    }

    public static void main(long[] args) {
        JavaTest test = new JavaTest();
        test.mpHandler(args[0]);
        System.out.println("Run time for single process: "+ test.mpTime);
        
    }

}

class thread extends Thread{
    @Override
    /*
     *
     */
    public void run(){
        String a = "";
        for (int i = 0; i < args[0]; i ++){
            a = a + " ";  
        }
    }
}