import java.lang.*;
import java.io.*;
import java.io.IOException;

public class JavaTest implements Runnable{
    long mpTime;
    long mdTime;
    String a = "";
    private Object threadSize;
    long highestSize;

    public JavaTest(){
    }
    /*
     * Thread constructor for parameter
     */
    public JavaTest(Object threadSize){
        this.threadSize = threadSize;
    }
    
    /*
     * Method to get the time
     */
    public static long getCurrentTime() {
        return System.currentTimeMillis();
    }

    /*
     * Input: size for string, needs to be a big number
     * Input should be fixed from reading python file function
     * Creates two processes to run the basic test
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

    /*
     * Input: size for string, should be a big number
     * Input fixed
     * Runs another thread to do the basic test while running basic test
     */
    public void mdHandler(long dataSize) throws InterruptedException{
        long t;
        Runnable test2 = new JavaTest(this.highestSize);
        t = getCurrentTime();
        Thread thread1 = new Thread(test2);
        Runnable test3 = new JavaTest(this.highestSize);
        Thread thread2 = new Thread(test3);
        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        mdTime = getCurrentTime() - t;
    }

    @Override
    /*
     * This will override the thread so that it will do our basic test.
     * It should do the basic test at the same time it runs the 
     * test in the method allowing it to go faster.
     */
    public void run(){
            String a = "";
            for (int i = 0; i < highestSize; i ++){
                a = a + " ";  
            }
    }

    /*
     * Input: Should be fixed from Python file
     * This runs the multiprocess 
     */
    public static void main(String[] args) {
        JavaTest test = new JavaTest();
        test.highestSize = Long.parseLong(args[0]);
        test.mpHandler(Long.parseLong(args[0]));
        System.out.println("This is the speed for multiprocessing in Java in milliseconds: "+ test.mpTime);
        try{
            test.mdHandler(Long.parseLong(args[0]));
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("This is the speed for multithreading in Java in milliseconds: "+ test.mdTime);
    }

}