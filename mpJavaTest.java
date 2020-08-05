public class mpJavaTest {
    long mpTime;

    String a = "";
    /*
     * Method to get the time
     */
    public long getCurrentTime() {
        return System.nanoTime();
    }

    /*
     * Input: size for string, needs to be a big number
     * Basic test to check run time
     */
    public void basicTest(size){
        for (int i = 0; i < dataSize; i ++){
            a = a + " ";  
        }
    }


    /*
     * Input: size for string, needs to be a big number
     * Input should be fixed from reading python file function
     * Create multiprocessing in java should be very slow
     */
    public void mpHandler(dataSize){
        t = test.getCurrentTime();
        basicTest(dataSize);
        mpTime = test.getCurrentTime() - t;
    }


    public static void main(String[] args) {
        mpJavaTest test1 = mpJavaTest();
        test1.mpHandler(args[0]);
        System.out.println("Run time for single process: "test1.mpTime);
    }

}