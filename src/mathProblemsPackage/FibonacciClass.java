package mathProblemsPackage;
import java.util.Arrays;
public class FibonacciClass {
    public static void main(String[] args) {
        //find 50 fibonacci numbers
        int fibo[] = new int[20];
        for (int i = 0; i < 20; i++) {
            if (i < 2) {
                fibo[i] = i;
            } else {
                fibo[i] = fibo[i-2] + fibo[i - 1];
            }//end of if else

        }//end of for loop
        System.out.println(Arrays.toString(fibo));
    }//end of main class
}