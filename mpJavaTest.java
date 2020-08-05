public class mpJavaTest {
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
    public void basicTest(){
        a = a + " ";
    }


    /*
     * Input: size for string, needs to be a big number
     * Input should be fixed from reading python file function
     * Create multiprocessing in java should be very slow
     */
    public void mpHandler(dataSize){
        for (int i = 0; i < dataSize; i ++){
            
        }
    }


    public static void main(String[] args) {
        mpHandler(args[0]);
        mpJavaTest test = mpJavaTest();
        t = test.getCurrentTime();
        //mp handler method
        int mpTime = test.getCurrentTime() - t;
        System.out.println(mpTime);
    }

}