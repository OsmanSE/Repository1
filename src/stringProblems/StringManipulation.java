package stringProblems;

public class StringManipulation {
    public static void main(String[] args) {


    String str= "We are the java - selenium students or just java";


    String str2= "We are the java - selenium students or just Java";

        System.out.println(str.length());

        System.out.println(str.charAt(11));
        System.out.println(str.indexOf('j'));// first position of j
        System.out.println(str.indexOf('j')+" &  "+ str.indexOf('j',str.indexOf('j')+1));// second position of j
        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf("jama"));
        System.out.println(str.equals((str2)));
        System.out.println(str == str2);
        System.out.println(str.equalsIgnoreCase((str2)));
        System.out.println(str.substring(11));
        System.out.println(str.substring(0,10));
        String date="01-01-2019";
        System.out.println(date);
        date.replace('-','/');

        System.out.println(date.replace("-","/"));
        int a=100, b=200;
        String x="Hello";
        String y="World!";
        System.out.println(x+y);
        System.out.println(a+b);
        //jvm compile  from left to right
        //String concatination
        System.out.println(x+y+a+b);
        System.out.println(a+b+x+y);
    }
}