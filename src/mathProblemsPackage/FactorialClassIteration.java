package mathProblemsPackage;

public class FactorialClassIteration {
    public static void main(String[] args) {
        //factorial of 5 using iteration
        int n=10;
        long result=1;
        for (int i=1;i<=n;i++){result*=i;
            }
        System.out.println("Result value = "+result);
    }
}
