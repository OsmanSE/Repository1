package mathProblemsPackage;

public class FindMissingNumberClass {


    public static void main(String[] args) {
        int[] arr = new int[]{10,8,3,2,5,6,1,7,8,9};
        System.out.println(findMissing(arr,11));
    }
    public static int findMissing(int[] arr, int n) {
        int total = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += i;
        }
    for (int i=0; i<arr.length;i++){total+=i;}
return (sum-total);
}}
