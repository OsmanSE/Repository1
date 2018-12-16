package mathProblemsPackage;

import java.util.Arrays;

public class FibonacciClass2 {

    public static void main(String[] args) {
        int[] fib=new int[30];
        for (int i=0;i<fib.length;i++) {
            if (i < 2) {
                fib[i] = i;
            } else {
                fib[i] = fib[i - 2] + fib[i - 1];}
        }
        System.out.println(Arrays.toString(fib));
    }

}
